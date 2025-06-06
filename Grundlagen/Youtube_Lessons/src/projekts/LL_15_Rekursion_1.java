package projekts;

public class LL_15_Rekursion_1 {
	
	
	static int count = 0;
	
	static void fun() {
		
		if (count<5) {
		
		System.out.println("Hi");
		count++;
		fun();
		}
	}
	
	static int count1 = 0;
	
	static void fun1() {
		
		if (count1==5) {
		return;
		}
		
		System.out.println("Hallo");
		count1++;
		fun1();
		}
	
	static int fact(int n) {
		
		if(n==1||n==0)		// so that we don't get a an infinity result (stack flow)
			return 1;
		
		else
			return n * fact(n-1); 		//5 * fact(4)
											//4 * fact(3)
												//3* fact(2)	
													//2* fact(1)			
	}
	
	
	static void saltUpDown (int x) {
		if(x<1)
			return;
		else
			System.out.println("#Salt Up Down "+x);
			saltUpDown(x-1);							// Nummern Aufstiegend
	
	
	}
	
	static void saltDownUp (int y) {
		if(y<1)			// base case
			return;
		else
			saltDownUp(y-1);
				
//				   fun(5)//5	print dann return     the end
//				 		fun(4)//4	print dann return
//				 			fun(3)//3	print dann return
//				 				fun(2)//2	print dann return
//				 					fun(1) //1	print dann return
//				 						fun(0)	ist 0<1, ja, dann return
			System.out.println("#Salt Down Up "+y);			// Nummern Abstiegend
	
	}
	
	
	
//there is two types of recursion :
//	1.Direct Recursion
//	2.indirect Recursion
//	
//	1.Direct Recursion
//	static void directRecFun() {
//			some code....
//			directRecFun();
//			some code...		
//}
//	2.indirect Recursion
//	static void indirectRecFun1() {
//			some code....
//			indirectRecFun2();
//			some code...
//	}
//	static void indirectRecFun2() {
//			some code....
//			indirectRecFun1();
//			some code...		
//}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		//Recursion Methods
		*
		Recursion i in java is a process in which a method calls i
		A method in java that calls itself is called recursive m

		*/
		
		fun();
		fun1();
		System.out.println("\n" + "fact = " + fact(5));
	
		
		saltUpDown(5);
		
		saltDownUp(5);
		
		
	}

}
