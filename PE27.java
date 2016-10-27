import java.util.HashMap;


public class PE27 {
    public static void main(String[] args) {
    	
    	long sum = 2;
    	HashMap<Integer, Boolean> primes = new HashMap<Integer, Boolean>();
    	for (int i = 2; i < 2000000; i++) {
    		primes.put(i, true);
    	}
    	primes.put(1, false);
    	for (int j = 2; j < 1414; j++) {
    		if (primes.get(j)) {
    			    for (int k = j*j; k < 2000000; k+=j) {		
    				    primes.put(k, false);
    			    }
    		}
    	}
    	int max_count = 0;
    	int max_a = 0;
    	int max_b = 0;
    	for (int k = 3; k < 1000; k+= 2) {
    		if (primes.get(k)) {
    			for (int x = -999; x < 1000; x+=2) {
    				int n = 0;
    				boolean chain = true;
    				while (chain) {
    					int value = n*n+n*x+k;
    					System.out.print(value);
    					System.out.println(" Given by a = " + x + "and b = " + k);
    					if (value <= 0 || !primes.get(value)) {
    						chain = false;
    					}
    					n++;		
    				}    				
   				    if (n > max_count) {
					    max_count = n;
					    max_a = x;
					    max_b = k;
				    }
    			}
    		}
    	}
    	/*for (long w = 3; w < 2000000; w+=2) {
    		if (primes.get(w)) {
    			sum += w;
    			System.out.println(w);
    		}
    	}*/
    	System.out.println("We get " + max_count + " primes with " + max_a + " " + max_b);
    	System.out.println(max_a * max_b);
    }
}
