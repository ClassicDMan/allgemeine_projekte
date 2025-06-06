package kern.policeverwaltung.innensicht.technischesDatenmodell.types;

public enum VersicherungsartTyp {
	KFZ, HAFTPFLICHT, HAUSRAT;

	@Override
	public String toString() {
		return name().toLowerCase();
	}

	public static VersicherungsartTyp fromString(String versicherungsart) {

		for (VersicherungsartTyp art : VersicherungsartTyp.values()) {
			if (art.toString().equalsIgnoreCase(versicherungsart)) {
				return art;
			}
		}
		// Falls nichts gefunden wird
		throw new IllegalArgumentException("Unbekannte Versicherungsart: " + versicherungsart);
	}

}
