package com.capgemini;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class EmployeeRetriveTestCase 
{
	private EmployeeRetrive emp;
	@Before
	public void setUp()
	{
		emp=new EmployeeRetrive();
	}

	@Test
	public void checkingRetriving() throws IOException 
	{
		assertEquals("Employee [id=101, name=harish, salary=5000.0]",emp.retriveFile());
	}

}
