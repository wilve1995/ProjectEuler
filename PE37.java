	import java.util.HashMap;


public class PE37 {

	public static long chopLeft(long n) {
		String a = Long.toString(n);
		a = a.substring(1);
		System.out.print(a);
		return Long.parseLong(a);		
	}
	
	    public static void main(String[] args) {
	    	
	    	long sum = 0;
	    	int count = 0;
	    	HashMap<Long, Boolean> primes = new HashMap<Long, Boolean>();
	    	primes.put((long) 1, false);
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
	    	for (long w = 11; w < 1000000; w+=2) {
	    		boolean trunk = true;
	    		long left = w;
	    		long right = w;
	    		while (left > 0) {
	    			if (!primes.get(left)) {
	    				trunk = false;
	    			}
	    			if (!primes.get(right)) {
	    				trunk = false;
	    			}

	    			right = (long)Math.floor(right/10);
	    			left = left % (long) Math.pow(10, (long) Math.log10(left));;
	    		}
	    		if (trunk) {
	    			sum += w;
	    			count++;
	    			System.out.println(w);
	    		}
	    	}
	    	System.out.println("There are " + count + " of these.");
	    	System.out.println("The answer is:");
	    	System.out.println(sum);
	    }
}
