package projekts;

import java.util.Scanner;

public class L4_if_else_control_flow_statement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Java Program to calculate grade of student,
		 * If percentage >=90 Print A grade,
		 * If percentage >=80 print B grade,
		 * If percentage >=70 print C grade,
		 * If percentage >=60 print D grade,
		 * otherwise print fail.
		 * 
		 */
		
		
		/* and : &
		 * true and true = true
		 * true and false = false
		 * false and true = false
		 * false and false = false
		 * 
		 * or : |
		 * true or true = true
		 * true or false = true
		 * false or true =true
		 * false or false = false
		 * false or false or true = true
		 * */
		
//1
		/*
		int x;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter your Mark: ");
		x = in.nextInt();
		if (x>=90 && x<=100) // || try it with or
			System.out.println("A");
		else if (x>=80 && x<90)
			System.out.println("B");
		else if (x>=70 && x<80)
			System.out.println("C");
		else if (x>=60 && x<70)
			System.out.println("D");
		else if (x<60 && x>=0)
			System.out.println("Fail");
		else
			System.out.println("please enter a valid number");
		
		*/
		
		
//2
		/*
		boolean x; boolean y = false;
		if ( x = (3>4)||(100<5*5))
		System.out.println(x);
		else
			System.out.println(y);
//		booleans takes true or false, if u change the numbers so that it doesn't fit in the equation, u will understand
	
		*/
		
		
		
		
//3
		// ?: what does those signs mean ?
		/*
		
		int y = 1;
		int z = y==1 ? 2 : 5 ; // ? means : if this condition ( y==1 ) is true then z = 2,
//								and after that we put : which it means else z = 5 .    try it with y =1 and y =2
		
		System.out.println("z = " +z);
		
		*/
		
		
		
		
		
//4		we will practice 3  on example 1 :
		
		
		int x;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter your Mark: ");
		x = in.nextInt();
		
		String r = (x>=90 && x<=100) ? "A" :
			(x>=80 && x<90) ? "B" :
				(x>=70 && x<80) ? "C" :
					(x>=60 && x<70) ? "D" :
						(x<60 && x>=0) ? "Fail" :
							"please Enter a valid Number : ";
		
		
//		we will make a String r,
//		x>=90 and <=100 ( ? : if it is true ) then print A
//		(:)else  x>=80 and <90 ( ? : if it is true ) then print B
//		(:)else  x>=70 and <80 ( ? : if it is true ) then print C
//		(:)else  x>=60 and <70 ( ? : if it is true ) then print D
//		(:)else  x<60 and x>=0 ( ? : if it is true ) then print Fail
//		(:)else print " please Enter a valid Number : "
		
		System.out.println(r);
		
//5		comparison operator :  instanceof
		
		System.out.println(r instanceof String); // it means if r belongs to String : it means if it is object in this String, in our previous condition it is true.
		
		System.out.println(in instanceof Scanner); // we can use the instanceof with none primitive Data Types, the primitive Data Types are : int, short, long ...etc
		
		
		
		
		
		
		

	}

}
