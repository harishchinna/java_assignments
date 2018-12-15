import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TimeZoneTestCase {
	private TimeZone timezone;
	private TimeZone timezone1;
	private TimeZone timezone2;
	private TimeZone timezone3;
	@Before
	public void setUp()
	{
		timezone=new TimeZone(12,30);
		timezone1=new TimeZone(1,31);
		timezone2=new TimeZone(2,30);
		timezone3=new TimeZone(3,20);
	}

	@Test
	public void HoursAndMinutes()
	{
		String expectedResult="14:1";
		TimeZone time=TimeZone.sum(timezone,timezone1); 
		assertEquals(expectedResult,time.hours+":"+time.minutes);
	}
	@Test
	public void HoursAndMinutes1()
	{
		String expectedResult="5:50";
		TimeZone time1=TimeZone.sum(timezone2,timezone3); 
		assertEquals(expectedResult,time1.hours+":"+time1.minutes);
	}

}
