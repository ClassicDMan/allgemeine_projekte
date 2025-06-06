package LLL_29_Exceptions;

public class InsufficientFundsException extends Exception {

	public InsufficientFundsException(String msg) {
		super(msg);
	}

	public InsufficientFundsException() {
		super();
	}

}
