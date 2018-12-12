package Basic_assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReverseStringTestCase {
	StringPalindrome reverse;
	@Before
	public void setUp()
	{
	reverse=new StringPalindrome();	
	}

	@Test
	public void test() {
		assertEquals({"dd","adda"},reverse.reversePalindrome("adda"));
	}

}
