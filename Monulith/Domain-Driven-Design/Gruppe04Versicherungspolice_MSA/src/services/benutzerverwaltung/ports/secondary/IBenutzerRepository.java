package services.benutzerverwaltung.ports.secondary;

import services.benutzerverwaltung.domain.Benutzer;
import services.benutzerverwaltung.domain.BenutzerId;

public interface IBenutzerRepository {
	public Benutzer getBenutzerById(BenutzerId benutzerid);

	public Benutzer benutzerdatenRegistrieren(BenutzerId benutzerId2, String vorname2, String nachname2, String typ2,
			String passwort2);

}
