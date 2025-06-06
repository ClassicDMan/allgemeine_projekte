package projekts;

import java.util.Scanner;

public class L7_do_while_loop_control_flow_statement3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Do-While Loop

		
		
		
//1

//		int c = 0;
//		do {	
//			System.out.println("Java");
//			c++;
//		}while (c < 5);		// u see the java will run the orders line by line, and here u have int c = 0
//		so u used the do schleife and printed java and then u said ok c now add one to urself
//		try it with while (c==-1), u will see that it will run one time, and then stops because the condition is at the end.

		
		
		
//2		
		
//		Scanner in = new Scanner(System.in);
//		char letter;
//		int c = 0;
//
//		do {
//			letter = in.next().charAt(0);
//			if (letter != 'q')
//				c++;
//
//		} while (letter != 'q');
//
//		System.out.println("count = " + c);
	
		

		
//3
		
		Scanner in = new Scanner(System.in);
		char c;
		int n1, n2;

		do {
			System.out.println("Enter n1:");
			n1 = in.nextInt();
			System.out.println("Enter n2:");
			n2 = in.nextInt();

			System.out.println("Enter one of these Operators: * / % + - ");

			c = in.next().charAt(0);
			switch (c) {

			case '*':
				System.out.println("res= " + (n1 * n2));
				break;
			case '/':
				System.out.println("res= " + (n1 / n2));
				break;
			case '%':
				System.out.println("res= " + (n1 % n2));
				break;
			case '+':
				System.out.println("res= " + (n1 + n2));
				break;
			case '-':
				System.out.println("res= " + (n1 - n2));
				break;
			}
		} while (c == '*' || c == '/' || c == '-' || c == '+' || c == '%');
	}

}
