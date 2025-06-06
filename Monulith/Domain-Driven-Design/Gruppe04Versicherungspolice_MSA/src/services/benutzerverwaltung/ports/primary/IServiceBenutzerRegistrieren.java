package services.benutzerverwaltung.ports.primary;

public interface IServiceBenutzerRegistrieren {
	
	public BenutzerTO registrieren(String id, String vorname, String nachname, String typ, String passwort, String alter);

}
