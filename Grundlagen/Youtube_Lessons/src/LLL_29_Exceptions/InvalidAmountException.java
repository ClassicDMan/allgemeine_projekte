package LLL_29_Exceptions;

public class InvalidAmountException extends Exception {

	public InvalidAmountException(String message) {
		super(message);

	}

	public InvalidAmountException() {
		super();
	}

}
