package services.benutzerverwaltung.ports.primary;

import infrastructure.datastore.benutzerverwaltung.BenutzerDAO;
import services.benutzerverwaltung.domain.Benutzer;
import services.benutzerverwaltung.domain.BenutzerId;
import services.benutzerverwaltung.ports.secondary.IBenutzerRepository;

public class AppServiceBenutzerEinloggen implements IServiceBenutzerEinloggen {
	
	private static AppServiceBenutzerEinloggen instance;
	
	private AppServiceBenutzerEinloggen() {
		instance = this;
	}
	
	public static AppServiceBenutzerEinloggen getInstance() {
		return(instance == null? new AppServiceBenutzerEinloggen(): instance);
	}

	@Override
	public void einloggen(String id, String passwort) {
		
		IBenutzerRepository benutzerrepository = BenutzerDAO.getInstance();
		BenutzerId benutzerId = new BenutzerId(id);
        Benutzer benutzer = benutzerrepository.getBenutzerById(benutzerId);
        
        if(!benutzer.getBenutzerid().equals(null)) {
        	System.out.println("Benutzergefunden");
        	if(benutzer.getPasswort().equals(passwort)) {
                System.out.println("Login erfolgreich. Willkommen, " + benutzer.getVorname() + "\tRolle: " + benutzer.getTyp());
                
                
//                benutzer = Benutzer.benutzerEinloggen(benutzerId);
                
        	}else {
        		System.out.println("Passwort Falsch eingegeben !!!");
        	}
        	
        }else {
        	System.out.println("Benutzer nicht gefunden !!!");
        }
        
        
		
	}
	

}
