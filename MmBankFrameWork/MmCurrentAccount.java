package com.capgemini;

public class MmCurrentAccount extends CurrentAccount
{
	public MmCurrentAccount(String accountName,float accountBalance,float creditLimit)
	{
		super(accountName,accountBalance,creditLimit);
	}

	

	@Override
	public void withdraw(double amount) throws Exception
	{
		if(amount>(super.getAccountBalance()+super.getCreditLimit()))
		{
			throw new InsufficientFundsException("Insufficient Funds");
		}
		else if(amount<=0)
		{
			throw new InvalidInputException("Invalid Amount");
		}
		else
		{
			super.setAccountBalance((super.getAccountBalance()+super.getCreditLimit())-amount);
		}
		
	}



	@Override
	public String toString() {
		return "MmCurrentAccount [getCreditLimit()=" + getCreditLimit()
				+ ", toString()=" + super.toString() + ", getAccountNumber()="
				+ getAccountNumber() + ", getAccountName()=" + getAccountName()
				+ ", getAccountBalance()=" + getAccountBalance()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}



	

}
