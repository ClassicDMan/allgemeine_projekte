package LLL_18_Passing_Objects_to_Methods;

public class Main2 {
						// Passing_Objects_to_Methods Part 2: returning Objects/ Comparing Objects in Main3

	static int add(int n1,int n2) {
		
		int n3 = n1+n2;
		return n3;
	}
	
	
	
	public static void main(String[] args) {
		// the goal is adding to numbers through a methode and an object ... etc
		
		int res = add(2,5);
		System.out.println("res = " + res);
		System.out.println();
		
		///////////////////////////
		
		Math n1 = new Math(2);
		Math n2 = new Math(5);
		Math n4 = new Math();
		
//		Math n3 = n4.add(n1, n2);		// without static we can call it like this    first way
		
//		Math n3 = Math.add(n1, n2);			// we put static, so we can call it like this    second way
		
		Math n3 = n1.add(n2);			// we build an method, go to Math to see it     third way
		
		System.out.println("n3 = " + n3.val );
		System.out.println("n4 = " + n4.val);		// the exist of n4 is just to help by adding in the first way
		
		

	}

}
