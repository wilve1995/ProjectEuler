import java.util.HashMap;
import java.util.HashSet;


public class PE87 {
	public static void main(String[] args) {
	int sum = 0;
	HashMap<Integer, Boolean> primes = new HashMap<Integer, Boolean>();
	for (int i = 2; i < 7100; i++) {
		primes.put(i, true);
	}
	for (int j = 2; j < 100; j++) {
		if (primes.get(j)) {
			    for (int k = j*j; k < 7100; k+=j) {		
				    primes.put(k, false);
			    }
		}
	}
	HashSet<Integer> powers = new HashSet<Integer>();
	
	for (int a = 2; a < 84; a++) {
		if (primes.get(a)) {
			for(int b = 2; b < 369; b++) {
				if (primes.get(b)) {
					for (int c = 2; c < 7100; c++) {
						if (primes.get(c)) {
							int cctv = (int) (Math.pow(a, 4) + Math.pow(b, 3) + Math.pow(c, 2));
							if (cctv < 50000000) {
								powers.add(cctv);
							}
						}
					}
				}
			}
		}
	}
	System.out.println(powers.size());
	}
}
