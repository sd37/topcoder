import org.junit.Test;
import static org.junit.Assert.*;

public class TheCoffeeTimeDivTwoTest {
	
	@Test(timeout=2000)
	public void test0() {
		int n = 2;
		int[] tea = new int[] {1};
		assertEquals(108, new TheCoffeeTimeDivTwo().find(n, tea));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int n = 2;
		int[] tea = new int[] {2, 1};
		assertEquals(59, new TheCoffeeTimeDivTwo().find(n, tea));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int n = 15;
		int[] tea = new int[] {1, 2, 3, 4, 5, 6, 7};
		assertEquals(261, new TheCoffeeTimeDivTwo().find(n, tea));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int n = 47;
		int[] tea = new int[] {1, 10, 6, 2, 4};
		assertEquals(891, new TheCoffeeTimeDivTwo().find(n, tea));
	}
}
