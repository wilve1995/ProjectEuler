import java.util.HashMap;

public class PE35 {
    public static void main(String[] args) {
    	
    	long sum = 1;
    	HashMap<Long, Boolean> primes = new HashMap<Long, Boolean>();
    	for (long i = 2; i < 1000000; i++) {
    		primes.put(i, true);
    	}
    	for (long j = 2; j < 1000; j++) {
    		if (primes.get(j)) {
    			    for (long k = j*j; k < 1000000; k+=j) {		
    				    primes.put(k, false);
    			    }
    		}
    	}
    	for (long w = 3; w < 1000000; w+=2) {
    		boolean rotor = true;
    		int length = (int)(Math.log10(w)+1);
    		for (int v = 1; v <= length; v++) {
    			w = (long) ((w%10)*Math.pow(10, length-1)+Math.floor(w/10));
    			//System.out.println(w);
    		    if (primes.get(w) != true) {
                    rotor = false;
    		    }
    		}
    		if (rotor) {
    			sum += 1;
    			//System.out.print("Valid Number ");
    			System.out.println(w);
    			//System.out.println(" End Message");
    		}
    	}
    	System.out.println("The answer is:");
    	System.out.println(sum);
    }
}
