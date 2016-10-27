
public class PE71 {
	public static void main(String[] args) {
		double goal = 3/(double)7;
		double r = 1;
		int num = 0;
		for (int d = 8; d <1000000; d++) {
			int n = (3*d)/7;
			double rem = goal - n/(double)d;
			if (rem < r && d%7 != 0) {
				r = rem;
				num = n;
				System.out.println(n + " divided by " + d + " equals " + rem);
			}
		}
		System.out.println("The answer is: " + num);
	}
}
