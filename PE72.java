
public class PE72 {
	
	public static int gcd(int a, int b) {
		int r = 0;
		while (b != 0) {
			r = a%b;
			a = b;
			b = r;
		}
		return a;
	}

	public static void main(String[] args) {
		long numFractions = 0;
		for (int d = 2; d <= 1000000; d++) {
			if (d%10000 == 0) {
				System.out.println("Denom: " + d);
			}
			for (int n = 1; n < d; n++) {
				if (gcd(d, n) == 1) {
					numFractions++;
					//System.out.println("Next Fraction is: " + n + "/" + d);
				}
			}
		}
		System.out.println("The answer is: " + numFractions);
	}
}
