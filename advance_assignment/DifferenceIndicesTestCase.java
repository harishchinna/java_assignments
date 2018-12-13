package Basic_assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DifferenceIndicesTestCase {
	private IndicesDifference check;
	@Before
	public void setUp()
	{
		check=new IndicesDifference();
	}

	@Test
	public void PassingArrayValues() {
		int array[]={4,5,8,2,6,7,4,9,7};
		assertEquals(true,check.isIndicesRange(array,6));
	}
	@Test
	public void PassingValueWhichIsNotRepeated() {
		int array[]={4,5,8,2,6,7,1,5};
		assertEquals(false,check.isIndicesRange(array,5));
	}

}
