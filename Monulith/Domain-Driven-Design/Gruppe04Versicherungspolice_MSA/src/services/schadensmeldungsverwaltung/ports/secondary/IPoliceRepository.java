package services.schadensmeldungsverwaltung.ports.secondary;

import java.util.Collection;

import services.schadensmeldungsverwaltung.domain.Police;
import services.schadensmeldungsverwaltung.domain.Policenummer;
import services.schadensmeldungsverwaltung.domain.Schadennummer;
import services.schadensmeldungsverwaltung.domain.Schadenshoehe;

public interface IPoliceRepository {
	
	boolean policedatenAktualisieren(Schadennummer schadenNummer, Policenummer police, Schadenshoehe schadenHoehe);
	void policedatenLoeschen(String policenummer, String versicherternummer);
	Collection<Police> getAllePolicen();
	public Policenummer getPolicePerNummer(Policenummer policenummer);
	void speichern(String policenummer, String versicherternummer, String pHoehe);
	void speichern(String policenummer, double schadenshoehe);
	

}
