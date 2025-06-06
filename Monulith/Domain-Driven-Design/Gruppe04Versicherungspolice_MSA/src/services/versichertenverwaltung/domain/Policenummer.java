package services.versichertenverwaltung.domain;

import java.util.Objects;

public class Policenummer {
	
	private String policenummer;

	public String getPolicenummer() {
		return policenummer;
	}

	public void setPolicenummer(String policenummer) {
		this.policenummer = policenummer;
	}
	
	

	public Policenummer(String policenummer) {
		this.policenummer = policenummer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(policenummer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Policenummer other = (Policenummer) obj;
		return policenummer == other.policenummer;
	}
	

}
