package services.policeverwaltung.ports.primary;

import infrastructure.datastore.policeverwaltung.PoliceDAO;
import infrastructure.datastore.policeverwaltung.VersichertenDAO;
import services.policeverwaltung.domain.Datum;
import services.policeverwaltung.domain.Police;
import services.policeverwaltung.domain.Policenummer;
import services.policeverwaltung.domain.Praeminehoehe;
import services.policeverwaltung.domain.Versichertennummer;
import services.policeverwaltung.domain.Versicherungsarttyp;
import services.policeverwaltung.ports.secondary.IPoliceRepository;
import services.policeverwaltung.ports.secondary.IVersichertenRepository;

public class AppServicePoliceGenerieren implements IServicePoliceGeneriren {

	private static AppServicePoliceGenerieren instance;

	private AppServicePoliceGenerieren() {
		instance = this;
	}

	public static AppServicePoliceGenerieren getInstance() {
		return (instance == null ? new AppServicePoliceGenerieren() : instance);
	}
	
	

	@Override
	public void policeAnlegen(String policenummer, String versicherungsart, String versicherungsbeginnTag,
			String versicherungsbeginnMonat, String versicherungsbeginnJahr, String versicherungsendeTag,
			String versicherungsendeMonat, String versicherungsendeJahr, String praemienhoehe,
			String versicherternummer) {

		IVersichertenRepository versichertenRepository = VersichertenDAO.getInstance();
		IPoliceRepository policeRepository = PoliceDAO.getInstance();
		
		Versichertennummer versicherter = new Versichertennummer(versicherternummer);
		versicherter = versichertenRepository.getVersichrtenPerNummer(versicherter);

		// Sicherheitsprüfung der Policenummer
		if (versicherter.equals(null)) {
			System.out.println("Versicherter mit Nummer " + versicherternummer + " nicht gefunden!");
			return;
		}else {
			int policenummerInt = Integer.parseInt(policenummer);
		    boolean flag;
		    do {
		    	flag = false;

		        for (Police police : policeRepository.checkAllePolicen()) {
		            int existingPolicenummer = Integer.parseInt(police.getPolicenummer().getPolicenummer());
		            if (existingPolicenummer == policenummerInt) {
		            	flag = true; 
		                policenummerInt++;
		                break;
		            }
		        }
		    } while (flag);
		    
		    String verfuegbarePolicenummer = String.valueOf(policenummerInt);		
			
			Policenummer policeNummer = new Policenummer(verfuegbarePolicenummer);
			Versicherungsarttyp typ = Versicherungsarttyp.fromString(versicherungsart);
			Datum beginnDatum = new Datum(versicherungsbeginnTag, versicherungsbeginnMonat, versicherungsbeginnJahr);
			Datum endDatum = new Datum(versicherungsendeTag, versicherungsendeMonat, versicherungsendeJahr);
			Praeminehoehe praemie = new Praeminehoehe(praemienhoehe);
			Versichertennummer versichertennummer = versicherter;

			Police police = new Police(policeNummer, typ, beginnDatum, endDatum, praemie, versichertennummer);
			
			boolean policeFlag = policeRepository.policeDatenAnlegen(police);

			
			if(policeFlag) {
				System.out.println("Police wurde PV_DB erfolgreich angelegt");
				// Domain Event
				boolean versichertenFlag = police.policeAnlegen(policeNummer, typ, beginnDatum, endDatum, praemie, versichertennummer);
				if(versichertenFlag) {
					System.out.println("Versichertenverwaltung VV_DB erfolgreich aktualisiert.");
				}else {
					System.out.println("Versichertenverwaltung VV_DB Aktualisierung abgebrochen.");
				}
		        
			}
			
			

		}

	}

}
