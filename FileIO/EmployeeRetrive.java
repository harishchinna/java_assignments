package com.capgemini;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class EmployeeRetrive
{
	public String retriveFile() throws IOException
	{
		FileReader file =new FileReader("c://work/java/basic_assignment/employee.txt");
		BufferedReader in = new BufferedReader(file);		
		String line="";
		String storeLine="";
		while((line = in.readLine()) != null)
		{
		    storeLine=storeLine+line;
		}
		in.close();
		//System.out.println(storeLine);
		return storeLine;
	}
}
