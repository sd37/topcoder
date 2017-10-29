import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class TriangleEasy {

  public int find(int n, int[] x, int[] y) {
    boolean[][] adjMat = new boolean[n][n];

    for (int e = 0; e < x.length; e++) {
      adjMat[x[e]][y[e]] = true;
      adjMat[y[e]][x[e]] = true;
    }

    int TOTAL_TRIANGLE_EDGES = 3;

    int min_edges_needed = TOTAL_TRIANGLE_EDGES;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        for (int k = 0; k < n; k++) {
          int count = 0;
          count += adjMat[i][j] ? 1 : 0;
          if (i != k)
            count += adjMat[j][k] ? 1 : 0;
          if(j != i && j != k) // othewise it is the same edge
            count += adjMat[k][i] ? 1 : 0;

          if (min_edges_needed >= 0 && min_edges_needed > (TOTAL_TRIANGLE_EDGES - count)) {
            min_edges_needed = TOTAL_TRIANGLE_EDGES - count;
          }
        }
      }
    }
    return min_edges_needed;
  }
}
