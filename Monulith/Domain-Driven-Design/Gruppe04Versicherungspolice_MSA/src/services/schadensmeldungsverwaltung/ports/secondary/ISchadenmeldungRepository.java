package services.schadensmeldungsverwaltung.ports.secondary;

import java.util.Collection;

import services.schadensmeldungsverwaltung.domain.Schadenmeldung;
import services.schadensmeldungsverwaltung.domain.Schadennummer;

public interface ISchadenmeldungRepository {
	public boolean schadenDatenAnlegen(Schadenmeldung schadensdaten);
	public Collection <Schadenmeldung> getAlleSchadenmeldungen();
	public Schadenmeldung getSchadenmeldungBySchadennummer(Schadennummer schadenmeldungnummer);
	public void schadenDatenAendern(Schadenmeldung schadensdaten);
	public Collection<Schadenmeldung> checkAlleSchaden();
	public void policedatenLoeschen(String policenummer, String versicherternummer);


}
