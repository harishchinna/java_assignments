package Basic_assignment;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DiscountTest {
private Discount discount;
@Before
public void setUp()
{
	discount=new Discount();
}
	@Test
	public void PassingValue() {
		assertEquals(2600,discount.itemDiscount(4000));
	}
	@Test
	public void PassingNegativeValue() {
		assertEquals(0,discount.itemDiscount(-4000));
	}

}
