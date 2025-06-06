package LLL_29_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainFour {
											// we can chose if we throws or not
	public static void validate1(int number)  /* throws ArithmeticException */ { // it is unchecked Esception
		if(number <= 0) {
//			System.out.println("The number must be greater than zero");
//			throw new ArithmeticException("The number must be greater than zero");
			ArithmeticException ae = new ArithmeticException("The number must be greater than zero");
			throw ae;
		}else {
			System.out.println("The number has been entered");
		}
	}
	
	public static void validate2(int number) throws ArithmeticException {
		if(number <= 0) {
//			System.out.println("The number must be greater than zero");
			MyException ae = new MyException("The number must be greater than zero");
			throw ae;
		}else {
			System.out.println("The number has been entered");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {
		validate1(-1);
		}catch(ArithmeticException ae){
			System.out.println(ae);
		}
		
		try {
		validate2(-1);
		}catch(MyException ae){
			
			System.out.println(ae.getMessage());
//			ae.printStackTrace();		// traces the place of the Exception
			
		}
		
		try {
			Scanner in = new Scanner(System.in);
			NoNameBank acc1 = new NoNameBank();
			String option = "";

			do {

				System.out.println("1. DEPOSITE");
				System.out.println("2. WITHDRAW");
				System.out.println("3. BALANCE ENQUIRY");
				System.out.println("ENTER OPTION");
				option = in.next();

				switch (option) {

				case "1": {
					System.out.println("Enter Deposite Amount");
					double amt = in.nextDouble();
					acc1.deposite(amt);
					acc1.balanceEnquiry();
					break;
				}

				case "2": {
					System.out.println("enter Withdraw Amount");
					double amt = in.nextDouble();
					double wd = acc1.withdraw(amt);
					System.out.println("Withdraw Amount is: " + wd);
					acc1.balanceEnquiry();
					break;
				}

				case "3": {
					acc1.balanceEnquiry();
					break;

				}

				default: {
					System.out.println("invalid Option");
					break;
				}


				}
				System.out.println("DO YOU WANT TO CONTINUE (YES/NO)");
				option = in.next();

			} while (option.equalsIgnoreCase("YES"));

		} catch (InvalidAmountException | InsufficientFundsException | NumberFormatException |InputMismatchException iae ) {
			System.out.println(iae.getMessage());
		}
		
		
		
		
		
		
		
		
		
//		try {
//			int x = 5/0;
//		} catch (ArithmeticException ae) {
//			// TODO: handle exception
//			System.out.println(ae);
//			throw new ArithmeticException("New Throw");
//		}finally {
//			System.out.println("Finally Block");		// finally will run first than ArithmeticException
//		}
//		System.out.println("Rest of the Code");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
