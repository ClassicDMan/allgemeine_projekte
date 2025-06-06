package services.policeverwaltung.domain;

import java.util.Objects;

public class ProduktId {
	
	private String produktnummer;

	public String getProduktnummer() {
		return produktnummer;
	}

	public void setProduktnummer(String produktnummer) {
		this.produktnummer = produktnummer;
	}

	public ProduktId(String produktnummer) {
		super();
		this.produktnummer = produktnummer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(produktnummer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProduktId other = (ProduktId) obj;
		return Objects.equals(produktnummer, other.produktnummer);
	}
	
	
	
	

}
