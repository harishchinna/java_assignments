package day3_junit_assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonAgeDifferenceTestCases {
	private Person person,person1;
	
	@Before
	public void setUp(){
		person = new Person("Harish",8,6,1997);
		person1 = new Person("Chintu",27,9,1999);
	}

	
	@Test
	public void display() 
	{
		person.display();
		
	}
	@Test
	public void olderOne() 
	{
		assertEquals("Harish is older than Chintu by 2 years ,3 months, and 19days",person1.olderOne(person,person1));
	}
}
