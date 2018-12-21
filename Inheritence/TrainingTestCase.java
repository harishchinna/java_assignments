package Inheritence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TrainingTestCase {
	private Training training,training1;
	@Before
	public void setUp()
	{
		training=new publicTraining("java",5000);
		training1=new CorporateTraining("BigData",35000);
	}

	@Test
	public void checkingPublicTrainingClass() 
	{
		assertEquals(250000,training.getOrderValue(),0.0);
	}
	@Test
	public void checkingCorporateTrainingClass() 
	{
		assertEquals(140000,training1.getOrderValue(),0.0);
	}

}
