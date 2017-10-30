import org.junit.Test;
import static org.junit.Assert.*;

public class ABTest {
	
	@Test(timeout=2000)
	public void test0() {
		int N = 3;
		int K = 2;
		assertEquals("ABB", new AB().createString(N, K));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int N = 2;
		int K = 0;
		assertEquals("BA", new AB().createString(N, K));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int N = 5;
		int K = 8;
		assertEquals("", new AB().createString(N, K));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int N = 10;
		int K = 12;
		// BAABBABAAB is also correct
		assertEquals("AABBBABBAA", new AB().createString(N, K));
	}
}
