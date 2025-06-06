package LLL_26_interfaces;

public interface Movable {
	
	int x = 10;
	
	void moveUp();
	void moveDown();
	void moveRight();
	void moveLeft();
	void newMethod();		// abstract method, it must be implementet in CarV1
	
//	default void newMethodd() {					// same Method, then we will have Error in CarV1 because of this
//		System.out.println("newMethod");		// diamond problem, to solve it we can give the method here another name
//	}

//	static void newMethod() {				// body in the static method, is allowed
//		System.out.println("111");
//	}
	
	
	

}
