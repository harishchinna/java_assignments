package com.capgemini;

public class MmSavingsAccount extends SavingsAccount {
	private static final float minimumBalance = 0;

	public MmSavingsAccount( String accountName,
			float accountBalance, boolean isSalaried) {
		super( accountName, accountBalance, isSalaried);
	}

	public static float getMinimumbalance() {
		return minimumBalance;
	}

	@Override
	public void withdraw(double amount) throws Exception {
		if (amount < 0) {
			throw new InvalidInputException("Invalid Amount");
		} else if (amount > super.getAccountBalance()) {
			throw new InsufficientFundsException("Insufficient Funds");
		} else

			super.setAccountBalance(super.getAccountBalance() - amount);
	}

	@Override
	public String toString() {
		return "MmSavingsAccount [isSalaried()=" + isSalaried()
				+ ", toString()=" + super.toString() + ", getAccountNumber()="
				+ getAccountNumber() + ", getAccountName()=" + getAccountName()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
