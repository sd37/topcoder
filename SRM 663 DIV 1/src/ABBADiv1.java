import java.util.*;
import java.math.*;

import static java.lang.Math.*;

public class ABBADiv1 {

  public String canObtain(String initial, String target) {
    return directedCanObtain(initial, target) ? "Possible" : "Impossible" ;
  }

  public boolean directedCanObtain(String cur, String target) {

    if(cur.equals(target)) {
      return true;
    }

    if(cur.length() > target.length()){
      return false;
    }

    char firstCharTarget  = target.charAt(0);

    // Add 'A' at the end.
    if(directedCanObtain(cur + "A", target)) {
      return true;
    }

    // Add 'B' at the end and reverse.
    if(firstCharTarget != 'A' && directedCanObtain(reverseString(cur + "B"), target)) {
      return true;
    }

    return false;
  }

  public String reverseString(String s) {
    if(s == null) {
      return null;
    }
    return new StringBuilder(s).reverse().toString();
  }
}
