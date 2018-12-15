import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DistanceCalculationTestCase 
{
	private DistanceFinding distancevalue;
	private DistanceFinding distancevalue1;
	@Before
	public void setUp()
	{
		distancevalue=new DistanceFinding(10,30);
		distancevalue1=new DistanceFinding(60,70);
	}

	@Test
	public void distanceInFeetsAndInches() 
	{
		String expectedValue="70feets,100inches";
		DistanceFinding value=DistanceFinding.sum(distancevalue,distancevalue1); 
		assertEquals(expectedValue,value.feets+"feets"+","+value.inches+"inches");
	}

}
