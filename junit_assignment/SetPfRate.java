import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SetPfRate {
	private EmployeeSalary empsalary;
	private EmployeeSalary empsalary1;
	@Before
	public void setUp()
	{
		empsalary=new EmployeeSalary();
		empsalary1=new EmployeeSalary();
		empsalary.setId(007);
		empsalary.setName("hari");
		empsalary.setMonthlyBasicSalary(10000);
		empsalary.setPfRate(10);
		empsalary1.setMonthlyBasicSalary(20000);
	}

	@Test
	public void test()
	{
		assertEquals(6500,empsalary.PfRate(10),0);
	}

}
