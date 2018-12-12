package Basic_assignment;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class MissingValueTest {
	private MissingValue missingvalue;
	@Before
	public void setUp()
	{
		missingvalue=new MissingValue();
	}
	@Test
	public void PassingArray() {
		int array[]={0,1,3};
		assertEquals(2,missingvalue.missValues(array));
		
	}
	@Test
	public void AddingElementsToArray() {
		int array[]={9,6,4,2,3,5,7,0,1};
		assertEquals(8,missingvalue.missValues(array));
		
	}

}
