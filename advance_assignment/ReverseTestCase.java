package Basic_assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReverseTestCase {
	private ReverseString reverse;
	@Before
	public void setUp()
	{
		reverse=new ReverseString();
	}

	@Test
	public void test() 
	{
		assertEquals("s'teL ekat edoCteeL tsetnoc",reverse.reverseWord("Let's take LeetCode contest"));
	}

}
