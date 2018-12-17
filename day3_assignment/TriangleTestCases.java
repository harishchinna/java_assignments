package day3_junit_assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TriangleTestCases {
	private Triangle triangle;
	private Triangle triangle1;
	private Triangle triangle2;
	private Triangle triangle3;
	@Before
	public void setUp()
	{
		triangle=new Triangle(6,8,10);
		triangle1=new Triangle(6,7,8);
		triangle2=new Triangle(6,6,7);
		triangle3=new Triangle(7,7,7);
	}

	@Test
	public void checkingRightAngle()
	{
		assertEquals(true,triangle.isRight());
	}
	@Test
	public void checkingScalaneTriangle()
	{
		assertEquals(true,triangle1.isScalene());
	}
	@Test
	public void checkingIsoscelesTriangle()
	{
		assertEquals(true,triangle2.isIsosceles());
	}
	@Test
	public void checkingEquilateralTriangle()
	{
		assertEquals(true,triangle3.isEquilateral());
	}

}
