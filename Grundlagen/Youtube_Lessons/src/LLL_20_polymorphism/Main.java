package LLL_20_polymorphism;

public class Main {

	static void p (Employee e1) {
		e1.print();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*********e1-e2*********:\n");
		
		Employee e1 = new Employee("Juan", "DE", "IT", "JJJ@gmail.com", 1000);
		System.out.println("Employee e1 Salary= " + e1.getSalary());	//1000.0
		
		SalariedEmployee e2 = new SalariedEmployee("Juan", "DE", "IT", "JJJ@gmail.com", 1500, 200);
		System.out.println("SalariedEmployee e2 Salary = " + e2.getSalary());	//1700.0	
		
		e1 = new SalariedEmployee("Juan", "DE", "IT", "JJJ@gmail.com", 1500, 200);	
		System.out.println("Employee e1 = new SalariedEmployee(...) = " + e1.getSalary());	//1700.0 
		
//		object the super-class can call the[ common properties and  methods ( up-casting ) ] just the common one ok bro.
		
		System.out.println("e1.getSalary(): " + e1.getSalary());		// it works 
//		he can see the method because it is a common method between the super class and in the sub - class
		
//		e1.getBonus();		// it can't work
//		he can't see the method because the method is not common in the super
//		class and and the sub - class, if u want it to work than u have to create a method getBonus in the super class
		
		System.out.println("((SalariedEmployee)e1).getBouns(): " + ((SalariedEmployee)e1).getBouns());	// but here it is working, upcasting
		
		e1.x = 20;		// if the attribute is a common attribute between the super class and the sub - class it can work
		e2.x = 30;
		
		System.out.println("x in e1: " + e1.x);
		System.out.println("x in e2: " + e2.x);
		
		System.out.println();
		
//		//////////////////////////////////////////////////////////////////////////////////////
		System.out.println("*********e3 - e6:*********\n");
		DailyEmployee e3 = new DailyEmployee("Juan", "DE", "IT", "JJJ@gmail.com", 1000, 100,20);
		System.out.println("DailyEmployee e3 Salary = " + e3.getSalary());
		
		Employee e4 = new DailyEmployee("Juan", "DE", "IT", "JJJ@gmail.com", 1000, 100,20);
		System.out.println("Employee e4 = new DailyEmployee(...) Salary = " + e4.getSalary());
		if (e4 instanceof DailyEmployee) {
			DailyEmployee dailyEmployee = (DailyEmployee)e4;
			float dailyRate = dailyEmployee.getDailyRate();			// we can now call the method getDailyRate
			System.out.println("dailyRate = " + dailyRate);
		}
		
		HourlyEmployee e5 = new HourlyEmployee("Juan", "DE", "IT", "JJJ@gmail.com", 1000, 10 , 8);
		System.out.println("HourlyEmployee e5 Salary = " + e5.getSalary());
		
		e4 = new HourlyEmployee("Juan", "DE", "IT", "JJJ@gmail.com", 1000, 10 , 8);
		System.out.println("Employee e4 = new HourlyEmployee(...) Salary = " + e4.getSalary());
		e4 = (Employee)e4;
		System.out.println(e4.getSalary());
		
		System.out.println();
		
		Employee e6 = new SalariedEmployee();
		e6.print();					// it will run the base class ( Super Class), static method can't be Overrided
		
		///////////////////////
		System.out.println("*********e7 - e8:*********\n");
		Employee e7 = new Employee();
		SalariedEmployee e8 = new SalariedEmployee();
		e8.print();			// if u create an object in the super class and then create another object in the sub class
							// like this example ---> it will be overrided
		System.out.println();
		/////////////////////////////////////////////////
		////////////////////////////////////////////////
		System.out.println("*********e9 - e10:*********\n");
		
		
		
		Employee e9 = new SalariedEmployee();
		SalariedEmployee e10 = new SalariedEmployee();
		e9.print();			// SalariedEmployee
		e10.print();		// SalariedEmployee
		
		p(new Employee());
		p(new SalariedEmployee());
		p(new DailyEmployee());
		p(new HourlyEmployee());
		
		System.out.println();
		/////////////////////////////////////////////////////////////////////////////
		System.out.println("*********Array:*********\n");
//		Employee [] refArray = new Employee[] {new Employee(),new SalariedEmployee(), new DailyEmployee(), new HourlyEmployee()};
		Employee [] refArray = new Employee[4];
		
		refArray[0] = new Employee();
		refArray[1] = new SalariedEmployee();
		refArray[2] = new DailyEmployee();
		refArray[3] = new HourlyEmployee();
		
//		for (int i = 0; i < refArray.length; i++) {
//			refArray[i].print();
//		}
		
		
		for(Employee employee: refArray) {
			
//			e.print();			
			p(employee);
		}
		
		int x = 1 + 2;
		String f = "m" + "p";		// concat
		
		System.out.println(f);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
