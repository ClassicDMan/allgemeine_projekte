package LLL_18_Passing_Objects_to_Methods;

public class Car {
	private String make;
	private String model;
	private int year;

	public Car(String make, String model, int year) {

		this.make = make;
		this.model = model;
		this.year = year;
	}

	public Car(Car x) {
		this.copy(x);				// copy the Object (Car x) and pass it to the new Object Car
	}

	public void copy(Car x) {
		this.setMake(x.getMake());
		this.setModel(x.getModel());
		this.setYear(x.getYear());
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
