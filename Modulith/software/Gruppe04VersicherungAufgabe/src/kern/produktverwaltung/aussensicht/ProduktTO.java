package kern.produktverwaltung.aussensicht;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import kern.produktverwaltung.innensicht.technischesDatenmodell.ProduktEntity;


public class ProduktTO implements Serializable {
	
	private static final long serialVersionUID = 1563254445824259614L;
	
	private int produktnummer;       
    private String bezeichnung;      
    private String beschreibung;    
    private String bedingung;        
    
    private Collection<Integer> policen; 

    public ProduktTO() {
        this.policen = new ArrayList<Integer>();
    }

  
    public ProduktEntity toEntity() {
    	
    	ProduktEntity produktEntity = new ProduktEntity(
    			this.produktnummer,
    			this.bezeichnung,
    			this.beschreibung,
    			this.bedingung
    			);
    	
    	for (Integer policen: this.getPolicen()){
			produktEntity.getPolicen().add(policen);
		}
    	return produktEntity;
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
