package com.capgemini;

import static org.junit.Assert.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MmBankTestCase 
{
	BankFactory account=new MmBankFactory();
	Logger logger=Logger.getLogger(MmBankTestCase.class.getName());
	SavingsAccount savingsAccount;
	CurrentAccount currentAccount;
	
	@Before
	public void setUp()
	{
		savingsAccount=account.getNewSavingsAccount("harish", 1000, true);
		currentAccount=account.getNewCurrentAccount("mahesh",5000, 10000);
		BasicConfigurator.configure();
	}
	
	@Test()
	public void aCheckToGetAccountNumberOfSavingsAccount()
	{
		assertEquals(101,savingsAccount.getAccountNumber());
	}
	@Test()
	public void checkingWithdrawMethodInSavingsAccount() throws Exception
	{
		savingsAccount.withdraw(500);
	}
	@Test()
	public void checkingDepositMethodInSavingsAccount() throws Exception
	{
		savingsAccount.deposit(1000);
	}
	@Test()
	public void bCheckToGetAccountNumberOfCurrentAccount()
	{
		assertEquals(104,currentAccount.getAccountNumber());
	}
	@Test()
	public void checkingWithdrawMethodInCurrentAccount() throws Exception
	{
		currentAccount.withdraw(1000);
	}
	@Test()
	public void checkingDepositMethodInCurrentAccount() throws Exception
	{
		currentAccount.deposit(1000);
	}
	@Test(expected=RuntimeException.class)
	public void checkingWithdrawMethodInSavingsAccountWithNegativeValues() throws Exception
	{
		savingsAccount.withdraw(-500);
	}
	@Test(expected=RuntimeException.class)
	public void checkingDepositMethodInCurrentAccountPassingNegativeValues() throws Exception
	{
		currentAccount.deposit(-1000);
	}
	@Test()
	public void testToChecDepositeOfSavingsAccountWithValidAmount() 
	{
		try 
		{
			currentAccount.deposit(1000);
		} 
		catch (InvalidInputException e)
		{
			logger.error(e);
		}
		catch (Exception e)
		{
			logger.error(e);
		}
		System.out.println(currentAccount.getAccountBalance());
		 
	}
	
	@Test()
	public void testToChecDepositeOfCurrentAccountWithValidAmount() 
	{
		try 
		{
			currentAccount.deposit(500);
		} 
		catch (InvalidInputException e)
		{
			logger.error(e);
		}
		catch (Exception e)
		{
			logger.error(e);
		}
		System.out.println(currentAccount.getAccountBalance());
		 
	}
	
	@Test()
	public void testToChecWithdrawOfSavingsAccountWithValidAmount() 
	{
		try 
		{
			savingsAccount.deposit(1000);
			savingsAccount.withdraw(500);
		} 
		catch (InvalidInputException e)
		{
			logger.error(e);
		}
		catch (Exception e)
		{
			logger.error(e);
		}
		System.out.println(savingsAccount.getAccountBalance());
		 
	}
	@Test()
	public void testToChecWithdrawOfCurrentAccountWithValidAmount() 
	{
		try 
		{
			
			currentAccount.withdraw(500);
		} 
		catch (InvalidInputException e)
		{
			logger.error(e);
		}
		catch (Exception e)
		{
			logger.error(e);
		}
		System.out.println(currentAccount.getAccountBalance());
		 
	}
		
}


