package com.capgemini;

public abstract class BankAccount {
	private int accountNumber;
	private String accountName;
	private double accountBalance;
	private static int nextAccountNumber = 100;
	{
		accountNumber = ++nextAccountNumber;
	}

	public int nextAccountNumber() {
		return nextAccountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	protected void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public BankAccount() {

	}

	public BankAccount(int accountNumber, String accountName,
			float accountBalance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	public BankAccount(String accountName, float accountBalance) {
		super();
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	public abstract void withdraw(double amount) throws Exception;

	public void deposit(float amount) throws Exception {
		if (amount <= 0) {
			throw new InvalidInputException("Invalid Input");
		} else
			accountBalance = accountBalance + amount;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountName="
				+ accountName + ", accountBalance=" + accountBalance + "]";
	}

}
