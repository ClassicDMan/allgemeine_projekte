package persistence.policeverwaltung.aussensicht;

import java.util.Collection;

import kern.policeverwaltung.aussensicht.PoliceTO;


public interface IPoliceverwaltungDAO {
	
	public void policedatenAnlegen(PoliceTO policeTO);
	public PoliceTO policedatenSuchenPerNummer (int policenummer);
	public Collection<PoliceTO> policedatenSuchenPerAttribut (PoliceTO policeTO);
//	public Collection<PoliceTO> policedatenSuchenPerAttributSuchen (PoliceTO policeTO);
	public void policedatenLoeschen (PoliceTO policeTO);
	public void policedatenAendern (PoliceTO policeTO);

}
