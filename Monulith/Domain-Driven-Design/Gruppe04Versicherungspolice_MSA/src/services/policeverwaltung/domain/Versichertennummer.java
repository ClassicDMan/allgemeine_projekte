package services.policeverwaltung.domain;

import java.util.Objects;

public class Versichertennummer {
	
	private String versicherternummer;
	
	public Versichertennummer(String versicherternummer) {
		this.versicherternummer = versicherternummer;
	}
	public Versichertennummer() { }

	public String getVersicherternummer() {
		return versicherternummer;
	}

	public void setVersicherternummer(String versicherternummer) {
		this.versicherternummer = versicherternummer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(versicherternummer);
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
		return versicherternummer == other.versicherternummer;
	}
	
	

}
