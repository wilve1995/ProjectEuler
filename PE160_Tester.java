
public class PE160_Tester {
	public static void main(String[] args) {
		long fact = 1;
		for (long i = 1; i <= 100000; i++) {
			fact *= i;
			while(fact%10 == 0) {
				fact = fact / 10;
			}
			if (fact > 100000) {
				fact = fact%100000;
			}
			
		}
		System.out.println("The answer is: " + fact);
		long ans = 62496;
		for (int j = 1; j < 10000000; j++) {
			ans *= 62496;
			if (ans > 100000) {
				ans = ans%100000;
			}
		}
		System.out.println(ans);
	}
}
