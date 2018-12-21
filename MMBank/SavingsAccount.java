package com.caogemini;

public class SavingsAccount
{
	private String accountHolderName;
	private static int accountNumber;
	private  int nextAccountNumber;
	private double accountBalance;
	public String getAccountHolderName()
	{
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) 
	{
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance()
	{
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance)
	{
		this.accountBalance = accountBalance;
	}
		
	static
	{
		accountNumber=101;
	}
	{
		accountNumber++;
		
	}
	public int getNextAccountNumber()
	{
		return accountNumber;
	}
	
	
	
	public String withdraw(double amount)
	{
		String result;
		if(amount<=accountBalance)
		{
		accountBalance-=amount;
		 result= "Transaction Successful";
		}
		else
		{
		result= "Insufficient Funds";
		}
		return result;
	}
	public String deposit(double amount)
	{
		accountBalance+=amount;
		return "Money Deposited Successfully";
	}

}
