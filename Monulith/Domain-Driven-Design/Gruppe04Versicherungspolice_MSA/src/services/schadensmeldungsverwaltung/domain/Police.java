package services.schadensmeldungsverwaltung.domain;

import java.util.Objects;

public class Police {
	Policenummer policenummer;
	Praemienhoehe praemienhoehe;
	Versichertennummer versicherternummer;
	
	public Police(Policenummer policenummer, Praemienhoehe praemienhoehe, Versichertennummer versicherternummer) {
		this.policenummer = policenummer;
		this.praemienhoehe = praemienhoehe;
		this.versicherternummer = versicherternummer;
	}
	
	public Police() {
		
	}
	public Policenummer getPolicenummer() {
		return policenummer;
	}
	public Praemienhoehe getPraemienhoehe() {
		return praemienhoehe;
	}
	public Versichertennummer getVersicherternummer() {
		return versicherternummer;
	}
	public void setPolicenummer(Policenummer policenummer) {
		this.policenummer = policenummer;
	}
	public void setPraemienhoehe(Praemienhoehe praemienhoehe) {
		this.praemienhoehe = praemienhoehe;
	}
	public void setVersicherternummer(Versichertennummer versicherternummer) {
		this.versicherternummer = versicherternummer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(policenummer, praemienhoehe, versicherternummer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Police other = (Police) obj;
		return Objects.equals(policenummer, other.policenummer) && Objects.equals(praemienhoehe, other.praemienhoehe)
				&& Objects.equals(versicherternummer, other.versicherternummer);
	}
	
	
	

	
	
	
	
}
