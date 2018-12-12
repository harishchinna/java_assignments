package Basic_assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ArrayElementsTest {

	private ArrayElements Elements;

	@Before

	public void setUp()

	{

		Elements = new ArrayElements();

	}

	@Test

	public void searchingArrayElements() 

	{

		String names[]={"mahesh","ramesh","suresh","rakesh"};

		assertEquals(1,Elements.countElements(names,"mahesh"));



	}

	@Test

	public void duplicateNamePresentInArray()

	{
		String names[]={"hari","giri","mahesh","hari","srinu","bhanu","hari"};

		assertEquals(3,Elements.countElements(names,"hari"));

				

		}

}
