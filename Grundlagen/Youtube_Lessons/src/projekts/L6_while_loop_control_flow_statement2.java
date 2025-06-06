package projekts;

import java.util.Scanner;

public class L6_while_loop_control_flow_statement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Flag controlled WHILE loop
//		Sentinel controlled WHILE loop

		
//1
		
//		g f d 6 i k i o q
		
		
//		char letter='a';
//		
//		Scanner in = new Scanner (System.in);
//		
//		while(letter != 'q') {
//			
//			letter = in.next().charAt(0);
//		}

		
		
//2		
//		char letter='a';
//		int c = 0;
//		
//		Scanner in = new Scanner (System.in);
//		
//		while(letter != 'q') {				this is sentinel while loop, here is the q sentinel value, and the other variable that is with it are changebel
//			
//			letter = in.next().charAt(0);
//			c++;
//		}
//		System.out.println("count = "+ c);
		
		
//3
	
		
//		char letter='a';
//		int c = 0;
//		
//		Scanner in = new Scanner (System.in);
//		boolean flag = true;
//		while(flag) {				// flag while loop 
//			
//			letter = in.next().charAt(0);
//			c++;
//			if(letter =='q')
//				flag=false;
//		}
//		System.out.println("count = "+ c);
		
		
//4

//		Scanner in = new Scanner (System.in);
//		 
//		float sum = 0;
//		float grade = 0;
//		int count = 0;
//		while (grade != -1) {
//			
//			
//			System.out.println("Enter grade Number " + (count + 1));
//			grade=in.nextFloat();
//			if(grade != -1) {
//			sum+=grade;
//			count++;
//			}
//			
//			System.out.println("Avg = " + sum/count);
//			
//		}
//		
//	}
//}
		
//5
		
		
		
		Scanner in = new Scanner (System.in);
		float sum = 0;
		float grade = 0;
		int count = 0;
		boolean flag = true;
		
			
		while(flag) {			// flag while loop
			System.out.println("Enter grade Number " + (count+1));
			
			grade=in.nextFloat();
			
			if (grade >= 0) {
			count++;
			sum+=grade;
			}
			if (grade < 0) {
				
				flag = false;
				
			}
			
		}
		
		System.out.println("Avg= " + sum/(count));
		
		
	}

}
