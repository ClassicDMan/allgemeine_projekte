package services.schadensmeldungsverwaltung.ports.primary;

import java.util.ArrayList;
import java.util.Collection;

import infrastructure.datastore.schadensmeldungsverwaltung.PoliceDAO;
import infrastructure.datastore.schadensmeldungsverwaltung.SchadensmeldungDAO;
import services.schadensmeldungsverwaltung.domain.Police;
import services.schadensmeldungsverwaltung.domain.Policenummer;
import services.schadensmeldungsverwaltung.domain.Praemienhoehe;
import services.schadensmeldungsverwaltung.domain.Schadendatum;
import services.schadensmeldungsverwaltung.domain.Schadenmeldung;
import services.schadensmeldungsverwaltung.domain.Schadennummer;
import services.schadensmeldungsverwaltung.domain.Schadenshoehe;
import services.schadensmeldungsverwaltung.domain.Schadensstatus;
import services.schadensmeldungsverwaltung.domain.Versichertennummer;
import services.schadensmeldungsverwaltung.ports.secondary.IPoliceRepository;
import services.schadensmeldungsverwaltung.ports.secondary.ISchadenmeldungRepository;

public class AppServiceSchadenmeldungGenerieren implements IServiceSchadenmeldungGenerieren {

	private static AppServiceSchadenmeldungGenerieren instance;

	private AppServiceSchadenmeldungGenerieren() {
		instance = this;
	}

	public static AppServiceSchadenmeldungGenerieren getInstance() {
		return (instance == null ? new AppServiceSchadenmeldungGenerieren() : instance);
	}

	@Override
	public void schadenmeldungAnlegen(String schadennummer, String schadenmeldungstag, String schadenmeldungsmonat,
			String schadenmeldungsjahr, double schadenshoehe, String schadensstatus, String policenummer) {

		IPoliceRepository policeRepository = PoliceDAO.getInstance();
		ISchadenmeldungRepository schadenmeldungsRepository = SchadensmeldungDAO.getInstance();

		Policenummer police = new Policenummer(policenummer);
		police = policeRepository.getPolicePerNummer(police);

		// Sicherheitsprüfung der Policenummer
		if (police.equals(null)) {
			System.out.println("Police mit Nummer " + policenummer + " nicht gefunden!");
			return;
		} else {
			int schadennummerInt = Integer.parseInt(schadennummer);
			boolean flag;
			do {
				flag = false;

				for (Schadenmeldung schaden : schadenmeldungsRepository.checkAlleSchaden()) {
					int existingSchadennummer = Integer.parseInt(schaden.getSchadennummer().getSchadennummer());
					if (existingSchadennummer == schadennummerInt) {
						flag = true;
						schadennummerInt++;
						break;
					}
				}

			} while (flag);

			String verfuegbareSchadennummer = String.valueOf(schadennummerInt);

			Schadennummer schadenNummer = new Schadennummer(verfuegbareSchadennummer);
			Schadendatum schadenDatum = new Schadendatum(schadenmeldungstag, schadenmeldungsmonat, schadenmeldungsjahr);
			Schadenshoehe schadenHoehe = new Schadenshoehe(schadenshoehe);
			Schadensstatus schadenStatus = Schadensstatus.fromString(schadensstatus);

			Schadenmeldung schadenmeldung = new Schadenmeldung(schadenNummer, schadenDatum, schadenHoehe, schadenStatus,
					police);
			boolean schadenFlag = schadenmeldungsRepository.schadenDatenAnlegen(schadenmeldung);

			if (schadenFlag) {
		        System.out.println("Schadenmeldung wurde in SV_DB S erfolgreich angelegt");
		        boolean f =  policeRepository.policedatenAktualisieren(schadenNummer , police, schadenHoehe);
		        if(f) {
			        System.out.println("Schadenmeldung wurde in SV_DB P erfolgreich angelegt");
			     // Domain Event
					boolean policeFlag = schadenmeldung.schadenmeldungAnlegen(schadenmeldung);
					if (policeFlag) {
						System.out.println("Policeverwaltung erfolgreich aktualisiert");
					} else {
						System.out.println("abgebrochen");
					}
		        }
				
			}

		}

	}

	@Override
	public Collection<PoliceTOO> policenAnzeigen() {

		IPoliceRepository policeRepository = PoliceDAO.getInstance();

		Collection<PoliceTOO> ergebnisListe = new ArrayList<>();
		Collection<Police> policeListe = policeRepository.getAllePolicen();

		if (!policeListe.isEmpty()) {

			for (Police police : policeListe) {

				PoliceTOO policeTO = new PoliceTOO(new Policenummer(police.getPolicenummer().getPolicenummer()),
						new Praemienhoehe(police.getPraemienhoehe().getPraemiehoehe()),
						new Versichertennummer(police.getVersicherternummer().getVersichertennummer()));
				ergebnisListe.add(policeTO);

				System.out.println(String.format("Police:Nr: %-10s Prämienhöhe: %-10s Versicherter:Nr: %-10s",
						policeTO.getPolicenummer().getPolicenummer(), policeTO.getPraemienhoehe().toString(),
						policeTO.getVersicherternummer().getVersichertennummer()));
			}

			System.out.println("Policen gefunden: " + policeListe.size());
			return ergebnisListe;

		} else {
			System.out.println("Keine Policen gefunden.");
			return ergebnisListe;
		}

	}

}
