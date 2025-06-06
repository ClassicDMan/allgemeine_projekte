package kern.versichertenverwaltung.innensicht.technischesDatenmodell;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import kern.versichertenverwaltung.aussensicht.VersichertendatenTO;

public class VersichertendatenEntity implements Serializable {

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

	public VersichertendatenEntity() {
		this.policen = new ArrayList<Integer>();
	}

	public VersichertendatenEntity(int versichertennummer, String vorname, String nachname, String ort, String plz,
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

		this.policen = new ArrayList<Integer>();
	}

	public VersichertendatenEntity(VersichertendatenTO einVersichertendatenTO) {
		
		this.versichertennummer = einVersichertendatenTO.getVersichertennummer();
		this.vorname = einVersichertendatenTO.getVorname();
		this.nachname = einVersichertendatenTO.getNachname();
		this.ort = einVersichertendatenTO.getOrt();
		this.plz = einVersichertendatenTO.getPlz();
		this.strasse = einVersichertendatenTO.getStrasse();
		this.strassenNummer = einVersichertendatenTO.getStrassenNummer();
		this.emailAdresse = einVersichertendatenTO.getEmailAdresse();
		this.telefonnummer = einVersichertendatenTO.getTelefonnummer();

		this.policen = new ArrayList<Integer>();
		for (Integer policenr:einVersichertendatenTO.getPolicen()) {
			this.policen.add(policenr);
		}
	}

	public VersichertendatenTO toTO() {
		VersichertendatenTO to = new VersichertendatenTO();
		to.setVersichertennummer(this.versichertennummer);
		to.setVorname(this.vorname);
		to.setNachname(this.nachname);
		to.setOrt(this.ort);
		to.setPlz(this.plz);
		to.setStrasse(this.strasse);
		to.setStrassenNummer(this.strassenNummer);
		to.setEmailAdresse(this.emailAdresse);
		to.setTelefonnummer(this.telefonnummer);
		
		for (Integer police : this.policen) {
			to.addPolice(police);
		}
		return to;
	}
	
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
