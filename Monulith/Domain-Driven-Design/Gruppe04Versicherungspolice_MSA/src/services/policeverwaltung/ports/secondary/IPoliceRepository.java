package services.policeverwaltung.ports.secondary;

import java.util.Collection;

import services.policeverwaltung.domain.Police;

public interface IPoliceRepository {
	
	public boolean policeDatenAnlegen(Police policedaten);
	public Collection<Police> getAllePolicen();
	public Collection<Police> checkAllePolicen();
	public boolean policeLoeschen(Police zuLoeschendePolice);
	public Collection<Police> suchePolice(String versichertennummer);

}
