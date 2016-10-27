import java.util.HashMap;
import java.util.HashSet;

public class PE179 {

    public static int divisors(int n, HashSet<Integer> primes) {
    	int divisors = 1;
    	int temp = n;
    	HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
    	for (int c: primes) {
    		while(n%c == 0) {
    			if (!counts.keySet().contains(c)) {
    				counts.put(c, 1);
    			}
    			else {
    				counts.put(c, counts.get(c) + 1);
    			}
    			n = n/c;
    		}
    	}
    	for (int d: counts.keySet()) {
    		divisors *= (counts.get(d) + 1);
    	}
    	System.out.println(temp + " has " + divisors + " divisors");
		return divisors;   	
    }
	
	public static void main(String[] args) {
		HashMap<Integer, Boolean> primes = new HashMap<Integer, Boolean>();
    	for (int i = 2; i < 5000000; i++) {
    		primes.put(i, true);
    	}
    	primes.put(1, false);
    	for (int j = 2; j < 2500; j++) {
    		if (primes.get(j)) {
    			    for (int k = j*j; k < 5000000; k+=j) {		
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
    	System.out.print("Done setting primes");
    	int adj = 0;
    	HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
    	for (int b = 2; b < 10000000; b++) {
    		counts.put(b, divisors(b, primeSet));
    	}
    	System.out.println("Done getting divisors");
    	for (int c = 2; c < 10000000; c++) {
    		if (counts.get(c) == counts.get(c+1)) {
    			adj++;
    		}
    	}
    	System.out.println("The answer is: " + adj);
	}
	
}
