package services.versichertenverwaltung.ports.primary;

import java.util.ArrayList;
import java.util.Collection;

public class VersichertenTO {
	
	private String versichertennummer;
    private String vorname;
    private String nachname;
    private String ort;
    private String plz;
    private String strasse;
    private String strassenNummer;
    private String emailAdresse;
    private String telefonnummer;
    
	private Collection<String> policen;
	
	public VersichertenTO() {
		this.policen = new ArrayList<String>();
	}
    
	public VersichertenTO(String versichertennummer, String vorname, String nachname, String ort, String plz,
			String strasse, String strassenNummer, String emailAdresse, String telefonnummer) {
		
		this.versichertennummer = versichertennummer;
		this.vorname = vorname;
		this.nachname = nachname;
		this.ort = ort;
		this.plz = plz;
		this.strasse = strasse;
		this.strassenNummer = strassenNummer;
		this.emailAdresse = emailAdresse;
		this.telefonnummer = telefonnummer;
		
		this.policen = new ArrayList<String>();
	}
	
	
	public String getVersichertennummer() {
		return versichertennummer;
	}
	public String getVorname() {
		return vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public String getOrt() {
		return ort;
	}
	public String getPlz() {
		return plz;
	}
	public String getStrasse() {
		return strasse;
	}
	public String getStrassenNummer() {
		return strassenNummer;
	}
	public String getEmailAdresse() {
		return emailAdresse;
	}
	public String getTelefonnummer() {
		return telefonnummer;
	}
	public void setVersichertennummer(String versichertennummer) {
		this.versichertennummer = versichertennummer;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
	public void setPlz(String plz) {
		this.plz = plz;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public void setStrassenNummer(String strassenNummer) {
		this.strassenNummer = strassenNummer;
	}
	public void setEmailAdresse(String emailAdresse) {
		this.emailAdresse = emailAdresse;
	}
	public void setTelefonnummer(String telefonnummer) {
		this.telefonnummer = telefonnummer;
	}
	
	public Collection<String> getPolicen() {
		return policen;
	}

	public void addPolice(String police) {
		this.policen.add(police);
	}

}
