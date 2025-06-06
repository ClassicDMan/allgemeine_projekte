package kern.produktverwaltung.innensicht.technischesDatenmodell;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import kern.produktverwaltung.aussensicht.ProduktTO;

public class ProduktEntity implements Serializable{
	
	private static final long serialVersionUID = 1177245974454986995L;
		private int produktnummer;       
	    private String bezeichnung;      
	    private String beschreibung;    
	    private String bedingung;
	    
	    private Collection<Integer> policen; 

	    public ProduktEntity() {
	        this.policen = new ArrayList<Integer>();
	    }
	    
	    

	  
	    public ProduktEntity(int produktnummer, String bezeichnung, String beschreibung, String bedingung) {
			this.produktnummer = produktnummer;
			this.bezeichnung = bezeichnung;
			this.beschreibung = beschreibung;
			this.bedingung = bedingung;
			this.policen = new ArrayList<Integer>();
		}




		public ProduktTO toTO() {
	    	
	    	ProduktTO produktTO = new ProduktTO();

	        produktTO.setProduktnummer(this.getProduktnummer());
	        produktTO.setBezeichnung(this.getBezeichnung());
	        produktTO.setBeschreibung(this.getBeschreibung());
	        produktTO.setBedingung(this.getBedingung());

	        // Kopieren der Policen
	        for (Integer policenummer : this.getPolicen()) {
	            produktTO.addPolicen(policenummer);
	        }
	        return produktTO;

	    	
	    }
	    
	    public ProduktEntity(ProduktTO einproduktTO) {
	    	this.produktnummer = einproduktTO.getProduktnummer();
	    	this.bezeichnung = einproduktTO.getBezeichnung();
	    	this.beschreibung = einproduktTO.getBeschreibung();
	    	this.bedingung = einproduktTO.getBedingung();
	    }

	    
	    public int getProduktnummer() {
	        return produktnummer;
	    }

	    public void setProduktnummer(int produktnummer) {
	        this.produktnummer = produktnummer;
	    }

	    public String getBezeichnung() {
	        return bezeichnung;
	    }

	    public void setBezeichnung(String bezeichnung) {
	        this.bezeichnung = bezeichnung;
	    }

	    public String getBeschreibung() {
	        return beschreibung;
	    }

	    public void setBeschreibung(String beschreibung) {
	        this.beschreibung = beschreibung;
	    }

	    public String getBedingung() {
	        return bedingung;
	    }

	    public void setBedingung(String bedingung) {
	        this.bedingung = bedingung;
	    }

	    public Collection<Integer> getPolicen() {
	        return policen;
	    }

	    public void addPolicen(int policenummer) {
	        this.policen.add(Integer.valueOf(policenummer));
	    }

}
