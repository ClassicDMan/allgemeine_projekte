package Lesson_13_Recursion;

public class TestRecursion {

	/*
	 * Recursion = when The thing is defined in terms of itself. -Wikipedia 
	 * - apply the result of a procedure, to a procedure. 
	 * - A recursive method calls itself.
	 * - Can be a substitute for iteration. 
	 * - Divide the problem into sub problems of the same type as the original. 
	 * - Commonly used with advanced sorting algorithms and navigating trees.
	 * 
	 * Advantages: 
	 * - easier to read/write 
	 * - easier to debug
	 * 
	 * disadvantages: 
	 * - sometimes slower 
	 * - uses more memory
	 * 
	 * In computer science, a contact is a stack data structure that 
	 * stores information about the active subroutines of a computer program. 
	 * This kind of stack is also known as an execution stack, program stack, 
	 * control stack, runtime stack, or machine stack, and is often shortened to just “the stack”.
	 */
		
	public static void main(String[] args) {
		
		walk(5);
		System.out.println(fact(5));
		System.out.println(power(3, 4));
	}
		
	private static void walk(int steps) {
		
		if(steps < 1) {
			return;
		}
		System.out.println("you take a step");
		walk(steps - 1); // recursive
		
//		for (int i = 0; i < steps; i++) {
//			System.out.println("you take a step");
//		}
		
	}
	
	private static int fact(int zahl) {
		if(zahl < 1) {
			return 1;
		}
		
		return zahl * fact(zahl - 1);
		
	}
	
	private static int power(int base, int exponent) {
		if(exponent < 1) {
			return 1;
		}else {
			return base * power(base, exponent - 1);
		}
	}
	
	
	
}