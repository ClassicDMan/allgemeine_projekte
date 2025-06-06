package services.policeverwaltung.ports.secondary;

import java.util.Collection;

import services.policeverwaltung.domain.Versicherten;
import services.policeverwaltung.domain.Versichertennummer;

public interface IVersichertenRepository {
//	public Collection<Versicherten> getAlleVersicherten();
	public Versichertennummer getVersichrtenPerNummer(Versichertennummer versichertennummer);
	Collection<Versicherten> getAlleVersicherten();
	

}
