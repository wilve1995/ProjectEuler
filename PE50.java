import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Arrays;


public class PE50 {
	
    public static int primeSum(int a, int b, int[] primes) {
    	int sum = 0;
    	for (int i = a; i < b; i++) {
    		sum += primes[i];
    	}
    	return sum;
    }
	
    public static void main(String[] args) {
		HashMap<Integer, Boolean> primes = new HashMap<Integer, Boolean>();
		for (int i = 2; i < 1000000; i+=1) {
			primes.put(i, true);
		}
		for (int j = 2; j < 1000; j+=1) {
			if (primes.get(j)) {
				    for (int k = j*j; k < 1000000; k+=j) {		
					    primes.put(k, false);
				    }
			}
			//System.out.println(j);
		}
		PriorityQueue<Integer> pvalues = new PriorityQueue<Integer>();
		for (int a: primes.keySet()) {
			if (primes.get(a)) {
				pvalues.add(a);
			}
		}
		int[] princeton = new int[78498];
		int count = 0;
		for (int b: pvalues) {
			princeton[count] = b;
			count++;
		}
		Arrays.sort(princeton);
		for (int k = 0; k < 100; k++) {
			System.out.println(princeton[k]);
		}
		/*HashMap<Integer, Integer> counts = new HashMap<Integer, Integer>();
		 * for (int e = 0; e< 500; e++) {
		 *     for (int f = e+1; f < 78498; f++) {
		 *         int sumPrimes = 0;
		 *         for (int g = e; g < f; g++) {
		 *         
		 *         int sumPrimes += princeton[g];
		 *         }
		 *         if (primes.get(sumPrimes)) {
		 *             counts.put(sumPrimes, g-f);
		 *         }
		 *     }
		 * }
		 */
        int max_count = 0;
        for (int z = 10000; z < 78498; z++) {
        	for (int x = 0; x < 500; x++) {
        		for (int y = x+250; y <= Math.min(x+550, z); y++) {
        			int sum = 0;
        	    	for (int i = x; i < y; i++) {
        	    		sum += princeton[i];
        	    	}
        			if (sum == princeton[z]) {
        				if (max_count < y-x) {
        					max_count = y-x;
        					System.out.println(max_count + " primes for " + princeton[z]);
        				}
        			}
        			
        		}
        	}
        }
        System.out.println("The answer is: " + max_count);
	    }
}
