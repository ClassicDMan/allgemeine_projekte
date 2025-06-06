package projekts;

import java.util.Scanner;

public class L4_if_else_control_flow_statement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Control FLow Statement ( selction Statement ):
		
		/*
		 * if
		 * if else
		 * if else if
		 *
		 */
		
		/*
		 
//1		 if
  
 
		int num = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Integer Number: ");
		num=in.nextInt();
		
		if(num == 10) {
			System.out.println("Nummer = 10");
			System.out.println("Thanks");
			}
		
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		
		
		*/
		
		/*
		 * == equal to
		 * != not equal to
		 * > greater than
		 * >= greater than or equal to
		 * < less than
		 * <= less than or equal to
		 * 
		  */
		
//2		if else
		
		
		/*
		Scanner in= new Scanner (System.in);
		
		int num;
		
		System.out.println("Enter Integer Number");
		
		num=in.nextInt();
		
		if (num%2==0) {
			if(num>=10)
			{
				System.out.println("even");
				System.out.println("and greater than 10");
			}else
			{
				System.out.println("Even");
				System.out.println("and less than 10");
			}
		}else {
			System.out.println("odd");
			}
			
	}
}

*/
		
//3		if else if
	
		
		Scanner in = new Scanner (System.in);
		
		int num;
		
		System.out.println("Enter Integer Nummer: ");
		
		num = in.nextInt();
		
		if(num>10)
			System.out.println("greater than 10");
		else if (num==10)
			System.out.println("equal 10");
		else if (num<10)
			System.out.println("less than 10");
		
		
		
		
		
		
		
		
	}

}

