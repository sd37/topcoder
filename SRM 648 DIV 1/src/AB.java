import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class AB {

  public String createString(int N, int K) {
    int numA = N / 2;
    int numB = (N + 1) / 2;

    char soln[] = (stringOfSize('B', numB) + stringOfSize('A', numA)).toCharArray();

    while (K > 0) {
      boolean did_swap = false;
      for (int i = 0; i < soln.length - 1; i++) {
        if (soln[i] == 'B' && soln[i + 1] == 'A') {
          soln[i] = 'A';
          soln[i + 1] = 'B';
          did_swap = true;
          break;
        }
      }
      if(!did_swap) {
        return "";
      }
      K--;
    }

    return new String(soln);
  }

  public static String stringOfSize(char ch, int size) {
    final char[] arr = new char[size];
    Arrays.fill(arr, ch);
    return new String(arr);
  }
}
