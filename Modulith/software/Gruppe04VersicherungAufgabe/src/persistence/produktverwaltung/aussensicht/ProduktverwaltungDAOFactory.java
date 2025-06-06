package persistence.produktverwaltung.aussensicht;


import persistence.produktverwaltung.innensicht.db.ProduktverwaltungDAO;

public class ProduktverwaltungDAOFactory {

 
    public IProduktverwaltungDAO getProduktverwaltungDAO() {
        return new ProduktverwaltungDAO();
    }
}
