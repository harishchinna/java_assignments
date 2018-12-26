package com.capgemini;

public class MmBankFactory extends BankFactory
{ 
	@Override
	public MmSavingsAccount getNewSavingsAccount(String accountName,float accountBalance,boolean isSalaried)
	{
		return new MmSavingsAccount(accountName,accountBalance,isSalaried);
	}
	@Override
	public MmCurrentAccount getNewCurrentAccount(String accountName,float accountBalance,float creditLimit)
	{
		return new MmCurrentAccount(accountName, accountBalance, creditLimit);
	}

	
}
