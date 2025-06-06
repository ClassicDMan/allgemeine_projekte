package LLL_26_interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

	static void interfaceMethod(SelfDrivable s) {
		s.drive();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
////		System.out.println(Movable.x);
//		
////		CarV1 c1 = new CarV1();
////		c1.numberOfPassengers = 2;
//		
////		Movable c1 = new CarV1();		
////		c1.moveDown();
//		
//		SelfDrivable c1 = new CarV1();
//		c1.drive();
		
//		
////		SelfDrivable c2 = new CarV2();
////		c2.drive();
//		
//		c1 = new CarV2();
//		c1.drive();					// re usability
		
//		interfaceMethod(new CarV1());
//		interfaceMethod(new CarV2());
//		
//		
//		//////////////////////////////////////////////////
//		
//		List list = new ArrayList();
		
		SelfDrivable c3 = new CarV1();

		if(c3 instanceof MarkerInterface) {			// MarkerInterface
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		SelfDrivable c4 = new CarV2();
		
		if(c4 instanceof MarkerInterface) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
		GenericInterface <Car> CarV1obj = new Car();
		List<Integer> list = new ArrayList();
		
//		Car car = CarV1obj.carModel();
		
//		Car car =(Car) CarV1obj.carModel();		// Casting
//		Car car = CarV1obj.carModel();		// after bulding templets in the Interface we don't need to Cast the CarV1obj
		
		
		
		
		
		
		
		
		
		
		
	}

}
