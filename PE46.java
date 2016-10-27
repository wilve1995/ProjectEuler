import java.util.HashMap;
import java.util.HashSet;

public class PE46 {
	public static void main(String[] args) {
	HashMap<Integer, Boolean> primes = new HashMap<Integer, Boolean>();
	HashSet<Integer> primesOnly = new HashSet<Integer>();
	for (int i = 2; i < 1000000; i+=1) {
		primes.put(i, true);
	}
	System.out.println("DonJuan");
	for (int j = 2; j < 1000; j+=1) {
		if (primes.get(j)) {
			    for (int k = j*j; k < 1000000; k+=j) {		
				    primes.put(k, false);
			    }
		}
	}
	System.out.println("DonHuu");
	for (int a: primes.keySet()) {
		if (primes.get(a)) {
			primesOnly.add(a);
		}
	}
	System.out.println("Daekun");
	int[] doubleSq = new int[10000];
	for (int b = 1; b <= 10000; b++) {
		doubleSq[b-1] = 2*b*b;
	}
	System.out.println("Heo");
	int count = 3; 
	while(true) {
		if (!primesOnly.contains(count)) {
			System.out.println(count);
			boolean found = false;
			int num = 0;
			while (doubleSq[num] < count) {
				if (primesOnly.contains(count-doubleSq[num])) {
					found = true;
				}
				num++;
			}
			if (!found) {
				System.out.println("The answer is: " + count);
				System.exit(0);
			}
		}
		count+= 2;
	}
	}
}
