import java.util.HashMap;
import java.util.HashSet;


public class PE131 {

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
    		if (primes.get(a)) {
    			primeSet.add(a);
    		}
    	}
    	long[] cubes = new long[1000000];
    	HashSet<Long> pubes = new HashSet<Long>();
    	for (long b = 1; b <= 1000000; b++) {
    		cubes[(int) (b-1)] = (b*b*b);
    		pubes.add(b*b*b);
    	}
    	int ans = 0;
    	for (int p: primeSet) {
    		boolean fails = true;
    		long prune = (long) p;
    	    long n = 1;
    	    long k = 1;
    		while(fails) {
		    	long cube = k*k*k + k*k*prune;
    		    if (pubes.contains(cube)) {
    		    	ans++;
    		    	System.out.println("For p = " + prune + " n equals " + k + " and cube is " + cube);
    		    	fails = false;
    		    }
    		    n++;
    		    k = n*n*n;
    		    if (n > 300) {
    		    	fails = false;
    		    }
    		}
    	}
    	System.out.println("The answer is: " + ans);
	}
	
}
