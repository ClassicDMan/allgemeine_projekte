package projekts;

public class L8_for_loop_control_flow_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		For Loop

		
		
//1
		
		
//		for(int c =60; c>0; c--) {			// for loop structure ( ... ;... ;...  ), pay attention to the ++c or c++ .
//			
//			System.out.println(c);
//			
//		} 
//		System.out.println(c);				 u can't print c because the int c is known inside the for loop,
//											 and the print code exists outside of the loop, if u wanna print it, then introduce int c outside the loop
		
//2
		
		
//			int c;
//			for( c =2; c<10; c+=2) 		// with out block and u have put int c outside the for world, try to solve the problem if u put int c inside the for loop
//			
//			System.out.println(c);			
//			System.out.println(c);
		
		
//3
			
		for (int i = 0, j = 5; i < 8 || j >= 0; i++,j--) {			// play with numbers and || | && & and variables 
			System.out.println("i = "+ i +"\t"+"j = "+ j );
		}
		
		System.out.println("Nothing");
		
		
		
		
		
		
		

	}

}
