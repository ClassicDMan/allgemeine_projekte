package services.versichertenverwaltung.domain;

import java.util.ArrayList;
import java.util.Collection;

import services.versichertenverwaltung.ports.primary.VersichertenTO;

public class Versicherten {
	
	 	private Versichertennummer versichertennummer;
	    private String vorname;
	    private String nachname;
	    private String ort;
	    private String plz;
	    private String strasse;
	    private String strassenNummer;
	    private String emailAdresse;
	    private String telefonnummer;
	    private CountPolice count;
	    
	    
		private Collection<Policenummer> policen;
		
		public Versicherten() {
			this.policen = new ArrayList<Policenummer>();
			this.count = null;
		}
	    
		public Versicherten(Versichertennummer versichertennummer, String vorname, String nachname, String ort, String plz,
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
		}
		
		public VersichertenTO toVersichertenTO() {
		    VersichertenTO versichertenTO = new VersichertenTO(
		        this.versichertennummer != null ? this.versichertennummer.getVersicherternummer() : null,
		        this.vorname,
		        this.nachname,
		        this.ort,
		        this.plz,
		        this.strasse,
		        this.strassenNummer,
		        this.emailAdresse,
		        this.telefonnummer
		    );

		    // Konvertiere die Policen
		    for (Policenummer police : this.policen) {
		        if (police != null) {
		            versichertenTO.addPolice(police.getPolicenummer());
		        }
		    }
		    return versichertenTO;
		}
		
		
		public Versichertennummer getVersichertennummer() {
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
		public void setVersichertennummer(Versichertennummer versichertennummer) {
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
		
		public Collection<Policenummer> getPolicen() {
			return policen;
		}

		public void addPolice(Policenummer police) {
			this.policen.add(police);
		}

		public CountPolice getCount() {
			return count;
		}

		public void setCount(CountPolice count) {
			this.count = count;
		}

}
