package services.versichertenverwaltung.ports.primary;

public class VersichertenummerTO {
	

	private String versicherternummer;

	public VersichertenummerTO(String versicherternummer) {
		this.versicherternummer = versicherternummer;
	}

	public String getVersicherternummer() {
		return versicherternummer;
	}

	public void setVersicherternummer(String versicherternummer) {
		this.versicherternummer = versicherternummer;
	}

}
