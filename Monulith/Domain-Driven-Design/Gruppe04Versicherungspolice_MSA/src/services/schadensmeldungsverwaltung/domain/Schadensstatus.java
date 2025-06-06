package services.schadensmeldungsverwaltung.domain;

public enum Schadensstatus {
	OFFEN, IN_BEARBEITUNG, ABGESCHLOSSEN;

	@Override
	public String toString() {
		return name().toLowerCase();
	}

	public static Schadensstatus fromString(String statusInput) {
		switch (statusInput.toLowerCase()) {
		case "offen":
			return OFFEN;
		case "in_bearbeitung":
			return IN_BEARBEITUNG;
		case "abgeschlossen":
			return ABGESCHLOSSEN;
		default:
			throw new IllegalArgumentException("Ungültiger Schadenstatus: " + statusInput);
		}
	}

}
