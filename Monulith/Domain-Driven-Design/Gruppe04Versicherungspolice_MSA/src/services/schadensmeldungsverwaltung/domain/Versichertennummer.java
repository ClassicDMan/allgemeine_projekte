package services.schadensmeldungsverwaltung.domain;

import java.util.Objects;

public class Versichertennummer {
	
	String versichertennummer;

	public Versichertennummer(String versichertennummer) {
		this.versichertennummer = versichertennummer;
	}

	public String getVersichertennummer() {
		return versichertennummer;
	}

	public void setVersichertennummer(String versichertennummer) {
		this.versichertennummer = versichertennummer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(versichertennummer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Versichertennummer other = (Versichertennummer) obj;
		return Objects.equals(versichertennummer, other.versichertennummer);
	}
	
	
	
	
	
	

}
