package Basic_assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MultidimentionalArrayTest {

	private MultidimentionalArray multidimentional;

	@Before

	public void setUp()

	{

		multidimentional = new MultidimentionalArray();

	}

	@Test

	public void findingNumberTest() 

	{

		int array[][] = {{1,2,3},{11,12,13},{21,22,23}};

		assertEquals(true,multidimentional.searchNumber(11,array));

		}

	@Test

	public void findingNoNumberTest() 

	{

		int array[][] = {{4,5,6},{14,15,16},{24,25,26}};
	
		assertEquals(false,multidimentional.searchNumber(10,array));

		}

}
