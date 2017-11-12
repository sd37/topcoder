import java.util.*;
import java.math.*;
import java.util.AbstractMap.SimpleEntry;

import static java.lang.Math.*;

public class ABCPath {

  public int length(String[] grid) {
    // bfs and try to grow every path on each iteration.

    int rows = grid.length;
    int cols = grid[0].length();

    int[] dx = new int[]{-1, -1, -1, 0, 0, 1, 1, 1};
    int[] dy = new int[]{-1, 0, 1, -1, 1, -1, 0, 1};

    char[][] m = new char[rows][cols];

    boolean foundA = false;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        char ch = grid[i].charAt(j);

        if (ch == 'A') {
          foundA = true;
          m[i][j] = 'A';
        } else {
          m[i][j] = Character.toLowerCase(ch);
        }
      }
    }

    int count = 0;

    if(!foundA) {
      return count;
    }

    boolean keepGoing = true;
    char currentChar = 'A';

    while (keepGoing) {
      count++;
      keepGoing = false;
      for (int x = 0; x < rows; x++) {
        for (int y = 0; y < cols; y++) {
          if(m[x][y] != currentChar) {
            continue;
          }

          for (int k = 0; k < dx.length; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            if (nx >= 0 && nx < rows && ny >= 0 && ny < cols
                && currentChar != 'Z'
                && m[nx][ny] == Character.toLowerCase(currentChar + 1)) {
              m[nx][ny] = Character.toUpperCase(m[nx][ny]);
              keepGoing = true;
              break;
            }
          }
        }
      }
      currentChar++;
    }

    return count;
  }
}
