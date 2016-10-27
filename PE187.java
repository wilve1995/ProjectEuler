import java.util.HashMap;
import java.util.HashSet;


public class PE187 {
	public static void main(String[] args) {
	HashMap<Integer, Boolean> primes = new HashMap<Integer, Boolean>();
	for (int i = 2; i < 1000; i++) {
		primes.put(i, true);
	}
	primes.put(1, false);
	for (int j = 2; j < 32; j++) {
		if (primes.get(j)) {
			    for (int k = j*j; k < 1000; k+=j) {		
				    primes.put(k, false);
			    }
		}
	}
	System.out.println("Done getting primes");
	HashSet<Integer> primeSet = new HashSet<Integer>();
	for (int a: primes.keySet()) {
		if (primes.get(a)) {
			primeSet.add(a);
		}
	}
	int count = 0;
	boolean chill = true;
	for (int n = 4; n < 1000; n++) {
		chill = true;
		if (primeSet.contains(n)){
			chill = false;
		}
		
		for (int p: primeSet) {
			while(chill) {
			    if (p < 10 && (double)n/p%1 == 0 && n/p > 10000000) {
				    boolean gucci = true;
				    while (gucci) {
				        for (int k: primeSet) {
					        if (k < Math.sqrt(n/p)+1) {
						        if ((double)(n/p)/k%1 == 0) {
							        gucci = false;
						        }
					        }
				        }
				        if (gucci) {
					        count++;
					        chill = false;
					        gucci = false;
				        }
				    }
			    }
			    if (p < n && (double)n/p%1 == 0) {	
			    	if (primeSet.contains(n/p)) {
			    		count++;
			    		System.out.println(n + " is a semiprime, with factors " + p + " and " + n/p);
			    		chill = false;
			    	}
			    }
		    }
		}
	}
	System.out.println("The answer is: " + count);
	}
}
