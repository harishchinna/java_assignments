import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class RectangleTestCases
{
	private RectangleDimensions  rectangle;
	
	@Before
	public void setUp()
	{
		rectangle=new RectangleDimensions();
		rectangle.setLength(5);
		rectangle.setBreadth(5);
	}
	@Test
	public void areaRectangle()
	{
		assertEquals(25,rectangle.areaOfRectangle(),0);
	}
	@Test
	public void perimeterRectangle()
	{
		assertEquals(20,rectangle.perimeterOfRectangle(),0);
	}
}
