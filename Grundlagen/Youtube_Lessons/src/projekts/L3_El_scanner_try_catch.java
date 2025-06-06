package projekts;

import java.util.Scanner;

public class L3_El_scanner_try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub,
				 /* 
				  nextBoolean()
				  nextByte()
				  nextShort()
				  nextInt()
				  nextLong()
				  nextFloat()
				  nextDouble()
				  next()
				  nextLine()
				   
				  */
		
		Scanner in = new Scanner (System.in);
		
		/*
		float n1,n2;
		
		System.out.println("Please enter the first number:");
		n1=in.nextFloat();
		
		System.out.println("Please enter the second number");
		n2=in.nextFloat();
		
	//	System.out.println(" num 1 = " +n1  + "\n num 2 = " +n2);
		
		System.out.printf("num1 = %.2f \nnum2 = %.2f%n",n1,n2);
		
		 
		 * system.out.printf functions ( when u put it in the function printf, this will happen )
		 * d : [byte, short, int, long]
		 * f:[float, double]
		 * cC: Character Capital C will uppercase the letter
		 * sS: String Capital S will uppercase all the letters in the String
		 * n: new line ( like the example up there )
		 * */
		
		
			
			
		//}
//		System.out.print("Enter Number : ");
		
//		int f = in.nextInt();
		
//		System.out.println("number = " +f); *
		
		// next and next line 
		
//		System.out.println("Enter value for s:");
//		String s = in.next(); // next when it sees space tastatur it stops reading, but ( nextLine ) reads all, >>>>> try it 
//		System.out.printf ("s = %S",s);
		
		
		System.out.println("Enter value for s:");
		char s = in.next().charAt(0);
		System.out.printf ("s = %S",s);
		System.out.println();

		
		
		
		try {				// try statement allows you to define a block of code to be tested for errors while it is being executed .
			
				m();
				
			}catch(StackOverflowError x) {			// catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
				
				
				System.out.println("Anzahl Aufrufe bei Abbruch! :" + depth);
				
			}
		

	}
	
	private static int depth = 0;

	public static void m() {
		depth++;
		m();
		if(depth==200) {
			
			System.out.println(depth);
		}
	}
}	

