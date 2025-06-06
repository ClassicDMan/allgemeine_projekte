package LLL_25_abstraction;

public class Main {
	
	static void fun1(SUV obj) {
		obj.autopilot();
		
	}
	
	static void fun2(Hatchback obj) {
		obj.autopilot();
		
	}
	
	static void fun(Car obj) {			// u don't need the other two methods, u just need this method (polymorphism)
		obj.autopilot();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Car car1 = new Car();			// it doesn't work because Car Class is abstract
										// i can't define an Object from the abstract class
		
		
		SUV car1 = new SUV();
		car1.autopilot();										// SUV autopilot
		Car car2 = new Hatchback();		// polymorphissm
		car2.autopilot();										// Hatchback autopilot
		Car car3 = new SUV();			// polymorphissm
		car3.autopilot();										// SUV autopilot
		System.out.println();
		
		
		fun1(new SUV());										// SUV autopilot
		fun2(new Hatchback());									// Hatchback autopilot
		fun(new SUV());											// SUV autopilot
		fun(new Hatchback());									// Hatchback autopilot
		
		System.out.println();
		
		fun(new SUVBilal());									// SUVAli autopilot
		
		System.out.println();
		
		Car car4 = new SUVBilal();
		Car car5 = new Hatchback();
		fun(car4);												// SUVAli autopilot
		fun(car5);												// Hatchback autopilot
		System.out.println();
		Car car6;
		car6 = new SUV();
		car6.m1();												// m1() SUV
		
		Car car7 = new SUVBilal();
		car7.autopilot();										// SUVAli
		car7.setHeight(2);
		car7.setNumberOfWheels(4);
		car7.setWeight(200);
		
		System.out.println();
		
		System.out.println(car7.toString());					// to String in Car
		
		Car car8 = new Hatchback(2f, 400f , 4);
		car8.streamingService();
		car8.parkingSensors();
		

		
	}

}
