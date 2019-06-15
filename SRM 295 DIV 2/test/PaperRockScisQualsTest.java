import org.junit.Test;
import static org.junit.Assert.*;

public class PaperRockScisQualsTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] players = new String[] {"PPRRS","PPRRP","PPRSP","PPSSP"};
		assertEquals(0, new PaperRockScisQuals().whoPassed(players));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] players = new String[] {"RRRRR","PPPPP","RRRRR","PPPPP"};
		assertEquals(1, new PaperRockScisQuals().whoPassed(players));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] players = new String[] {"RRRRR","PPPPP","SSSSS","PPPPP"};
		assertEquals(2, new PaperRockScisQuals().whoPassed(players));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] players = new String[] {"RRRRR","PPPPP","SSSSS","SSSSS","RRRRR","RRRRR"};
		assertEquals(0, new PaperRockScisQuals().whoPassed(players));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String[] players = new String[] {"PPRPS","RRRPR","SSPRS","SSPRR","PPRSP","SPRPS","SPRSP","PRSPR","PRSPR"};
		assertEquals(6, new PaperRockScisQuals().whoPassed(players));
	}
}
