package com.capgemini;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FilePathTestCase {
	private FilePath path;
	@Before
	public void setUp()
	{
		path=new FilePath();
	}

	@Test
	public void checkingWheatherFileIsPresentOrNot()
	{
		assertEquals(true,path.searchFile());
	}

}
