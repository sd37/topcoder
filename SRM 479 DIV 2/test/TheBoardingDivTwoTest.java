import org.junit.Test;
import static org.junit.Assert.*;

public class TheBoardingDivTwoTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] pattern = new int[] {-1, -1};
		int boardingTime = 100;
		assertEquals(1, new TheBoardingDivTwo().find(pattern, boardingTime));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] pattern = new int[] {-1, 2, -1};
		int boardingTime = 222;
		assertEquals(1, new TheBoardingDivTwo().find(pattern, boardingTime));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] pattern = new int[] {2, 1, 3, 5, 4, 6};
		int boardingTime = 155;
		assertEquals(1, new TheBoardingDivTwo().find(pattern, boardingTime));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] pattern = new int[] {-1, -1, -1, -1, -1, -1, -1};
		int boardingTime = 198;
		assertEquals(233, new TheBoardingDivTwo().find(pattern, boardingTime));
	}
}
