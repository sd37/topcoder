import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class TreeAndVertex {

  public int get(int[] tree) {
    Map<Integer, Integer> vertexToDegree = new HashMap<>();

    for (int i = tree.length - 1; i >= 0; i--) {
      vertexToDegree.put(i + 1, vertexToDegree.getOrDefault(i + 1, 0) + 1);
      vertexToDegree.put(tree[i], vertexToDegree.getOrDefault(tree[i], 0) + 1);
    }


    int maxIndegree = vertexToDegree.entrySet()
        .stream()
        .max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1)
        .get()
        .getValue();

    return maxIndegree;
  }
}
