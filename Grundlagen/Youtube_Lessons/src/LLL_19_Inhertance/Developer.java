package LLL_19_Inhertance;

public class Developer extends Employee {
	protected String projectName;

	public Developer() {
		System.out.println("Sub-Class");
	}

	public Developer(String name, String emailAdress, String phone, String department, String adress, int yearOfBirth,
			String projectName) {
//		super(name, emailAdress,phone,department,adress, yearOfBirth);	// read second line
		super();	// this invokes the no parameter constructor, Super must be written first in Constructor, because it is priority 1

		this.projectName = projectName;

	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
