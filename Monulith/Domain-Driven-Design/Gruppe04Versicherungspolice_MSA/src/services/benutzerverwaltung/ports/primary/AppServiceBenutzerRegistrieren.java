package services.benutzerverwaltung.ports.primary;

import infrastructure.datastore.benutzerverwaltung.BenutzerDAO;
import services.benutzerverwaltung.domain.Benutzer;
import services.benutzerverwaltung.domain.BenutzerId;
import services.benutzerverwaltung.ports.secondary.IBenutzerRepository;

public class AppServiceBenutzerRegistrieren implements IServiceBenutzerRegistrieren{
	
private static AppServiceBenutzerRegistrieren instance;
	
	private AppServiceBenutzerRegistrieren() {
		instance = this;
	}
	
	public static AppServiceBenutzerRegistrieren getInstance() {
		return(instance == null? new AppServiceBenutzerRegistrieren(): instance);
	}

	@Override
	public BenutzerTO registrieren(String benutzerid, String vorname, String nachname, String typ, String passwort,
			String alter) {
		
		IBenutzerRepository benutzerRepository = BenutzerDAO.getInstance();
		String alt = alter;
		BenutzerId benutzerId = new BenutzerId(benutzerid);
		
		Benutzer benutzerCheck = benutzerRepository.getBenutzerById(benutzerId);
		//benutzerCheck.getBenutzerid().getID().equals(benutzerId.getID())
		if(benutzerCheck != null && benutzerCheck.getBenutzerid().getID().equals(benutzerId.getID())) {
			System.out.println("Benutzer ID: " + benutzerId.getID() + " existiert bereits, wählen Sie eine andere ID Nummer");
			return null;
		}else {
			System.out.println("Benutzer wird registriert ...");
			Benutzer benutzer = benutzerRepository.benutzerdatenRegistrieren(benutzerId, vorname, nachname, typ, passwort);
			System.out.println("Benutzer erfolgreich registriert");
			benutzer = Benutzer.benutzerRegistrieren(benutzerId, vorname, nachname, typ, passwort);
			return new BenutzerTO(
					benutzer.getBenutzerid().getID(),
					benutzer.getVorname(),
					benutzer.getNachname(),
					benutzer.getTyp().toString(),
					benutzer.getPasswort(),
					alt
					);
		}
		
	}

}
