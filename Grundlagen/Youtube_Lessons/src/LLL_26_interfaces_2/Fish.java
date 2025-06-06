package LLL_26_interfaces_2;

public class Fish implements Prey, Predetor{
	
	public void flee() {
		System.out.println("fish is fleeing");
	}
	public void hunt() {
		System.out.println("fish is hunting smaller fish");
	}
}
