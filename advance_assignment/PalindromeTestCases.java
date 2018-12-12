package Basic_assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PalindromeTestCases {
	private Palindrome palindrome;
	@Before
	public void setUp()
	{
		palindrome=new Palindrome();
	}
	@Test
	public void PassingValue() {
		assertEquals(true,palindrome.isPalindrome(121));
	}
	@Test
	public void PassingNegativeValue() {
		assertEquals(false,palindrome.isPalindrome(-121));
	}
	@Test
	public void PassingTwoDigitNumber() {
		assertEquals(false,palindrome.isPalindrome(10));
	}

}
