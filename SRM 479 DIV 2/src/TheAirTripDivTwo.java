import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class TheAirTripDivTwo {
	
	public int find(int[] flights, int fuel) {
	    int count = 0;
		for (int flight : flights) {
			fuel -= flight;
			if (fuel < 0)
			{
				break;
			}

			count++;
		}
		return count;
	}
}
