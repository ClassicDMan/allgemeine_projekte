package LLL_18_Passing_Objects_to_Methods;

public class Main3 {					// Comparing Objects
	
static int add(int n1,int n2) {
		
		int n3 = n1+n2;
		return n3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Math n1 = new Math(2);
		Math n2 = new Math(3);
		
//		n1 = n2;		// this makes it equal, without it, they r not equal --> how can objects be equal to each other?
//		n1.val = 100;	// every change on of the objects, it will effect on the other
//		n2.val = 1;
//		
//		System.out.println(n2.val);
//		System.out.println(n1.val);
//		
//		if(n1 == n2)
//			System.out.println("Equal");
//		else
//			System.out.println("Not Equal");
		
		
		System.out.println(n1.isEqual(n2));			// change the numbers to check
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
