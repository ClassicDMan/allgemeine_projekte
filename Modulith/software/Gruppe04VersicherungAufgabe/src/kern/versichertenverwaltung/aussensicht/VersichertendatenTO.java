package kern.versichertenverwaltung.aussensicht;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import kern.versichertenverwaltung.innensicht.technischesDatenmodell.VersichertendatenEntity;

public class VersichertendatenTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private int versichertennummer;
    private String vorname;
    private String nachname;
    private String ort;
    private String plz;
    private String strasse;
    private String strassenNummer;
    private String emailAdresse;
    private String telefonnummer;

    private Collection<Integer> policen;

    public VersichertendatenTO() {
        this.policen = new ArrayList<Integer>();
    }

    public VersichertendatenEntity toEntity() {
        VersichertendatenEntity entity = new VersichertendatenEntity(
            this.versichertennummer,
            this.vorname,
            this.nachname,
            this.ort,
            this.plz,
            this.strasse,
            this.strassenNummer,
            this.emailAdresse,
            this.telefonnummer
        );
        for (Integer police : this.policen) {
            entity.addPolice(police);
        }
        return entity;
    }

    // Getters and Setters

    public int getVersichertennummer() {
        return versichertennummer;
    }

    public void setVersichertennummer(int versichertennummer) {
        this.versichertennummer = versichertennummer;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getStrassenNummer() {
        return strassenNummer;
    }

    public void setStrassenNummer(String strassenNummer) {
        this.strassenNummer = strassenNummer;
    }

    public String getEmailAdresse() {
        return emailAdresse;
    }

    public void setEmailAdresse(String emailAdresse) {
        this.emailAdresse = emailAdresse;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public Collection<Integer> getPolicen() {
        return policen;
    }

    public void addPolice(Integer police) {
        this.policen.add(police);
    }
}
