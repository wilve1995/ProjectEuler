import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class PE203 {
	public static void main(String[] args) {
	HashMap<Integer, Boolean> primes = new HashMap<Integer, Boolean>();
	for (int i = 2; i < 100; i++) {
		primes.put(i, true);
	}
	primes.put(1, false);
	for (int j = 2; j < 10; j++) {
		if (primes.get(j)) {
			    for (int k = j*j; k < 100; k+=j) {		
				    primes.put(k, false);
			    }
		}
	}
	System.out.println("Done getting primes");
	HashSet<Integer> primeSet = new HashSet<Integer>();
	for (int a: primes.keySet()) {
		if (primes.get(a)) {
			primeSet.add(a);
			System.out.println(a + "is a prime");
		}
	}
	//System.out.println("Done!");
	long[][] pascals = new long[51][51];
	pascals[0][0] = 1;
	long sum = 0;
	long answer = 0;
	HashSet<Long> valid = new HashSet<Long>();
	HashSet<Long> distinct = new HashSet<Long>();
	//valid.add((long) 1);
	for (int k = 1; k <= 50; k++) {
		pascals[k][0] = 1;
		pascals[k][k] = 1;
		//System.out.print("1, ");
		for (int n = 1; n < k; n++) {
			pascals[k][n] = pascals[k-1][n] + pascals[k-1][n-1];
			long pappys = pascals[k][n];
			//System.out.print(pappys + ", ");
			for (int p: primeSet) {
				if (pappys%(p*p) == 0) {
					if (!valid.contains(pappys)) {
					    sum += pappys;
					}
					valid.add(pappys);
					//System.out.println(pappys + " is a square binomial coefficient");
				}
			}
		}
		//System.out.println(" 1");
	}
	for (int w = 0; w <= 50; w++) {
		for (int v = 0; v <= 50; v++) {
			if (!valid.contains(pascals[w][v])) {
				if (!distinct.contains(pascals[w][v])) {
				    answer += pascals[w][v];
				    System.out.println(pascals[w][v] + " is not a square-free Pascal's number");
				    distinct.add(pascals[w][v]);
				}
			}
		}
	}
	System.out.println("The answer is: " + answer);
	}
}
