
public class PE160 {

	public static void main(String[] args) {
		long fact = 1;
		for (long i = 1; i <= 1000000000000L; i++) {
			fact *= i;
			while(fact%10 == 0) {
				fact = fact / 10;
			}
			if (fact > 1000000) {
				fact = fact%1000000;
			}
			if (i%1000000000 == 0) {
				System.out.println("For i = " + i + " the answer is " + fact);
			}
		}

		System.out.println("The answer is " + fact);
		int ans = 10624;
		for (int j = 1; j < 1000; j++) {
			ans *= 10624;
			while(ans%10 == 0) {
				ans = ans / 10;
			}
			ans = ans%100000;
		}
		System.out.println("The answer is: " + ans);
	}
	
}
