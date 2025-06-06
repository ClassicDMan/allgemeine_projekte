package infrastructure.messageBroker.versichertenverwaltung;

public class VersichertenQAO {
	
	private static VersichertenQAO instance;

	private VersichertenQAO() {
		instance = this;
	}

	public static VersichertenQAO getInstance() {
		return (instance == null ? new VersichertenQAO() : instance);
	}


}