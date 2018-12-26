package com.capgemini;

import static org.junit.Assert.*;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTestCase implements Serializable 
{
	private Employee employee;
	@Before
	public void setUp()
	{
		employee=new Employee(101,"harish",5000);
	}

	@Test
	public void checkingTheCreationOfFile() throws IOException 
	{
		FileWriter file=new FileWriter("C://work/java/basic_assignment/employee.txt");
		String result=employee.toString();
		file.write(result);
		file.close();
	}

}
