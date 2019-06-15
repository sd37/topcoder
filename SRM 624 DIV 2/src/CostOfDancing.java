import java.util.*;
import java.math.*;
import java.util.stream.IntStream;

import static java.lang.Math.*;

public class CostOfDancing {
	
	public int minimum(int K, int[] danceCost) {
		Arrays.sort(danceCost);

		return IntStream.range(0, K).map(i -> danceCost[i]).sum();
	}
}
