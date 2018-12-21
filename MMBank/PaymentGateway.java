package com.caogemini;

public class PaymentGateway 
{
	public static boolean transfer(SavingsAccount sender, SavingsAccount receiver, double amount) 
	{
		if(sender.getAccountBalance()>=amount)
		{
			sender.withdraw(amount);
			receiver.deposit(amount);
			return true;
		}
		else
			return false;
	}

}
