import java.util.HashMap;


public class PE58 {
	public static void main(String[] args) {
	HashMap<Integer, Boolean> primes = new HashMap<Integer, Boolean>();
	for (int i = 3; i < 25000000; i+=2) {
		primes.put(i, true);
	}
	System.out.println("Done");
	for (int j = 3; j < 5000; j+=2) {
		if (primes.get(j)) {
			    for (int k = j*j; k < 25000000; k+=2*j) {		
				    primes.put(k, false);
			    }
		}
		System.out.println(j);
	}
	double total = 1;
	int nums = 1;
	double prime = 0;
	int length = 0;
	boolean stop = true;
	while(stop) {
		length++;
		for (int a = 0; a < 4; a++) {
			nums += 2*length;
			total++;
			if(primes.get((int)nums)) {
				prime++;
			}
			if (prime/total < 0.1000) {
				System.out.println(length);
				stop = false;
			}
		}
		System.out.println(prime/total);
	}
}
}
