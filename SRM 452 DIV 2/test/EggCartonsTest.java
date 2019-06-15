import org.junit.Test;
import static org.junit.Assert.*;

public class EggCartonsTest {
	
	@Test(timeout=2000)
	public void test0() {
		int n = 20;
		assertEquals(3, new EggCartons().minCartons(n));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int n = 24;
		assertEquals(3, new EggCartons().minCartons(n));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int n = 15;
		assertEquals(-1, new EggCartons().minCartons(n));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int n = 4;
		assertEquals(-1, new EggCartons().minCartons(n));
	}
}
