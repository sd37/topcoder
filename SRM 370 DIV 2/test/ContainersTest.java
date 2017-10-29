import org.junit.Test;
import static org.junit.Assert.*;

public class ContainersTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] containers = new int[] { 5, 5, 5 };
		int[] packages = new int[] { 5, 5, 5 };
		assertEquals(0, new Containers().wastedSpace(containers, packages));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] containers = new int[] { 5, 6, 7 };
		int[] packages = new int[] { 5, 5, 5 };
		assertEquals(3, new Containers().wastedSpace(containers, packages));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] containers = new int[] { 2, 3, 5 };
		int[] packages = new int[] { 3 };
		assertEquals(7, new Containers().wastedSpace(containers, packages));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] containers = new int[] { 3, 4, 5, 6 };
		int[] packages = new int[] { 3, 3, 3, 3, 3 };
		assertEquals(3, new Containers().wastedSpace(containers, packages));
	}
}
