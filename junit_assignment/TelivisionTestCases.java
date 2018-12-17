import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TelivisionTestCases {
	private Television tv;
	
	@Before
	public void setUp()
	{
		tv=new Television();
		tv.setState(true);
		tv.setChannel(67);
		tv.setVolume(76);
		
	}
	@Test
	public void checkState()
	{
		assertEquals(true,tv.checkState());
	}
	@Test
	public void chechChannel()
	{
		assertEquals(67,tv.currentChannel());
	}
	@Test
	public void checkVolume()
	{
		assertEquals(76,tv.currentVolume());
	}
	@Test
	public void channelIncrement()
	{
		assertEquals(68,tv.channelIncrement());
	}
	@Test
	public void channelDecrement()
	{
		assertEquals(66,tv.channelDecrement());
	}
	@Test
	public void volumeIncrement()
	{
		assertEquals(77,tv.volumeIncrement());
	}
	@Test
	public void volumeDecrement()
	{
		assertEquals(75,tv.volumeDecrement());
	}

}
