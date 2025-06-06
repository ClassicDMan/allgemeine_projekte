package LLL_20_polymorphism;

public class Polymorphism {
	/*
	 * Polymorphism means many forms.
	 * 
	 * It refers to the use of single type entity (methods, operator or object)
	 * to represent different operations(types) in different scenarios.
	 *  
	 * 
	 * Polymorphism uses those methods to perform different tasks. 
	 * This allows us to perform a single action in different ways.
	 * 
	 * We can achieve polymorphism in Java using the following ways:
	 * Method Overloading     and    Method Overriding.
	 * 
	 * 1- method Overloading:
	 * 
	 * this is an example of compile time (static polmorphism or early binding)
	 * 
	 * - It is used to achieve compile time polymorphism(early binding).
	 * It allows us to use the same method name but different signatures.
	 * 
	 * - If a class has more than one method with the same name but
	 *  a different method signature it is known as method overloading.
	 *  
	 * Example:
	 * @Overloading
	 * static int max (int a, int b){
	 * ...
	 * }
	 * static long max (long a, long b){
	 * ...
	 * }
	 * static long max (long a, long b, long c){
	 * ...
	 * }
	 * 
	 * Method overloading increases the readability of the program.
	 * Instead of creating method order1, order2, order3,
	 * No I will make methods with the same name order, but different signatures

	 * 
	 * 2- method Overriding:
	 * 
	 * This is an example of runtime (dynamic method dispatch or late binding)
	 * 
	 * Rules for Java method Overriding:
	 *1.	There must be an is a relationship(inheritance).
	 *2.	The method must have the same name as in the parent class.
	 *3.	The method must have the same parameters as in the parent class
	 *
	 * Examples u can find in the package.
	 * 
	 * 
	 */

}
