package com.capgemini;

public abstract class CurrentAccount extends BankAccount
{
	private final float creditLimit;
	public CurrentAccount(String accountName,float accountBalance,float creditLimit)
	{
		super(accountName,accountBalance);
		this.creditLimit=creditLimit;
	}
	public float getCreditLimit() {
		return creditLimit;
	}
	public abstract void withdraw(double amount) throws Exception;
	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit + "]";
	}

}
