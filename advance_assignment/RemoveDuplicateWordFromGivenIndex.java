package Basic_assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RemoveDuplicateWordFromGivenIndex {
	private RemoveDuplicateWordsInString duplicateWord;
	@Before
	public void setUp()
	{
		duplicateWord=new RemoveDuplicateWordsInString();
	}

	@Test
	public void test()
	{
		assertEquals("A MORNING WALK IS A BLESSING FOR THE WHOLE DAY.",duplicateWord.RemoveDuplicatesBasedOnIndex("A MORNING WALK IS A IS BLESSING FOR   THE  WHOLE DAY.","IS",6));
	}

}
