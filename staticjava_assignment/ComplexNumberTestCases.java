import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ComplexNumberTestCases {
	private  ComplexNumbers complex;
	private  ComplexNumbers complex1;
	@Before
	public void setUp()
	{
		complex=new ComplexNumbers(2.4,6.7);
		complex1=new ComplexNumbers(5.6,7.6);
	}

	@Test
	public void ComplexNumbers() 
	{
		String expectedValue="8.0+14.3i";
		ComplexNumbers answer = ComplexNumbers.sum(complex, complex1);
		assertEquals(expectedValue, answer.real+"+"+answer.imaginary+"i");
	}

}
