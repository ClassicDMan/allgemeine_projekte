package LLL_25_abstraction;

abstract public class Car {
	
//	abstract int y;			it doesn't work because we don't have abstract variables
//							- abstract and static doesn't come together
//							- abstract and private access modifier doesn't come together
	
	float height;
	float weight;
	int numberOfWheels;
	
	public abstract void autopilot();
	
	
	@Override
	public String toString() {
		return "Car [height=" + height + ", weight=" + weight + ", numberOfWheels=" + numberOfWheels + "]";
	}


	public abstract void streamingService();
	
	
	public abstract void parkingSensors();

	public void m1() {
		
	}
	// concrete methods
	
	public float getHeight() {				
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public float getWeight() {
		return weight;
	}


	public void setWeight(float weight) {
		this.weight = weight;
	}


	public int getNumberOfWheels() {
		return numberOfWheels;
	}


	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}


	public Car(float height, float weight, int numberOfWheels) {
		
		this.height = height;
		this.weight = weight;
		this.numberOfWheels = numberOfWheels;
	}


	public Car() {
		
	}
	
	
	
	

}
