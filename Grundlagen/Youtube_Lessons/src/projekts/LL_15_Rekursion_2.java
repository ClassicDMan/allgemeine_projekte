package projekts;
//		Fibonacci Series
//		0 1 2 3 4 5 6  7  8  9 10 ...etc   
//		0 1 1 2 3 5 8 13 21 34 55 ...etc

public class LL_15_Rekursion_2 {

//	exp:1
	
//	static int fib (int n) {// n = for an example 4 then 
//		
//		if ( n == 0 || n == 1) // it will ask if n == 0 or == 1, so 4 doesn't it continues
//			return n ;
//		else
//			
//			return fib(n-1)+fib(n-2);// it comes here so fib(4-1) + fib(4-2)
////		it means fib 3 + fib 2 ----> 2 + 1 = 3
////		then     fib 2 + fib 1 ----> 1 + 1 = 2
////		then     fib 1 + fib 0 ----> 1 + 0 = 1 	
////		here 	n == 1 so it gives us 1
////		and 	0 gives us 0
////		---->---->---->----> so here 
////		fib(0)=0, 
////			fib(1)=1,
////					fib(2)=1,
////						fib(3)=2,
////							fib(4)= fib 3 + fib 2 = 2+ 1 = 3
//			
//			
//			
//	}

	
	
//	exp:2
//	static int n1=0,n2=1,n3;
//	static void PrintFib(int n) {
//		
//		if(n>0) {
//			
//			n3=n1+n2;
//			n1=n2;
//			n2=n3;
//			System.out.print(" "+n3);
//			PrintFib(n-1);
//		}
//	}
	
	
//	exp3: sum the numbers between two numbers:
	
	static int sum (int n1,int n2) {
		
		if (n1==n2)
			return n1;
		else {
		if(n1<n2)
			return n1 + sum(n1+1,n2);
		else
			return n1 + sum(n1-1,n2);
		
		
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		1:
//		System.out.println("fibonacci = " + fib(4));

		
		
//		2:
//		System.out.print(n1+" "+n2);
//		int num = 6;
//		PrintFib(num-2);
		
//		3:
		
		
		System.out.println("sum = " + sum(1,10));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
