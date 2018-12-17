package day3_junit_assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ComparingDateTestCases {
	private Date date;
	@Before
	public void setUp()
	{
		date=new Date(7,5,2018);
	}

	@Test
	public void printingDate()
	{
		assertEquals("7/5/2018",date.toString());
	}
	@Test
	public void CheckingDifferenceBetweenDates()
	{
		assertEquals(true,date.isSmaller(date));
	}
	@Test
	public void differenceBetweenDates()
	{
		int[] expected={1,1,1};
		assertArrayEquals(expected,date.diff(date));
	}
	

}
