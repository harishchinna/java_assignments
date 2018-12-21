package com.caogemini;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MMBankTestCase 
{	
		
	@Test
	public void checkingDeposit()
	{
		SavingsAccount savingsaccount=new SavingsAccount();
		savingsaccount.setAccountHolderName("hari");
		savingsaccount.setAccountBalance(10000);
		//System.out.println(savingsaccount.getAccountBalance());
		String expected="Money Deposited Successfully";
		assertEquals(expected,savingsaccount.deposit(5000));
		//System.out.println(savingsaccount1.getAccountBalance());
	}
	
	@Test
	public void checkingNextAccountBalance()
	{
		SavingsAccount savingsaccount=new SavingsAccount();
		assertEquals(103,savingsaccount.getNextAccountNumber());
	
	}
	@Test
	public void checkingPaymentGateway()
	{
		SavingsAccount savingsaccount=new SavingsAccount();
		SavingsAccount savingsaccount1=new SavingsAccount();
		savingsaccount.setAccountHolderName("hari");
		savingsaccount.setAccountBalance(10000);
		savingsaccount1.setAccountHolderName("giri");
		savingsaccount1.setAccountBalance(5000);
		PaymentGateway gateway=new PaymentGateway();
		assertEquals(true,gateway.transfer(savingsaccount,savingsaccount1,2500));
		//System.out.println(savingsaccount.getAccountBalance());
		//System.out.println(savingsaccount1.getAccountBalance());
	}
	
	@Test
	public void checkingWithdraw()
	{
		SavingsAccount savingsaccount=new SavingsAccount();
		savingsaccount.setAccountHolderName("hari");
		savingsaccount.setAccountBalance(10000);
		//System.out.println(savingsaccount.getAccountBalance());
		String expected="Transaction Successful";
		assertEquals(expected,savingsaccount.withdraw(5000));
	}

}
