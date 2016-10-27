import java.util.HashMap;
import java.util.HashSet;

// Use 33554432, and 5800 for the actual prime values. 

public class PE193 {
	public static void main(String[] args) {
		final long startTime = System.currentTimeMillis();

	HashMap<Integer, Boolean> primes = new HashMap<Integer, Boolean>();
	HashSet<Integer> primesOnly = new HashSet<Integer>();
	for (int i = 2; i < 33554432; i+=1) {
		primes.put(i, true);
	}
	System.out.println("DonJuan");
	for (int j = 2; j < 5800; j+=1) {
		if (primes.get(j)) {
			    for (int k = j*j; k < 33554432; k+=j) {		
				    primes.put(k, false);
			    }
		}
	}
	System.out.println("DonHuu");
	for (int a: primes.keySet()) {
		if (primes.get(a)) {
			primesOnly.add(a);
		}
	}
	final long endTime = System.currentTimeMillis();
	System.out.print(startTime - endTime);

	long valid = (long) Math.pow(2, 50);
	
	}
}
