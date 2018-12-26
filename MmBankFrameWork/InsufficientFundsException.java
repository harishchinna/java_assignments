package com.capgemini;

public class InsufficientFundsException extends RuntimeException
{
	public InsufficientFundsException(String message) 
	{
		super(message);
	}

	public InsufficientFundsException() {
	}
}
