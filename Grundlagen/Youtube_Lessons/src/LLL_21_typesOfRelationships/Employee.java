package LLL_21_typesOfRelationships;

public class Employee {
	private int id;
	private float salary;
	private PersonalInformation personalInfo; // instanz mit der name personalInfo relationship,
	private Department dept; // relationship

	public Employee(int id, float salary, String firstName, String middleName, String lastName, String bloodGroup,
			String accountNumber, String nationality, int yearOfBirth, Department dept) {

		this.id = id;
		this.salary = salary;
//		this.personalInfo = personalInfo;			//Aggregation
		this.personalInfo = new PersonalInformation(firstName, middleName, lastName, bloodGroup, accountNumber,
				nationality, yearOfBirth); // Composition ---> i reserved inside the class using the keyword new 
						// irt means if i created an object here and then deleted the it, the instanz will be deleted also
						// the reservation makes it special inside the class, it means a relationship that can not be break
						
		this.dept = dept;
		
//		dept.getDeptName();			// Association

	}

//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", salary=" + salary + ", personalInfo=" + personalInfo + ", dept=" + dept + "]";
//	}		// the to String in Department is hidden, go and activate it to see the changes here

	@Override			// Override means i bring a methode from inherited Class and adjust it
	public String toString() {
		return "Employee [id = " + id + ", salary = " + salary + ", personalInfo = " + personalInfo + ", DeptNo = " + dept.getDeptNo() + ", DeptName = " + dept.getDeptName() + "]";
	}
	
	
	
	

}
