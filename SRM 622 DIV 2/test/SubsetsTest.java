import org.junit.Test;
import static org.junit.Assert.*;

public class SubsetsTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] numbers = new int[] {1,1,1};
		assertEquals(2, new Subsets().findSubset(numbers));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] numbers = new int[] {1,1,1,1,2,2,2,2};
		assertEquals(13, new Subsets().findSubset(numbers));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] numbers = new int[] {1,2,3,4};
		assertEquals(3, new Subsets().findSubset(numbers));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] numbers = new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,10,20,30,40,50};
		assertEquals(77, new Subsets().findSubset(numbers));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] numbers = new int[] {1,1,1,1,1,1,1,1,1,1,1,2,3,4,2,2,2};
		assertEquals(100, new Subsets().findSubset(numbers));
	}
	
	@Test(timeout=2000)
	public void test5() {
		int[] numbers = new int[] {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
 1,1,1,1,1,1,2,2,2,3,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};
		assertEquals(8050, new Subsets().findSubset(numbers));
	}
	
	@Test(timeout=2000)
	public void test6() {
		int[] numbers = new int[] {5,3};
		assertEquals(0, new Subsets().findSubset(numbers));
	}
}
