package com.capgemini;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class WordCountTestCase 
{
	private WordCount wordCount;
	@Before 
	public void setUp()
	{
		wordCount=new WordCount();
	}
	@Test
	public void test() throws IOException
	{
		assertEquals(20,wordCount.wordCounting());
	}

}
