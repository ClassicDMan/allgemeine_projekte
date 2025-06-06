package LLL_25_abstraction;

public abstract class SUVAli extends Car {

	@Override
	public void autopilot() {
		System.out.println("SUVAli");
	}

	public abstract void streamingService();

	public abstract void parkingSensors();

}
