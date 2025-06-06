package services.policeverwaltung.ports.primary;


public class VersichertenTO {
	
	String versicherternummer;
	String vorname;
	String nachname;
	
	public VersichertenTO(String versicherternummer, String vorname, String nachname) {

		this.versicherternummer = versicherternummer;
		this.vorname = vorname;
		this.nachname = nachname;
	}
	public String getVersicherternummer() {
		return versicherternummer;
	}
	public String getVorname() {
		return vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setVersicherternummer(String versicherternummer) {
		this.versicherternummer = versicherternummer;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	

}
