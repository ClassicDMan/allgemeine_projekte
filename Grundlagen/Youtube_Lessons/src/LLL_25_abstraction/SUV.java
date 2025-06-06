package LLL_25_abstraction;

public class SUV extends Car {
	int x;
	
	
	
//	SUV(int x, int height, int weight, int numberOfWheels){
//		super(height, weight, numberOfWheels);
//		this.x = x;
//	}
////		this.height = height;
////		this.numberOfWheels = numberOfWheels;
////		this.weight = weight;
////	}
	
	
	@Override
	public void autopilot() {
		System.out.println("SUV autopilot");
	}
	@Override
	public void streamingService() {
		System.out.println("SUV streamingService");
	}
	@Override
	public void parkingSensors() {
		System.out.println("SUV parkingSensors");
	}
	@Override
	public void m1() {
		System.out.println("SUV m1");
	}

}
