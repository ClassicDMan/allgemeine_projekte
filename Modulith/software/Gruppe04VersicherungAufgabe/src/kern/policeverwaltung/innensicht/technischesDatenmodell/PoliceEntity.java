package kern.policeverwaltung.innensicht.technischesDatenmodell;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import kern.policeverwaltung.aussensicht.PoliceTO;
import kern.policeverwaltung.innensicht.technischesDatenmodell.types.Datum;
import kern.policeverwaltung.innensicht.technischesDatenmodell.types.VersicherungsartTyp;

public class PoliceEntity implements Serializable {
	
	private static final long serialVersionUID = -5265610748624882659L;
	
	protected int policenummer;
	protected VersicherungsartTyp versicherungsart;
	protected Datum versicherungsbeginn;
	protected Datum versicherungsende;
	protected double praemienhoehe;
	protected boolean istAktiv;
    
	protected int versicherternummer;
    Collection<Integer> produktennummer;
    Collection<Integer> schadennummer;
    
    
	public PoliceEntity() {
		this.produktennummer = new ArrayList<Integer>();
		this.schadennummer = new ArrayList<Integer>();
	}

		public PoliceEntity(int policenummer, String versicherungsart, String verBeginnTag, 
				String verBeginnMonat, String verBeginnJahr, String verEndTag, String verEndMonat, String verEndJahr,
				double praemienhoehe, boolean istAktiv, int versicherternummer) {

			this.policenummer = policenummer;
			this.versicherungsart = VersicherungsartTyp.fromString(versicherungsart);
			this.versicherungsbeginn = new Datum(verBeginnTag, verBeginnMonat, verBeginnJahr);
			this.versicherungsende = new Datum(verEndTag, verEndMonat, verEndJahr);
			this.praemienhoehe = praemienhoehe;
			this.istAktiv = istAktiv;
			this.versicherternummer = versicherternummer;
			this.produktennummer = new ArrayList<Integer>();
			this.schadennummer = new ArrayList<Integer>();
		}
		
		public PoliceEntity(PoliceTO einPoliceTO) {
			this.policenummer = einPoliceTO.getPolicenummer();
			this.versicherungsart = VersicherungsartTyp.fromString(einPoliceTO.getVersicherungsart());
			this.versicherungsbeginn = new Datum(einPoliceTO.getVerBeginnTag(), einPoliceTO.getVerBeginnMonat(), einPoliceTO.getVerBeginnJahr());
			this.versicherungsende = new Datum(einPoliceTO.getVerEndTag(), einPoliceTO.getVerEndMonat(), einPoliceTO.getVerEndJahr());
			this.praemienhoehe = einPoliceTO.getPraemienhoehe();
			this.istAktiv = einPoliceTO.getIstAktiv();
			this.versicherternummer = einPoliceTO.getVersicherternummer();
			
			this.produktennummer = new ArrayList<Integer>();
			this.schadennummer = new ArrayList<Integer>();
			for(Integer produktennr:einPoliceTO.getProdukten()) {
				this.produktennummer.add(produktennr);
			}
			for (Integer schadennr : schadennummer) {
				this.schadennummer.add(schadennr);
			}
		}

		// Methode zur Konvertierung in ein Transportobjekt (PoliceTO)
		public PoliceTO toTO() {
			// Umwandlung des Enums und Datums in ein Transportobjekt
			PoliceTO einPoliceTO = new PoliceTO();
			einPoliceTO.setPolicenummer(this.getPolicenummer());
			einPoliceTO.setVersicherungsart(this.getVersicherungsart().toString());
			einPoliceTO.setVerBeginnTag(this.getVersicherungsbeginnDatum().getTag());
			einPoliceTO.setVerBeginnMonat(this.getVersicherungsbeginnDatum().getMonat());
			einPoliceTO.setVerBeginnJahr(this.getVersicherungsbeginnDatum().getJahr());

			einPoliceTO.setVerEndTag(this.getVersicherungsendeDatum().getTag());
			einPoliceTO.setVerEndMonat(this.getVersicherungsendeDatum().getMonat());
			einPoliceTO.setVerEndJahr(this.getVersicherungsendeDatum().getJahr());

			einPoliceTO.setPraemienhoehe(this.getPraemienhoehe());
			einPoliceTO.setIstAktiv(this.getIstAktiv());
			einPoliceTO.setVersicherternummer(this.getVersicherternummer());
			
			for(Integer produktnr:this.getProdukten()) {
				einPoliceTO.addProdukt(produktnr);
			}
			return einPoliceTO;
		}

    public Datum getVersicherungsbeginnDatum() {
    	return versicherungsbeginn;
    }
    
    public Datum getVersicherungsendeDatum() {
    	return versicherungsende;
    }
    
    public void setVersicherungsbeginnDatum(Datum versicherungsbeginnDatum) {
    	this.versicherungsbeginn = versicherungsbeginnDatum;
    }
    
    public void setVersicherungsendeDatum(Datum versicherungsendeDatum) {
    	this.versicherungsende = versicherungsendeDatum;
    }
    
	public int getPolicenummer() {
		return policenummer;
	}
	
	public VersicherungsartTyp getVersicherungsart() {
        return versicherungsart;
    }

    public void setVersicherungsart(VersicherungsartTyp versicherungsart) {
        this.versicherungsart = versicherungsart;
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


	public void setPolicenummer(int policenummer) {
		this.policenummer = policenummer;
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


	public Collection<Integer> getProdukten() {
		return this.produktennummer;
	}
	
	public void addProdukt(int produktnummer) {
		this.produktennummer.add(Integer.valueOf(produktnummer));
	}
	
	public Collection<Integer> getSchaden() {
		return this.schadennummer;
	}
	
	public void addSchaden(int schadennummer) {
		this.schadennummer.add(Integer.valueOf(schadennummer));
	}


}
