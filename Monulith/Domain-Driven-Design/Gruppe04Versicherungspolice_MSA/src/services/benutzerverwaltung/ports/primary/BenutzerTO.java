package services.benutzerverwaltung.ports.primary;

import java.util.Objects;

public class BenutzerTO {
	
	private String benutzerid;
	private String vorname;
	private String nachname;
	private String typ;
	private String passwort;
	private String alter;
	
	public BenutzerTO(String benutzerid, String vorname, String nachname, String typ, String passwort, String alter) {
		this.benutzerid = benutzerid;
		this.vorname = vorname;
		this.nachname = nachname;
		this.typ = typ;
		this.passwort = passwort;
		this.alter = alter;
	}
	
	public BenutzerTO(String benutzerid, String vorname, String nachname, String typ, String passwort) {
		this.benutzerid = benutzerid;
		this.vorname = vorname;
		this.nachname = nachname;
		this.typ = typ;
		this.passwort = passwort;
		
	}

	public String getBenutzerid() {
		return benutzerid;
	}

	public String getVorname() {
		return vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public String getTyp() {
		return typ;
	}

	public String getPasswort() {
		return passwort;
	}

	public String getAlter() {
		return alter;
	}

	public void setBenutzerid(String benutzerid) {
		this.benutzerid = benutzerid;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public void setPasswort(String passwort) {
		this.passwort = passwort;
	}

	public void setAlter(String alter) {
		this.alter = alter;
	}

	@Override
	public int hashCode() {
		return Objects.hash(alter, benutzerid, nachname, passwort, typ, vorname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BenutzerTO other = (BenutzerTO) obj;
		return Objects.equals(alter, other.alter) && Objects.equals(benutzerid, other.benutzerid)
				&& Objects.equals(nachname, other.nachname) && Objects.equals(passwort, other.passwort)
				&& Objects.equals(typ, other.typ) && Objects.equals(vorname, other.vorname);
	}
	
	
	

}
