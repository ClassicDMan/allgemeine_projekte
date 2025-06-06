package projekts;

import java.util.Scanner;

public class L5_switch_control_flow_statement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
//1		
		int x = 5;
		
		switch(x) {
			case 1:
				System.out.println("case #1");
				break;									// break; means break this order at this point
			case 2:
				System.out.println("case #2");
				break;
			case 3:
				System.out.println("case #3");
				break;
			default:				// when there is no case with this variable then we use default, which it says if u don't have it then use something else
				System.out.println("it is not an option");
		*/
		
		
		
		
//2
		
		
		
		
		/*
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the day #: ");
		int day = in.nextInt();
		
		switch(day) {			//it takes byte, short, char, and int primitive data type and also String ..etc
								//, if u write switch (5/2) it will print 2 and not 2.5, because it doesn't support float or double
		
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Weekday");		// we don't need to print in every case, we use it for an example at the 5th case, it means all the cases above have the same print
			break;
		case 6:
		case 7:
			System.out.println("Weekend");
			break;
			default:
				System.out.println("it is not an Option");
		
		
		*/
		
		
		
//3
		
		
		
		/*
		Scanner in = new Scanner (System.in);
		System.out.println("Enter one of these Operators: * / % + - :");
		char c = in.next().charAt(0);
		int n1,n2;
		System.out.println("Enter n1:");
		n1= in.nextInt();
		System.out.println("Enter n2:");
		n2=in.nextInt();
		
		switch(c) {
		
		case '*':
			System.out.println("res= "+ (n1*n2));
			break;
		case '/':
			System.out.println("res= "+ (n1/n2));
			break;
		case '%':
			System.out.println("res= "+ (n1%n2));
			break;
		case '+':
			System.out.println("res= "+ (n1+n2));
			break;
		case '-':
			System.out.println("res= "+ (n1-n2));
			break;
		
			default:
				System.out.println("it is not an Option");
		*/
		
		
//4
		
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a letter: ");
		char c = in.next().charAt(0);
	//	String n = "AAA";
		switch(c) {
		
			case 'a':
//		exp:	{
//				if (a>10 && a < 100){
		
//				}
//			}
			System.out.println(c);
			break;
			case 'b':
			System.out.println(c);
			break;
			case 'c':
			System.out.println(c);
			break;
			
			default:
				System.out.println("it is not an Option");
		
				/* 1- switch is very sensitive and it is case sensitive: if u put " a " then as a result it will be a not A
				 * 2- in every case u can write what ever u want, u can open a block and write the code u want, u can put for an example: if and if else in it 
				 * 3- the cases can not be identical
				 * 4- the value of case is constant
				 * 5- the value which the case has should be the same data type in the switch exp: n is int ,switch (n) then cases should be case 1 and case 2 ...etc
				 * c is char so thae cases should be also char exp : switch (c) then the cases will be case 'a', case 'b' ...etc if char is a scentence then u should put it between "AAA"
				 * 6- it doesn't support the ranging condition like other languages.
				 * 7- it is like if else , then why do we use it ?
				 * A: we use it because it is readable and clear and organized, a lot of programmers prefer it above the if else . and recommended when i will work with the menus and it 
				 * is more efficient than if else
				 * */
		
		}

	}

}
