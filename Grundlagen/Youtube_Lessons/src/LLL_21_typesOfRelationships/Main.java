package LLL_21_typesOfRelationships;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonalInformation personalInfo = new PersonalInformation("Juan", "Abdulbaki", "Mahmoud", "O+", "198273", "Kurdish", 1993);
		Department dept = new Department(123, "IT");		// Unabhängig vom Objekt emp ---> Aggregation
		
		Employee emp1 = new Employee(4, 2000, "Juan", "Abdulbaki", "Mahmoud", "O+", "198273", "Kurdish", 1993, dept);	
		Employee emp2 = new Employee(4, 2000, "Juan", "Abdulbaki", "Mahmoud", "O+", "198273", "Kurdish", 1993, dept);
		Employee emp3 = new Employee(4, 2000, "Juan", "Abdulbaki", "Mahmoud", "O+", "198273", "Kurdish", 1993, dept);
		
//		Employee emp2 = new Employee(4, 2000, "Juan", "Abdulbaki", "Mahmoud", "O+", "198273", "Kurdish", 1993, dept);
		
		System.out.println(emp1);
		System.out.println(emp1.toString());
		
		
	}

}
