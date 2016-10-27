import java.util.HashMap;


public class PE47 {
	
	public static int count(int n, HashMap<Integer, Boolean> primes) {
		int sum = 0;
		for (int a: primes.keySet()) {
			if (primes.get(a)) {
			if (n%a == 0) {
				sum++;
			}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		HashMap<Integer, Boolean> primes = new HashMap<Integer, Boolean>();
    	for (int i = 2; i < 1000; i++) {
    		primes.put(i, true);
    	}
    	for (int j = 2; j < 40; j++) {
    		if (primes.get(j)) {
    			    for (int k = j*j; k < 1000; k+=j) {		
    				    primes.put(k, false);
    			    }
    		}
    	}
    	boolean solved = true;
    	int a = 100;
    	while (solved) {

    		if (count(a, primes) == 4) {
    			if (count(a+1, primes) == 4) {
    				if (count(a+2, primes) == 4) {
    					if (count(a+3, primes) == 4) {
    						solved = false;
    					}
    				}
    			}
    		}
    		a++;
    		
    	}
    	System.out.println("The answer is " + (a-1));
	}
	
}
