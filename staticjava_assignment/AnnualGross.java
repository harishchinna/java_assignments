import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AnnualGross {
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
	public void annualSalary() {
		assertEquals(204600,empsalary.getAnnualSalary(),0);
	}
	@Test
	public void annualSalary2() {
		assertEquals(384600,empsalary1.getAnnualSalary(),0);
	}

}
