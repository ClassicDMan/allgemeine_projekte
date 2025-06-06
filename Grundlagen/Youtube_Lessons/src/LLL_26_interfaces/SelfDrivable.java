package LLL_26_interfaces;

public interface SelfDrivable {
	
	void destination(String d);			// by default --> public abstract
	
	void drive();
	
	default void newMethod() {						// default method
		System.out.println("newMethod");			// interfaces methods that have the same signiture 
	}												//	( see interface Movable )
	
	
	

}
