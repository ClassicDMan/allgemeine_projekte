package LLL_27_anonymous;

import LLL_27_anonymous.MainTwo.Showable;

public class Anonymous {
	
	/* Anonymous 1:
	 * 
	 * Anonymous classes enable you to make your code more concise ( mokhtasar ).
	 * They enable you to declare and instantiate a class at the same time.
	 * They are like local classes except that they do not have a name. 
	 * 
	 * programmers prefer: Use them if you need to use a local class only once.
	 * 
	 *  An anonymous inner class in Java is an inner class which is declared without any class name at all.
	 *  In simple words,  a nameless inner class is called anonymous inner class
	 *  
	 *  You may use Java anonymous classes in three ways:
	 *  
	 *  1- anonymous inner class that extends a class( maybe abstract or concrete ).	Example Class MainOne 
	 *  		concrete Class: all the methods insides the class has a body.
	 *  		abstract class: not all the methods has a body.
	 *  2- anonymous inner class that implements an interface.				Example Class MainTwo
	 *  3- Anonymous inner class that defined as argument of method / constructor.		Example Class MainThree
	 *  
	 *  Anonymous Event listener: read about it more
	 *  
	 *  anonymous inner class:
	 *  1-
	 *  RewardClass emp3 = new RewardClass() {			
			@Override
			public void rewardMethod() {					//anonymous inner class
				System.out.println("your reward is $20");
			}
		};
		or
		
		 new RewardClass() {			//it is also possible to do that
			@Override
			public void rewardMethod() {					//anonymous inner class
				System.out.println("your reward is $20");
			}
		}.rewardMethod();;		add method name
	 *  
	 *  2-
	 *  Showable (Interface) showable;
		showable = new Showable() {
			
			@Override
			public void print(int x) {
				// TODO Auto-generated method stub
				System.out.println("Showable" + x);
			}
		};
		or
		
		Showable showable;
	 *  showable = y -> System.out.println("Showable" + y);
	 *  showable.print(4);
	 *  
	 *  3-
	 *  display( new Showable() {
			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Showable");
			}
		});
	 *  
	 *  
	 *  Anonymous 2:
	 *  
	 *  
	 */

}
