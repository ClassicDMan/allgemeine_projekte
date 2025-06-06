package services.policeverwaltung.domain;

public enum Versicherungsarttyp {
	KFZ, HAFTPFLICHT, HAUSRAT;

	@Override
	public String toString() {
		return name().toLowerCase();
	}

	public static Versicherungsarttyp fromString(String versicherungsart) {

		for (Versicherungsarttyp art : Versicherungsarttyp.values()) {
			if (art.toString().equalsIgnoreCase(versicherungsart)) {
				return art;
			}
		}
		// Falls nichts gefunden wird
		throw new IllegalArgumentException("Unbekannte Versicherungsart: " + versicherungsart);
	}

}
