package services.policeverwaltung.ports.primary;

import java.util.ArrayList;
import java.util.Collection;

public class PoliceTO {
	
    private String policenummer;
    private String versicherungsart;
    private String versicherungsbeginnTag;
    private String versicherungsbeginnMonat;
    private String versicherungsbeginnJahr;
    private String versicherungsendeTag;
    private String versicherungsendeMonat;
    private String versicherungsendeJahr;
    private String praemienhoehe;
    private String versicherternummer;
    
    private Collection<String> zugehoerigeProdukte;
    private Collection<String> schadenmeldungen;
	
    public PoliceTO(
            String policenummer,
            String versicherungsart,
            String versicherungsbeginnTag,
            String versicherungsbeginnMonat,
            String versicherungsbeginnJahr,
            String versicherungsendeTag,
            String versicherungsendeMonat,
            String versicherungsendeJahr,
            String praemienhoehe,
            String versicherternummer
    ) {
        this.policenummer = policenummer;
        this.versicherungsart = versicherungsart;
        this.versicherungsbeginnTag = versicherungsbeginnTag;
        this.versicherungsbeginnMonat = versicherungsbeginnMonat;
        this.versicherungsbeginnJahr = versicherungsbeginnJahr;
        this.versicherungsendeTag = versicherungsendeTag;
        this.versicherungsendeMonat = versicherungsendeMonat;
        this.versicherungsendeJahr = versicherungsendeJahr;
        this.praemienhoehe = praemienhoehe;
        this.versicherternummer = versicherternummer;

        this.schadenmeldungen = new ArrayList<>();
        this.zugehoerigeProdukte = new ArrayList<>();
    }
	
	public PoliceTO() {
		this.zugehoerigeProdukte = new ArrayList<String>();
		this.schadenmeldungen = new ArrayList<String>();
	}

	// Getter-Methoden
    public String getPolicenummer() {
        return policenummer;
    }

    public String getVersicherungsart() {
        return versicherungsart;
    }

    public String getVersicherungsbeginnTag() {
        return versicherungsbeginnTag;
    }

    public String getVersicherungsbeginnMonat() {
        return versicherungsbeginnMonat;
    }

    public String getVersicherungsbeginnJahr() {
        return versicherungsbeginnJahr;
    }

    public String getVersicherungsendeTag() {
        return versicherungsendeTag;
    }

    public String getVersicherungsendeMonat() {
        return versicherungsendeMonat;
    }

    public String getVersicherungsendeJahr() {
        return versicherungsendeJahr;
    }

    public String getPraemienhoehe() {
        return praemienhoehe;
    }

    public String getVersicherternummer() {
        return versicherternummer;
    }

    public Collection<String> getZugehoerigeProdukte() {
        return zugehoerigeProdukte;
    }

    public Collection<String> getSchadenmeldungen() {
        return schadenmeldungen;
    }

    // Setter-Methoden
    public void setPolicenummer(String policenummer) {
        this.policenummer = policenummer;
    }

    public void setVersicherungsart(String versicherungsart) {
        this.versicherungsart = versicherungsart;
    }

    public void setVersicherungsbeginnTag(String versicherungsbeginnTag) {
        this.versicherungsbeginnTag = versicherungsbeginnTag;
    }

    public void setVersicherungsbeginnMonat(String versicherungsbeginnMonat) {
        this.versicherungsbeginnMonat = versicherungsbeginnMonat;
    }

    public void setVersicherungsbeginnJahr(String versicherungsbeginnJahr) {
        this.versicherungsbeginnJahr = versicherungsbeginnJahr;
    }

    public void setVersicherungsendeTag(String versicherungsendeTag) {
        this.versicherungsendeTag = versicherungsendeTag;
    }

    public void setVersicherungsendeMonat(String versicherungsendeMonat) {
        this.versicherungsendeMonat = versicherungsendeMonat;
    }

    public void setVersicherungsendeJahr(String versicherungsendeJahr) {
        this.versicherungsendeJahr = versicherungsendeJahr;
    }

    public void setPraemienhoehe(String praemienhoehe) {
        this.praemienhoehe = praemienhoehe;
    }

    public void setVersicherternummer(String versicherternummer) {
        this.versicherternummer = versicherternummer;
    }

    public void setZugehoerigeProdukte(Collection<String> zugehoerigeProdukte) {
        this.zugehoerigeProdukte = zugehoerigeProdukte;
    }

    public void setSchadenmeldungen(Collection<String> schadenmeldungen) {
        this.schadenmeldungen = schadenmeldungen;
    }
	
	
	

}
