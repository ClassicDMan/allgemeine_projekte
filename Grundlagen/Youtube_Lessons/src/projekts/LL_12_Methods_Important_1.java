package projekts;


																				//Methods-Functions:

public class LL_12_Methods_Important_1 {
	
	static void fun() {
		
		System.out.println("Juan");
		System.out.println("Kurdo");
		System.out.println("Welat");
		System.out.println("Kurdistan");
		
	}

	static int sumTwoNumbers(int n1, int n2) {				// in void can't return a value, change it to int to continue playing
		
		if (n1==0 && n2==0)						// u can change || to &&
		return n2;
		System.out.println("sum = " +( n1 + n2));
		
		int sum= n1 + n2;
		return sum;
////		^^^^^^^^^^^^
//		return n1+n2;		// it means the same code up there
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fun();
//		fun();
//		
		
		////////////////////////////////////
		
	System.out.println("sum n1,n2 = " + sumTwoNumbers(5,5));
	int s = sumTwoNumbers(5,5);
	s+=5;																				//change the void function to int and then it will work
	System.out.println("sum n1,n2 = " + s);
	System.out.println("sum n1,n2 = " + sumTwoNumbers(10,7));
	System.out.println("sum n1,n2 = " + sumTwoNumbers(25,4));
	////////////////////////////////////////
		
		sumTwoNumbers(2,0);
		sumTwoNumbers(7,7);											// i can just write the function's name with the numbers and it will be invoked, and printed down there
		sumTwoNumbers(0,0);											// if u wanna play u can hide the and unhide the codes to understand more
		sumTwoNumbers(4,0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
