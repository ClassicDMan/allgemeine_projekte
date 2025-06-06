package services.schadensmeldungsverwaltung.domain;

import java.util.Objects;

public class Schadennummer {
	
	private String schadennummer;

	public Schadennummer(String schadennummer) {
		this.schadennummer = schadennummer;
	}

	public String getSchadennummer() {
		return schadennummer;
	}

	public void setSchadennummer(String schadennummer) {
		this.schadennummer = schadennummer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(schadennummer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schadennummer other = (Schadennummer) obj;
		return Objects.equals(schadennummer, other.schadennummer);
	}

	
	
	

}
