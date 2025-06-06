package kern.policeverwaltung.aussensicht;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import kern.policeverwaltung.innensicht.technischesDatenmodell.PoliceEntity;


public class PoliceTO implements Serializable{

	private static final long serialVersionUID = 2380543180368816142L;
	
	private int policenummer;
    private String versicherungsart;
    private String verBeginnTag;
    private String verBeginnMonat;
    private String verBeginnJahr;
    private String verEndTag;
    private String verEndMonat;
    private String verEndJahr;
	private double praemienhoehe;
    private boolean istAktiv;
    
    private int versicherternummer;
    Collection<Integer> produktennummer;
    Collection<Integer> schadensnummer;

    //  Map<Integer, String> produktenw;
    public PoliceTO() {
    	this.produktennummer = new ArrayList<Integer>();
    	this.schadensnummer = new ArrayList<Integer>();
    }

    // gibt eine Police entity zurück
    public PoliceEntity toEntity() {
    	PoliceEntity policeEntity = new PoliceEntity(
    			this.policenummer, 
                this.versicherungsart,
                this.verBeginnTag, 
                this.verBeginnMonat, 
                this.verBeginnJahr, 
                this.verEndTag, 
                this.verEndMonat, 
                this.verEndJahr, 
                this.praemienhoehe, 
                this.istAktiv,
                this.versicherternummer
    			);
    	for (Integer produktnr:this.getProdukten()) 
    		policeEntity.getProdukten().add(produktnr);
    	for (Integer schadennr : this.getSchaden())
			policeEntity.getSchaden().add(schadennr);
		
		return policeEntity;
    }
    
    public void addVersicherten(int versicherternummer) {
    	this.versicherternummer = versicherternummer;
    }

	// Getters and Setters
	public int getPolicenummer() {
		return policenummer;
	}


	public String getVersicherungsart() {
		return versicherungsart;
	}

	public double getPraemienhoehe() {
		return praemienhoehe;
	}

	public boolean getIstAktiv() {
		return istAktiv;
	}


	public int getVersicherternummer() {
		return versicherternummer;
	}

    public String getVerBeginnTag() {
		return verBeginnTag;
	}

	public String getVerBeginnMonat() {
		return verBeginnMonat;
	}

	public String getVerBeginnJahr() {
		return verBeginnJahr;
	}

	public String getVerEndTag() {
		return verEndTag;
	}

	public String getVerEndMonat() {
		return verEndMonat;
	}

	public String getVerEndJahr() {
		return verEndJahr;
	}

	
	public void setPolicenummer(int policenummer) {
		this.policenummer = policenummer;
	}


	public void setVersicherungsart(String versicherungsart) {
		this.versicherungsart = versicherungsart;
	}

	
	public void setPraemienhoehe(double praemienhoehe) {
		this.praemienhoehe = praemienhoehe;
	}


	public void setIstAktiv(boolean istAktiv) {
		this.istAktiv = istAktiv;
	}


	public void setVersicherternummer(int versicherternummer) {
		this.versicherternummer = versicherternummer;
	}

	public void setVerBeginnTag(String verBeginnTag) {
		this.verBeginnTag = verBeginnTag;
	}

	public void setVerBeginnMonat(String verBeginnMonat) {
		this.verBeginnMonat = verBeginnMonat;
	}

	public void setVerBeginnJahr(String verBeginnJahr) {
		this.verBeginnJahr = verBeginnJahr;
	}

	public void setVerEndTag(String verEndTag) {
		this.verEndTag = verEndTag;
	}

	public void setVerEndMonat(String verEndMonat) {
		this.verEndMonat = verEndMonat;
	}

	public void setVerEndJahr(String verEndJahr) {
		this.verEndJahr = verEndJahr;
	}

	public Collection<Integer> getProdukten() {
		return this.produktennummer;
	}

	public void addProdukt(int produktnummer) {
		this.produktennummer.add(Integer.valueOf(produktnummer));
	}
	
	public Collection<Integer> getSchaden() {
		return this.schadensnummer;
	}

	public void addSchaden(int schadensnummer) {
		this.schadensnummer.add(Integer.valueOf(schadensnummer));
	}

}