package LLL_18_Passing_Objects_to_Methods;

public class CarMain {

	public static void main(String[] args) {
		// Copy Objects
		
		Car car1 = new Car("Chevrolet", "Camaro", 2021);	// Car@5a07e868 addressMemory
//		Car car2 = new Car("Ford", "Mustang", 2022);		// Car@76ed5528 addressMemory
		
//		car2 = car1;		XXXXXXXXXXXXXXXX			// they now have the same address Car@5a07e868 ( we don't do that)!!!!
		
//		car2.copy(car1);									// they now have different addresses, copy is successfully applied 
		Car car2 = new Car(car1);							// also copy is successfully applied
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());
	}

}
