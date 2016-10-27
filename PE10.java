import java.util.HashMap;

public class PE10 {
    public static void main(String[] args) {
    	
    	long sum = 2;
    	HashMap<Long, Boolean> primes = new HashMap<Long, Boolean>();
    	for (long i = 2; i < 2000000; i++) {
    		primes.put(i, true);
    	}
    	for (long j = 2; j < 1414; j++) {
    		if (primes.get(j)) {
    			    for (long k = j*j; k < 2000000; k+=j) {		
    				    primes.put(k, false);
    			    }
    		}
    	}
    	for (long w = 3; w < 2000000; w+=2) {
    		if (primes.get(w)) {
    			sum += w;
    			System.out.println(w);
    		}
    	}
    	System.out.println("The answer is:");
    	System.out.println(sum);
    	System.out.println((6.0/3)%1 == 0);
    	int[] BIG = new int[1000000000];
    	for (int k = 0; k < 1000000000; k++) {
    		BIG[k] = k;
    	}
    	System.out.println(BIG[3498]);
    }
}
