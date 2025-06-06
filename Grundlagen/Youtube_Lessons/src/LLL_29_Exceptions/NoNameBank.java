package LLL_29_Exceptions;

import javax.naming.InsufficientResourcesException;

public class NoNameBank {

	private double balance;

	public void deposite(double amount) throws InvalidAmountException {
		if (amount <= 0) {

			throw new InvalidAmountException(amount + "is not valid");
		}
		balance = balance + amount;
	}

	public double withdraw(double amount) throws InsufficientFundsException {

		if (balance < amount) {

			throw new InsufficientFundsException("insufficiant funds");

		}
		balance = balance - amount;
		return amount;

	}

	public void balanceEnquiry() {
		System.out.println("current balance: " + balance);

	}

}
