import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class PE124 {
	public static PriorityQueue<Integer> generatePrimes() {
	HashMap<Integer, Boolean> primes = new HashMap<Integer, Boolean>();
	for (int i = 2; i < 100000; i+=1) {
		primes.put(i, true);
	}
	System.out.println("DonJuan");
	for (int j = 2; j < 3200; j+=1) {
		if (primes.get(j)) {
			    for (int k = j*j; k < 100000; k+=j) {		
				    primes.put(k, false);
			    }
		}
		//System.out.println(j);
	}
	System.out.println("DoneTwo");
	PriorityQueue<Integer> pvalues = new PriorityQueue<Integer>();
	for (int a: primes.keySet()) {
		if (primes.get(a)) {
			pvalues.add(a);
		}
	}

	return pvalues;
	}
	
    public static int product(int n, PriorityQueue<Integer> primes) {
    	int prod = 1;
    	int na = n;
    	while(primes.size() > 0) {
    		int a = primes.poll();
    		boolean once = true;
    		while (n%a == 0) {
    			if (once) {
    				prod *= a;
    				once = false;
    			}
    			n = (int) Math.floor(n/a);
    		}
    	}
    	System.out.println("The product for " + na + " is " + prod);
    	return prod;
    }
    public static void main(String[] args) {
    	HashMap<Integer, Integer> pairs = new HashMap<Integer, Integer>();
    	for (int a = 1; a <= 100000; a++) {
    		pairs.put(a, product(a, generatePrimes()));
    	}
    	HashMap<Integer, Integer> sorted = new HashMap<Integer, Integer>();
    	int counter = 0;
    	for (int b = 1; b <= 100000; b++) {
    		for (int c: pairs.keySet()) {
    			if (b == pairs.get(c)) {
    				sorted.put(c, b);
    				counter++;
    				if (counter == 10000) {
    					System.out.println("The answer is " + c);
    				}
    			}
    		}
    	}
    }
}
