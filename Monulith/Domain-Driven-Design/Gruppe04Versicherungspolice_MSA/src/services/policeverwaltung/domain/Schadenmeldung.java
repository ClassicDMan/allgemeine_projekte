package services.policeverwaltung.domain;

import java.util.Objects;

public class Schadenmeldung {

	Schadennummer schadennummer;
	String schadensBegruendung;
	String Schadensstatus;
	Policenummer policenummer;
	Versichertennummer versichertennummer;

	public Schadenmeldung(Schadennummer schadennummer, String schadensBegruendung, String schadensstatus,
			Policenummer policenummer, Versichertennummer versichertennummer) {
		this.schadennummer = schadennummer;
		this.schadensBegruendung = schadensBegruendung;
		Schadensstatus = schadensstatus;
		this.policenummer = policenummer;
		this.versichertennummer = versichertennummer;
	}

	public Schadennummer getSchadennummer() {
		return schadennummer;
	}

	public String getSchadensBegruendung() {
		return schadensBegruendung;
	}

	public String getSchadensstatus() {
		return Schadensstatus;
	}

	public Policenummer getPolicenummer() {
		return policenummer;
	}

	public Versichertennummer getVersichertennummer() {
		return versichertennummer;
	}

	public void setSchadennummer(Schadennummer schadennummer) {
		this.schadennummer = schadennummer;
	}

	public void setSchadensBegruendung(String schadensBegruendung) {
		this.schadensBegruendung = schadensBegruendung;
	}

	public void setSchadensstatus(String schadensstatus) {
		Schadensstatus = schadensstatus;
	}

	public void setPolicenummer(Policenummer policenummer) {
		this.policenummer = policenummer;
	}

	public void setVersichertennummer(Versichertennummer versichertennummer) {
		this.versichertennummer = versichertennummer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Schadensstatus, policenummer, schadennummer, schadensBegruendung, versichertennummer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schadenmeldung other = (Schadenmeldung) obj;
		return Objects.equals(Schadensstatus, other.Schadensstatus) && Objects.equals(policenummer, other.policenummer)
				&& Objects.equals(schadennummer, other.schadennummer)
				&& Objects.equals(schadensBegruendung, other.schadensBegruendung)
				&& Objects.equals(versichertennummer, other.versichertennummer);
	}

}
