import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AnnualSalaryTestCase {
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
	public void monthBasic() {
		assertEquals(120000,empsalary.getAnnualBasic(),0);
	}
	@Test
	public void monthbasic1() {
		assertEquals(240000,empsalary1.getAnnualBasic(),0);
	}

}
