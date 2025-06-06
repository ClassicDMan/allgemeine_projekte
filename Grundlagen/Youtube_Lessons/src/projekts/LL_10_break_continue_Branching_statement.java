package projekts;

import java.util.Scanner;

public class LL_10_break_continue_Branching_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
////////////////////////////////////////////////////////////

		
//1:
		
		
////		Branching Statement:
////		The break statement : causes immediate exit from controlled structure.
////		The continue statement skips remaining statements in loop body.
////		The return statement : exits from the current method and control flow returns to where the method was invoked.
////		The return statement has two forms:
////		one that returns a value /////////// and ///////// one that doesn't. To return to a value.
//		
//		Scanner in = new Scanner(System.in);
//
//		System.out.println("Test Your self");
//		System.out.println("What is the '5+10/2*10 = ?' ");
//		
//		float userAnswer, theCorrectAnswer = 55;
//		boolean questionAnswer = false;
//
//		for (int i = 1; i <= 3; i++) {
//			userAnswer = in.nextFloat();
//
//			if (userAnswer == theCorrectAnswer) {
//				questionAnswer = true;
//				break; // it exists from the if structure.
//			} else if (userAnswer != theCorrectAnswer) {
//				if (i == 3)
//					continue; // it skips the command at this point
//				System.out.println("Chance #" + (i + 1) + " : ");
//			}
//
//		}
////		Erklärung
////		if(true) {
////		continue;		// u can't write it alone outside the loop (for, while, do-while), and also u can't write it inside the if statement
////		break;			// u can't write it also,it can be used inside switch or loop, inside the if else if statements it can be used when it is unlabled ( unlabled break ).
////		}
//		if (questionAnswer)		// it means if (questionAnswer == true)
//			System.out.println("Correct Answer");
//		else
//			System.out.println("Wrong Answer");
		
		
/////////////////////////////////////////////////////////////////////////////////////////////////
		
//3:
		
		
//		for (int j = 0; j < 10; j++) {
//			if (j==4)
//			break;				// try to delete break; to understand, it deletes the forth command in which the i=4, so it goes down to print hello. try it with i<=4 to understand more
//						// it skips one iteration, on the forth command it skips the orders and continues till the ninth command and then prints Hello. try with i<=4 to understand more
//			System.out.println("j = "+j);
//		}
//		System.out.println("Hello");

		
/////////////////////////////////////////////////////////////////////////////////////////////////
		
//4:
		
		
//															Labeled break Statement
//															Labeled continue Statement 		
		
//		test:{	//to make a Block, u should add {} to the wanted area, and give it a name, and of course, don't forget the : before the {, and then u can use the break inside it.
//		if (5<6)					// this condition doesnt have anything to do with the thing here, it is just if 5 smaller than 6 the break the test Block, and of course we know 5 is smaller than 6
//			break test;		//it will break the block if the condition is true, which it is, change the condition to 6<5 and u will see what happens.
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
//		System.out.println("4");
//		System.out.println("8");
//		}
//		System.out.println("5");
		
//		stop: {
//			for (int row = 1; row <= 10; row++) {
//				for (int columen = 1; columen <= 5; columen++) {			// first it printed 5 Stars in each line until the row = 10, but we added stop:{} with break to break, remove them for better understanding
//					if (row == 5)
//						break stop;
//					System.out.print("* ");
//
//				}
//				System.out.println("");
//			}
//		}
		
		
		//////////////////////////////////////////////////////////////////////////////////////////////////
		
//5:
		
		
//		for (int row = 1; row <= 5; row++) {
//
//			for (int columen = 1; columen <= 10; columen++) {
//				if (columen>row)
//					continue;
//
//				System.out.print("* ");
//
//			}
//			System.out.println("");
//		}
		

		
//6:
		
		
//		one of the goals was to print a triangle star .
		
		nextRow:for (int row = 1; row <= 5; row++) {
			System.out.println();

			for (int columen = 1; columen <= 10; columen++) {
				if (columen>row)
					continue nextRow;					// we added nextRow: remove them and play a little so that u understand
				nextcol:if(1<2)
					break nextcol;		// u can use labeled break also inside a loop, in which u used a labeled break already

				System.out.print("* ");

			}
			System.out.println("Line #1");
		}

	}

}
