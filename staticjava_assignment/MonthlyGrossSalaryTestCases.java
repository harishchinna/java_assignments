import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MonthlyGrossSalaryTestCases {
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
	public void monthlyGross() {
		assertEquals(17050,empsalary.getMonthlyGrossSalary(),0);
	}
	@Test
	public void monthlyGross1() {
		assertEquals(32050,empsalary1.getMonthlyGrossSalary(),0);
	}

}
