package com.capgemini;

import java.io.File;

public class FilePath 
{
	String absolutePath="C://work/java/basic_assignment/assignment1.txt";
	File file=new File(absolutePath);
	public boolean searchFile()
	{
		if(file.exists())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
