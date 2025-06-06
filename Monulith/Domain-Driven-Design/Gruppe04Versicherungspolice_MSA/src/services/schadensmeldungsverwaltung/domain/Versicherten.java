package services.schadensmeldungsverwaltung.domain;

import java.util.Objects;

public class Versicherten {
	
	Versichertennummer versichertennummer;
	String vorname;
	String nachname;
	
	public Versicherten(Versichertennummer versichertennummer, String vorname, String nachname) {
		this.versichertennummer = versichertennummer;
		this.vorname = vorname;
		this.nachname = nachname;
		
	}
	public Versichertennummer getVersichertennummer() {
		return versichertennummer;
	}
	public void setVersichertennummer(Versichertennummer versichertennummer) {
		this.versichertennummer = versichertennummer;
	}
	public String getVorname() {
		return vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nachname, versichertennummer, vorname);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Versicherten other = (Versicherten) obj;
		return Objects.equals(nachname, other.nachname) && Objects.equals(versichertennummer, other.versichertennummer)
				&& Objects.equals(vorname, other.vorname);
	}

	
	
	

}
