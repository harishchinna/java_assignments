package com.capgemini;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;




public class CountingLines 
{
	public int countLines() throws IOException
	{
		int count=0;
		LineNumberReader reader=new LineNumberReader(new FileReader("C://work/java/basic_assignment/assign.txt"));
		while(reader.readLine()!=null){}
		count =reader.getLineNumber();
		reader.close();
		return count;
			
	}
}
