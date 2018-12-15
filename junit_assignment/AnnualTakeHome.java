import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AnnualTakeHome {
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
		empsalary1.setMonthlyBasicSalary(20000);
	}


	@Test
	public void annualTakeHome() {
		assertEquals(217200,empsalary.getAnnualTakeHome(),0);
	}
	@Test
	public void annualTakeHome1() {
		assertEquals(409800,empsalary1.getAnnualTakeHome(),0);
	}

}
