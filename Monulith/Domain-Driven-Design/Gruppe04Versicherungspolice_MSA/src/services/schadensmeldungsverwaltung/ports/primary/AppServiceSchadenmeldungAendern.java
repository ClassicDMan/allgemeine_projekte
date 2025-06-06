package services.schadensmeldungsverwaltung.ports.primary;

import java.util.ArrayList;
import java.util.Collection;

import infrastructure.datastore.schadensmeldungsverwaltung.PoliceDAO;
import infrastructure.datastore.schadensmeldungsverwaltung.SchadensmeldungDAO;
import services.schadensmeldungsverwaltung.domain.Policenummer;
import services.schadensmeldungsverwaltung.domain.Schadendatum;
import services.schadensmeldungsverwaltung.domain.Schadenmeldung;
import services.schadensmeldungsverwaltung.domain.Schadennummer;
import services.schadensmeldungsverwaltung.domain.Schadenshoehe;
import services.schadensmeldungsverwaltung.domain.Schadensstatus;
import services.schadensmeldungsverwaltung.ports.secondary.IPoliceRepository;
import services.schadensmeldungsverwaltung.ports.secondary.ISchadenmeldungRepository;

public class AppServiceSchadenmeldungAendern implements IServiceSchadenmeldungAendern {

	private static AppServiceSchadenmeldungAendern instance;

	private AppServiceSchadenmeldungAendern() {
		instance = this;
	}

	public static AppServiceSchadenmeldungAendern getInstance() {
		return (instance == null ? new AppServiceSchadenmeldungAendern() : instance);
	}

	@Override
	public SchadenmeldungTO schadenmeldungPerNummerLiefern(String schadenmeldungnummer) {

		ISchadenmeldungRepository schademeldungRepository = SchadensmeldungDAO.getInstance();
		Schadennummer schadennummer = new Schadennummer(schadenmeldungnummer);
		Schadenmeldung schadenmeldung = schademeldungRepository.getSchadenmeldungBySchadennummer(schadennummer);

		if (!schadenmeldung.equals(null)) {
			SchadenmeldungTO schadenmeldubgTO = schadenmeldung.toSchadenmeldungTO(schadenmeldung);
			schademeldungRepository.schadenDatenAendern(schadenmeldung);
			return schadenmeldubgTO;
		} else {
			System.out.println("Keine Schadenmeldung mit der Nummer " + schadenmeldungnummer + " gefunden.");
			return null;
		}

	}

	@Override
	public Collection<SchadenmeldungTO> alleSchadenmeldungenAnzeigen() {
		Collection<SchadenmeldungTO> ergebnisListe = new ArrayList<>();

		ISchadenmeldungRepository schademeldungRepository = SchadensmeldungDAO.getInstance();
		Collection<Schadenmeldung> schadenmeldungListe = schademeldungRepository.getAlleSchadenmeldungen();
		if (!schadenmeldungListe.isEmpty()) {
			for (Schadenmeldung schadenmeldung : schadenmeldungListe) {
				SchadenmeldungTO schadenmeldungTO = schadenmeldung.toSchadenmeldungTO(schadenmeldung);
				ergebnisListe.add(schadenmeldungTO);
			}

			System.out.println("Gefundene Schadenmeldungen: " + ergebnisListe.size());
			return ergebnisListe;
		} else {
			System.out.println("keine Schadenmeldungen gefunden !!!");
			return null;
		}

	}

	@Override
	public void schadenmeldungAendern(SchadenmeldungTO schadenmeldungTO) {
		ISchadenmeldungRepository schademeldungRepository = SchadensmeldungDAO.getInstance();
		IPoliceRepository policeRepository = PoliceDAO.getInstance();

		Schadennummer schadennummer = new Schadennummer(schadenmeldungTO.getSchadennummer());
		Schadendatum datum = new Schadendatum(schadenmeldungTO.getSchadenmeldungsTag(),
				schadenmeldungTO.getSchadenmeldungsMonate(), schadenmeldungTO.getSchadenmeldungsJahr());

		Schadenshoehe schadenshoehe = new Schadenshoehe(schadenmeldungTO.getSchadenshoehe());
		String statusInput = schadenmeldungTO.getSchadensstatus();

		Schadensstatus status = Schadensstatus.fromString(statusInput);

		Policenummer policenummer = new Policenummer(schadenmeldungTO.getPolicenummer());

		Schadenmeldung schadenmeldung = new Schadenmeldung(schadennummer, datum, schadenshoehe, status, policenummer);

		boolean flag = true;
		if (flag){
			schademeldungRepository.schadenDatenAendern(schadenmeldung);
			System.out.println("Daten inder Datenbank abgelegt");
			policeRepository.speichern(policenummer.getPolicenummer().toString(), schadenshoehe.getSchadenshoehe());
			boolean flagH = true;
			if(flagH) {
				schadenmeldung.schadenmeldungBearbeiten(policenummer, schadennummer, statusInput.toString());
			}

		}
		
	}

}
