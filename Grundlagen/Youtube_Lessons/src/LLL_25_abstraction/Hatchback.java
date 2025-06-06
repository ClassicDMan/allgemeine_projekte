package LLL_25_abstraction;

public class Hatchback extends Car { // we have to implement abstract methods that are in super class with extends
										// ...

	public Hatchback(float f, float g, int i) {
		super();
	}

	public Hatchback() {

	}

	@Override
	public void autopilot() {
		System.out.println("Hatchback autopilot");
	}

	@Override
	public void streamingService() {
		System.out.println("Hatchback streamingService");
	}

	@Override
	public void parkingSensors() {
		System.out.println("Hatchback parkingSensors");
	}

}
