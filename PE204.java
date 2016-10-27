import java.util.HashMap;
import java.util.HashSet;


public class PE204 {
	
	public static void main(String[] args) {
	HashMap<Integer, Boolean> primes = new HashMap<Integer, Boolean>();
	for (int i = 2; i < 1000000; i++) {
		primes.put(i, true);
	}
	primes.put(1, false);
	for (int j = 2; j < 1000; j++) {
		if (primes.get(j)) {
			    for (int k = j*j; k < 1000000; k+=j) {		
				    primes.put(k, false);
			    }
		}
	}
	System.out.println("Done getting primes");
	HashSet<Integer> primeSet = new HashSet<Integer>();
	for (int a: primes.keySet()) {
		if (primes.get(a) && a > 100) {
			primeSet.add(a);
		}
	}
	HashSet<Integer> hamming = new HashSet<Integer>();
	    for (int k: primeSet) {
	    	int m = 1;
	    	while (m*k < 100000000) {
	    		hamming.add(m*k);
	    	}
	    }
	    int ans = 100000000 - hamming.size();
	    System.out.println("The answer is: " + ans);
	}
}
