import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;

public class PE62 {

	public static void main(String[] args) {
		double d = 2/3;
		System.out.println(d);
		HashSet<Long> cubes = new HashSet<Long>();
		for (long i = 1; i < Math.pow(2, 21); i++) {
			cubes.add(i*i*i);
		}
		HashMap<String, ArrayList<Long>> sameCubes = new HashMap<String, ArrayList<Long>>();
		for (long k: cubes) {
			long temp = k;
			HashMap<Long, Integer> digits = new HashMap<Long, Integer>();
			for (long j = 0; j < 10; j++) {
				digits.put(j, 0);
			}
			while (k > 0) {
				long dig = k%10;
				k = k/10;
				digits.put(dig, digits.get(dig)+1);
			}
			long sorted = 0;
			for (long w = 9; w >= 0; w--) {
				for (int v = 0; v < digits.get(w); v++) {
					sorted += w;
					sorted = sorted*10;
				}
			}
			String pal = Long.toString(sorted);
			ArrayList<Long> cocks = new ArrayList<Long>();

			if (!sameCubes.containsKey(pal)) {
				sameCubes.put(pal, cocks);
			}
			ArrayList<Long> huu = sameCubes.get(pal);
			huu.add(temp);
			sameCubes.put(pal, huu);
		}
		long micro = Long.MAX_VALUE;
		for (String s: sameCubes.keySet()) {
			if (sameCubes.get(s).size() == 5) {
				for (long q: sameCubes.get(s)) {
					if (q < micro) {
						micro = q;
					}
				}
			}
		}
		System.out.println("The Answer is: " + micro);
	}
}
