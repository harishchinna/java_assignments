package com.capgemini;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class WordCount 
{
	public int wordCounting() throws IOException
	{
		int count=0;
		String absolutePath="C://work/java/basic_assignment/assign.txt";
		FileReader file=new FileReader(absolutePath);
		 BufferedReader br = new BufferedReader (file);     
	       String line = br.readLine ();
	      
	       while (line != null) {
	          String []parts = line.split(" ");
	          for( String w : parts)
	          {
	            count++;        
	          }
	          line = br.readLine();
	       }  
	       return count;
	}

}
