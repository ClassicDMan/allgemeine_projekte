package services.benutzerverwaltung.domain;

import java.util.Objects;

public class BenutzerId {
	
	private String benutzerID;
	
	public BenutzerId(String id) {
	    this.benutzerID = id; // Korrekte Zuweisung
	}
	
	public String getID() {
		return benutzerID;
	}

	public void setID(String benutzerID) {
		this.benutzerID = benutzerID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(benutzerID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BenutzerId other = (BenutzerId) obj;
		return benutzerID == other.benutzerID;
	}
	
	
	
	

}
