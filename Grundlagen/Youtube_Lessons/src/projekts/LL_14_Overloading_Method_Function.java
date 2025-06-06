package projekts;

public class LL_14_Overloading_Method_Function {

	
	static int sum (int n1, int n2) {		//1
		return n1 + n2;
	}
	
	
	static float sum (float n1, float n2) {		//2
		return n1 + n2;
	}
	
	static float sum (int n1, float n2) {		//3
		return n1 + n2;
	}
	
	static float sum (float n1, int n2) {		//4
		return n1 + n2;
	}
	
	static float sum (long n1, int n2) {		//5			overloading
		return n1 + n2;
	}
	
	static void fun () {
	     System. out.print ("fun");
	 }
	 static void fun (int X) {
	     System. out.println( ("x = "+X));
	 }
	
	 
	public static void main(int num) {
		System.out.println(num);
	}

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Method Overloading
		 /*
		overloading allows different methods to have the same name,
		but different signatures where the signature can differ by
		 the number of input parameters or type of input parameters or both.
		Overloading is related to compile-time (or static) polymorphism.
		 */

		
	 System. out.println ("sum float signiture= "+sum (10.5f, 50.5f) );		// signature 2
	 
	 System.out.println("sum int signiture= "+sum(20,70) );			// signature 1
	 
	 System.out.println("sum int,float signiture= "+sum(20,80f) ); 		// signature 3
	 System.out.println("sum float,int signiture= "+sum(20f,80) );		// signature 4
	 
	 System.out.println("sum Long,int signiture= "+sum(40L,80) );		// signature 5
	 
	 fun(15);
	 fun();
	 
	 
	 main(500);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
