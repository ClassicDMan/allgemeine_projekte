package services.policeverwaltung.ports.primary;

import java.util.ArrayList;
import java.util.Collection;

import infrastructure.datastore.policeverwaltung.PoliceDAO;
import infrastructure.datastore.policeverwaltung.SchadenmeldungDAO;
import infrastructure.datastore.policeverwaltung.VersichertenDAO;
import services.policeverwaltung.domain.Police;
import services.policeverwaltung.domain.Policenummer;
import services.policeverwaltung.domain.Schadenmeldung;
import services.policeverwaltung.domain.Versicherten;
import services.policeverwaltung.domain.Versichertennummer;
import services.policeverwaltung.ports.secondary.IPoliceRepository;
import services.policeverwaltung.ports.secondary.ISchadenmeldungRepository;
import services.policeverwaltung.ports.secondary.IVersichertenRepository;

public class AppServicePoliceEntfernen implements IServicePoliceEntfernen {

	private static AppServicePoliceEntfernen instance;

	private AppServicePoliceEntfernen() {
		instance = this;
	}

	public static AppServicePoliceEntfernen getInstance() {
		return (instance == null ? new AppServicePoliceEntfernen() : instance);
	}

	@Override
	public void policeKuendigen(String policenummer, String versichertennummer) {

		ISchadenmeldungRepository schadenmeldungRepository = SchadenmeldungDAO.getInstance();

		Collection<Schadenmeldung> schadenmeldungen = schadenmeldungRepository.getAlleSchadenmeldungen();

		IPoliceRepository policeRepository = PoliceDAO.getInstance();

		if (!schadenmeldungen.isEmpty()) {
			
			
			for (Schadenmeldung schadenmeldung : schadenmeldungen) {
				
				if (schadenmeldung.getPolicenummer().toString().equals(policenummer.toString())) {
					
					if (!schadenmeldung.getSchadensstatus().equals("Abgeschlossen")) {
						System.out.println(
								"Die Police kann nicht gelöscht werden, da noch offene Schadenmeldungen existieren!");
						return;
					}
					Police police = new Police();
					police.setPolicenummer(new Policenummer(policenummer));
					police.setVersicherternummer(new Versichertennummer(versichertennummer));
					boolean loeschen = policeRepository.policeLoeschen(police);
					if (loeschen) {
						System.out.println("Police wurde erfolgreich gekuendigt");
						police.policeKuendigen(policenummer, versichertennummer);
					}
				
					
				}
				Police police = new Police();
				police.setPolicenummer(new Policenummer(policenummer));
				police.setVersicherternummer(new Versichertennummer(versichertennummer));
				boolean loeschen = policeRepository.policeLoeschen(police);
				if (loeschen) {
					System.out.println("Police wurde erfolgreich gekuendigt");
					police.policeKuendigen(policenummer, versichertennummer);
				}
				
				

			}
		} else {
			
			

		}
		

	}

	@Override
	public Collection<VersichertenTO> alleVersichertenAnzeigen() {
		IVersichertenRepository versichertenRepository = VersichertenDAO.getInstance();

		Collection<VersichertenTO> ergebnisListe = new ArrayList<>();
		Collection<Versicherten> versichertenListe = versichertenRepository.getAlleVersicherten();

		if (!versichertenListe.isEmpty()) {

			for (Versicherten versicherter : versichertenListe) {

				VersichertenTO versichertenTO = new VersichertenTO(
						versicherter.getVersicherternummer().getVersicherternummer(), versicherter.getVorname(),
						versicherter.getNachname());

				System.out.println("Versicherter: " + versichertenTO.getVersicherternummer() + "\t\t" + "Vorname: "
						+ versichertenTO.getVorname() + "\t\t" + ", Nachname: " + versichertenTO.getNachname());
			}
			System.out.println("Versicherte gefunden: " + versichertenListe.size());
			return ergebnisListe;
		} else {
			return null;
		}

	}

	@Override
	public Collection<PoliceTO> policenAnzeigen(String versichertennummer) {
		Collection<PoliceTO> ergebnisListe = new ArrayList<>();

		IPoliceRepository policeRepository = PoliceDAO.getInstance();

		Collection<Police> policeListe = policeRepository.suchePolice(versichertennummer);

		if (!policeListe.isEmpty()) {

			for (Police police : policeListe) {
				if (police.getVersicherternummer().getVersicherternummer().equals(versichertennummer)) {

					PoliceTO policeTO = police.toPoliceTO(police);
					ergebnisListe.add(policeTO);
				}
			}

			if (!ergebnisListe.isEmpty()) {
				System.out.println("Gefundene Policen: " + ergebnisListe.size());
			} else {
				System.out.println();
			}
		} else {
			System.out.println("Keine Policen gefunden!");
		}

		return ergebnisListe;

	}

}
