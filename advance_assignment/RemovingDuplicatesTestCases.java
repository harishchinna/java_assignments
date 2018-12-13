package Basic_assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RemovingDuplicatesTestCases {
	private RemoveDuplicates remove;
	@Before
	public void setUp()
	{
		remove=new RemoveDuplicates();
	}

	@Test
	public void PassingString() {
		assertEquals("abc",remove.removeDuplicateLetters("abbaacbc"));
	}
	@Test
	public void PassingAnotherString() {
		assertEquals("javforschl",remove.removeDuplicateLetters("javaforschool"));
	}
	@Test
	public void PassingOneMoreAnotherString() {
		assertEquals("Misp",remove.removeDuplicateLetters("Mississippi"));
	}
}
