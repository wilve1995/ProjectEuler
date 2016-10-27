import java.util.HashSet;

public class PE125 {
	public static int reverse(int n) {
		int y = n;
		int x = 0;
		while (n > 0) {
			x = 10*x + n%10;
			n = (int)Math.floor(n/10);
		}
		//System.out.println(y + " reversed is " + x);
		return x;
	}
    
	public static boolean palindrome(int n) {
		if (n == reverse(n)) {
			return true;
		}
		return false;
	}
	public static long sumSquares(int a, int b) {
		long sum = a*a;
		for (int i = a+1; i <= b; i++) {
			sum += i*i;
			if (sum <= 0) {
				return -1;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		HashSet<Integer> cz = new HashSet<Integer>();
		long sum = 0;
		for (int a = 1; a < 10000; a++) {
			for (int b = a+1; b < 10000; b++) {
				long sq = sumSquares(a, b);
				if(sq <= 100000000 && sq > 0) {
				if (palindrome((int)sq) && !cz.contains((int)sq)) {
					sum += sq;
					cz.add((int)sq);
					System.out.println(sq);
				}
				}
			}
		}
		System.out.println("The Answer is:");
		System.out.println(sum);
	}
}
