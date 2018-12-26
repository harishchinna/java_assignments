package com.capgemini;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GrepCount 
{
	public String wordCounting(String searchword) throws IOException
	{
		
		int lineNumber=0;
		String lineAndCount="";
		String lines="";
		String absolutePath="C://work/java/basic_assignment/assign.txt";
		FileReader file=new FileReader(absolutePath);
		 BufferedReader br = new BufferedReader (file);     
	    	            	      
	       while ((lines=br.readLine()) != null) 
	       {
	    	   lineNumber++;
	          String []words = lines.split(" ");
	          for( int count=0;count<words.length;count++)
	          {
	           if(words[count].contains(searchword)) 
	           {
	        	   lineAndCount+=lineNumber+" "+lines+"\n";
	           }
	          }
	  	    } 
	       System.out.println(lineNumber);
	       System.out.println(lineAndCount);
	        return lineAndCount;
	}
}


	
