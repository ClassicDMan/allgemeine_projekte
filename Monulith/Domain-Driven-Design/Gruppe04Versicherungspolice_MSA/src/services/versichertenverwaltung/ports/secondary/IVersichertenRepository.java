package services.versichertenverwaltung.ports.secondary;

import java.util.Collection;

import services.versichertenverwaltung.domain.Versicherten;

public interface IVersichertenRepository {
	public Collection<Versicherten> getAlleVersicherten();
	public Versicherten getVersichrtenPerNummer(String versichertennummer);
	public void aktualisieren(String versicherternummer);
	public void versichertenAktualisieren(String policenummer, String versicherternummer);

}
