import org.junit.Test;
import static org.junit.Assert.*;

public class ABBADiv1Test {
	
	@Test(timeout=2000)
	public void test0() {
		String initial = "A";
		String target = "BABA";
		assertEquals("Possible", new ABBADiv1().canObtain(initial, target));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String initial = "BAAAAABAA";
		String target = "BAABAAAAAB";
		assertEquals("Possible", new ABBADiv1().canObtain(initial, target));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String initial = "A";
		String target = "ABBA";
		assertEquals("Impossible", new ABBADiv1().canObtain(initial, target));
	}
	
	//@Test(timeout=2000)
	@Test
	public void test3() {
		String initial = "AAABBAABB";
		String target = "BAABAAABAABAABBBAAAAAABBAABBBBBBBABB";
		assertEquals("Possible", new ABBADiv1().canObtain(initial, target));
	}
	
	//@Test(timeout=2000)
	@Test
	public void test4() {
		String initial = "AAABAAABB";
		String target = "BAABAAABAABAABBBAAAAAABBAABBBBBBBABB";
		assertEquals("Impossible", new ABBADiv1().canObtain(initial, target));
	}
}
