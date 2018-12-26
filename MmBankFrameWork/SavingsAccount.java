package com.capgemini;

public abstract class SavingsAccount extends BankAccount {
	private boolean isSalaried;
	private static final float MINBalance = 0;

	public boolean isSalaried() {
		return isSalaried;
	}

	public static float getMinbalance() {
		return MINBalance;
	}

	public SavingsAccount(String accountName, float accountBalance,
			boolean isSalaried) {
		super(accountName, accountBalance);
		this.isSalaried = isSalaried;
	}

	@Override
	public abstract void withdraw(double amount) throws Exception;

	@Override
	public String toString() {
		return "SavingsAccount [isSalaried=" + isSalaried
				+ ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountName()=" + getAccountName()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
