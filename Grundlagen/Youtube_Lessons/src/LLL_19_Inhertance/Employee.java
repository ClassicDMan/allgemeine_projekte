package LLL_19_Inhertance;

public class Employee {		// (Super Class) there isn't extends, but Employee inherited from the Class Object in Java
	protected String name;
	protected String emailAdress;
	protected String phone;
	protected String department;
	protected String adress;
	protected int yearOfBirth;

	public Employee() {
		System.out.println("No Parameter Constructor");
	}

	public Employee(String name, String emailAdress, String phone, String department, String adress, int yearOfBirth) {

		this.name = name;
		this.emailAdress = emailAdress;
		this.phone = phone;
		this.department = department;
		this.adress = adress;
		this.yearOfBirth = yearOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

}
