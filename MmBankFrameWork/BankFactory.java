package com.capgemini;

public abstract class BankFactory 
{
	public abstract SavingsAccount getNewSavingsAccount(String accountName,float accountBalance,boolean isSalaried);
	
	public abstract CurrentAccount getNewCurrentAccount(String accountName,float accountBalance,float creditLimit);	
	

}
