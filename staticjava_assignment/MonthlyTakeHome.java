import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MonthlyTakeHome {
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
	public void monthlyTakeHome() {
		assertEquals(18100,empsalary.getMonthlyTakeHome(),0);
	}
	@Test
	public void monthlyTakeHome1() {
		assertEquals(34150,empsalary1.getMonthlyTakeHome(),0);
	}
	

}
