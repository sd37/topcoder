import java.util.*;
import java.math.*;

import static java.lang.Math.*;

// Topcoder environment setup test.
// Status = AC
public class Containers {

  public int wastedSpace(int[] containers, int[] packages) {
    int r = 0;
    for (int x : containers) {
      r += x;
    }
    for (int y : packages) {
      r -= y;
    }
    return r;
  }
}
