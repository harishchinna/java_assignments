package com.capgemini;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class GrepTestCase 
{
	private GrepCount grep;
	@Before
	public void setUp()
	{
		grep=new GrepCount();
	}

	@Test
	public void checkingWordInTheLine() throws IOException
	{
		grep.wordCounting("hello");
	}

}
