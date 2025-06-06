package LLL_29_Exceptions;

import java.io.FileNotFoundException;

public class Test {
	
	public static void val(int num){
		if(num < 0) {
			ArithmeticException ae = new ArithmeticException("the number must be greater than zero");
			throw ae;
		}else {
			System.out.println("number has been given");
		}
	}
	
	public static void val2(int num) throws FileNotFoundException{ //throws must be used when an checked Exception is occurred
		if(num < 0) {
			FileNotFoundException f = new FileNotFoundException("the number must be greater than zero");
			throw f;
		}else {
			System.out.println("than number is greater than zero");
		}
	}
	
	public static void val3(int num){
		if(num < 0) {
			MyException ae = new MyException("the number must be greater than zero");
			throw ae;
		}else {
			System.out.println("number has been given");
		}
	}
	
	
	

	public static void main(String[] args) {
		
//		try {
//		val(-1);
//		}catch(ArithmeticException e) {
//			System.out.println(e);
//		}
//		
//		try {
//		val2(-1);
//		}catch(FileNotFoundException e) {
//			System.out.println(e);
//		}
//		
		
//		try {
//			int x = 5/0;
//			
//		} catch (ArithmeticException e) {
//			System.out.println(e);
//			throw new ArithmeticException("new Throw");
//		
//		}finally {				// finally block will be executed before the new throw
//			System.out.println("finally block");
//		}
		
		try {
		val3(-1);
		}catch(MyException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		System.out.println("rest of the cod");

	}

}
