import org.junit.Test;
import static org.junit.Assert.*;

public class BoxesDiv2Test {
	
	@Test(timeout=2000)
	public void test0() {
		int[] candyCounts = new int[] {8,8};
		assertEquals(16, new BoxesDiv2().findSize(candyCounts));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] candyCounts = new int[] {5,6};
		assertEquals(16, new BoxesDiv2().findSize(candyCounts));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] candyCounts = new int[] {1,7};
		assertEquals(16, new BoxesDiv2().findSize(candyCounts));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] candyCounts = new int[] {1,1,13,1,1};
		assertEquals(32, new BoxesDiv2().findSize(candyCounts));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] candyCounts = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32};
		assertEquals(1024, new BoxesDiv2().findSize(candyCounts));
	}
}
