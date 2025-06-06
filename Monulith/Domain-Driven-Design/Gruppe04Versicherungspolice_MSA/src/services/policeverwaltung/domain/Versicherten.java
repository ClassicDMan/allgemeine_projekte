package services.policeverwaltung.domain;

import java.util.Objects;

import services.policeverwaltung.ports.primary.VersichertenTO;

public class Versicherten {
	
	Versichertennummer versicherternummer;
	String vorname;
	String nachname;
	public Versicherten(Versichertennummer versicherternummer, String vorname, String nachname) {
		super();
		this.versicherternummer = versicherternummer;
		this.vorname = vorname;
		this.nachname = nachname;
	}
	public Versichertennummer getVersicherternummer() {
		return versicherternummer;
	}
	public String getVorname() {
		return vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setVersicherternummer(Versichertennummer versicherternummer) {
		this.versicherternummer = versicherternummer;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nachname, versicherternummer, vorname);
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
		return Objects.equals(nachname, other.nachname) && Objects.equals(versicherternummer, other.versicherternummer)
				&& Objects.equals(vorname, other.vorname);
	}
	
	public VersichertenTO toVersichertenTO(Versicherten versicherter) {

		return new VersichertenTO(versicherter.getVersicherternummer().getVersicherternummer(),
				versicherter.getVorname(),
				versicherter.getNachname()
				);
	}
	
	

}
