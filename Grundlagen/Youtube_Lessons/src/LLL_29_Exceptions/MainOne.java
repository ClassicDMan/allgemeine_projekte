package LLL_29_Exceptions;
import java.lang.Exception;

public class MainOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		try {		
//			int[] arr = new int[] { 1, 2, 3 };
//			System.out.println(arr[3]);
//		} catch (java.lang.ArrayIndexOutOfBoundsException e) {		//ArrayIndexOutOfBoundsException is a class
////			System.out.println(e.toString());
//			System.out.println(e);
//		}
//		System.out.println("1");
//		System.out.println("2");

		////////////////////////////////////////////////

//		try {		
//			int[] arr = null;
//			System.out.println(arr[3]);
//		} catch (java.lang.NullPointerException e) {		// NullPointerException is a class
//			System.out.println(e.toString());
//			System.out.println(e);
//		}

		///////////////////////////////////////////////

//		int val = Integer.parseInt("1");	// parseInt: changes any String to Integer ( it should be Numbers )

//		try {
//			int val = Integer.parseInt("String96");
//			System.out.println(val);
//		} catch (NumberFormatException e) { // NumberFormatException: for Input String, it should be String with Numbers
//			// TODO: handle exception
//			System.out.println(e);
//		}
//		System.out.println("1");
//		System.out.println("2");
		
		//////////////////////////////////////////////

//		try {
//			int x = 5 / 0;
//			System.out.println(x); // in exception case, here it happened so it jumps to catch and continues to end
//
//			System.out.println("Hi 1"); // here it will not happen
//			System.out.println("Hi 1"); // here it will not happen
//			System.out.println("Hi 1"); // here it will not happen
//
//		} catch (ArithmeticException e) { // ArithmeticException: number divided by zero, ArithmeticException
//			// TODO: handle exception
//			System.out.println(e);
//		}
//		System.out.println("rest of the code");
		
		/////////////////////////////////////////////
		
		try {
			int arr[] = new int[5];
			arr[10] = 7/0;
			
			System.out.println("Hi 1"); // here it will not happen
			System.out.println("Hi 1"); // here it will not happen
			System.out.println("Hi 1"); // here it will not happen
			
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {	// a way to combine Exceptions
			// TODO: handle exception
			System.out.println("ArrayIndexOutOfBoundsException | ArithmeticException ");
			
		} catch (Exception e) {			// Exception is the Father Class for all Exceptions, need to be imported
			System.out.println("Exception");
		}
		// why is it important to name the Exception name, that is because if i import the father Exception
		// the run time will be slower because Exception has all types
		// when u will be specific it will run faster

		System.out.println("1");
		System.out.println("2");

	}

}
