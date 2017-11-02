import java.lang.reflect.Array;
import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class SortingSubsets {

  public int getMinimalSize(int[] a) {
		int[] copyA = Arrays.copyOf(a, a.length);
    Arrays.sort(a);

    int diff = 0;

    for(int i = 0; i < a.length; i++) {
      if(a[i] != copyA[i]) {
        diff++;
      }
    }
    return diff;
  }
}
