package persistence.versichertenverwaltung.aussensicht;

import persistence.versichertenverwaltung.innensicht.db.VersichertenverwaltungDAO;

public class VersichertenverwaltungDAOFactory {
	
	public IVersichertenverwaltungDAO getVersichertenverwaltungDAO() {
		return new VersichertenverwaltungDAO();
		
	}
	

}
