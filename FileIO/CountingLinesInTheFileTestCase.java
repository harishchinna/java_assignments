package com.capgemini;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CountingLinesInTheFileTestCase
{
	private CountingLines count;
	@Before
	public void setUp()
	{
		count=new CountingLines();
	}
	

	@Test
	public void checkingLineCount() throws IOException
	{
		assertEquals(6,count.countLines());
	}

}
