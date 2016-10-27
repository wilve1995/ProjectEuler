import java.util.HashMap;
import java.util.HashSet;


public class PE123 {
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
	    HashMap<Integer, Integer> primeMap = new HashMap<Integer, Integer>();
	    int count = 1;
	    for (int a = 2; a < 1000000; a++) {
	    	if (primes.get(a)) {
	    		primeMap.put(count, a);
	    		count++;
	    	}
	    }
	    for (int b = 1; b <= 30000; b++) {
	    	long prod = 2*(long)b*(long)primeMap.get(b);
	    	if (prod > 10000000000L) {
	    		System.out.println("The answer is: " + b);
	    		System.exit(0);
	    	}
	    }
	}
}
