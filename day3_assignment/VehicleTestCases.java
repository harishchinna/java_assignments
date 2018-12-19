package day3_junit_assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleTestCases {
	private Vehicle vehicle;

	@Before
	public void setUp() {
		vehicle = new Vehicle();
		vehicle.setSpeed(120);
		vehicle.setDirectionInDegrees(0);
		vehicle.setName("hari");
		vehicle.setVehicleIdNumber(7);
	}

	@Test
	public void checkingDetailsOfVehicle()
	{
		assertEquals("Vehicle [speed=120, directionInDegrees=0.0, name=hari, vehicleIdNumber=7]",vehicle.toString());
	}
	@Test
	public void changeSpeedTest()
	{
		assertEquals(150,vehicle.changeSpeed(30));
	}
	@Test
	public void stopTest()
	{
		assertEquals(0,vehicle.stop());
	}
	@Test
	public void checkingHighestVehicleIdNumber()
	{
		assertEquals(1000,vehicle.displayinghighestVehicleIdNumber());
	}
	@Test
	public void changeDirectiontest()
	{
		assertEquals("east",vehicle.changeDirection(90,true));
	}
}
