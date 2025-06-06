package LLL_20_polymorphism;

public class HourlyEmployee extends Employee {
	private float workOurPrice;
	private int hourlyRate;

	public HourlyEmployee() {
	}

	public HourlyEmployee(String name, String address, String department, String email, float salary,
			float workOurPrice, int hourlyRate) {
		super(name, address, department, email, salary);
		this.workOurPrice = workOurPrice;
		this.hourlyRate = hourlyRate;
	}

	public float getWorkOurPrice() {
		return workOurPrice;
	}

	public void setWorkOurPrice(float workOurPrice) {
		this.workOurPrice = workOurPrice;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public float getSalary() {
		return workOurPrice * hourlyRate;
	}

	@Override
	public void print() {
		System.out.println("HourlyEmployee");
		// from the super and sub class it will run
	}

}
