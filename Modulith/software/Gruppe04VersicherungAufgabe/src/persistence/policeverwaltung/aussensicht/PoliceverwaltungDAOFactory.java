package persistence.policeverwaltung.aussensicht;

import persistence.policeverwaltung.innensicht.db.PoliceverwaltungDAO;

public class PoliceverwaltungDAOFactory {
	
	public IPoliceverwaltungDAO getKundenverwaltungDAO() {
		return new PoliceverwaltungDAO();
		
	}
}
