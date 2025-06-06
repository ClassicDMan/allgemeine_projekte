package LLL_20_polymorphism;

public class SalariedEmployee extends Employee {
	private float bonus;

//	protected int x;		// example to make it clear see line 27 in main,
							// hide it here and let it in Employee, and see the changes if there is any change

	SalariedEmployee() {
	}

	public SalariedEmployee(String name, String address, String department, String email, float salary, float bonus) {
		super(name, address, department, email, salary);
		this.bonus = bonus;
	}

	public void setBouns(float bouns) {
		this.bonus = bouns;
	}
	public float getBouns() {
		return bonus;
	}


	@Override
	public float getSalary() {
		return super.getSalary() + bonus; // delete super.getSalary() and see what happens in e2 in Main
	}

	@Override
	public void print() {
		System.out.println("SalariedEmployee");
		// from the super and sub class it will run
	}

}
