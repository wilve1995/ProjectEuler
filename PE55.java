
public class PE55 {
	
	public static long reverse(long n) {
		int x = 0;
		while (n > 0) {
			x += 10*x + n%10;
			n = (int)n/10;
		}
		System.out.println(n + " reversed is " + x);
		return x;
	}
    
	public static boolean palindromeChecker(long n) {
		if (n == reverse(n)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 10000; i++) {
			boolean Lychrel = true;
			int num = i;
			long k = (long) i;
			for (int j = 0; j < 50; j++) {
				k = k + reverse(k);
				if (palindromeChecker(k)) {
					Lychrel = false;
				}
			}
			if (Lychrel) {
				System.out.println(num + " is Lychrel");
				count++;
			}
		}
		System.out.println("The answer is " + count);
	}
}
