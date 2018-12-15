import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MonthlyDeductions {
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
	public void monthlyDeductions() {
		assertEquals(1100,empsalary.getMonthlyDeductions(),0);
	}
	@Test
	public void monthlyDeductions1() {
		assertEquals(2100,empsalary1.getMonthlyDeductions(),0);
	}


}
