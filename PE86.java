import java.util.HashSet;

public class PE86 {
	public static void main(String[] args) {
		
		HashSet<Integer> squares = new HashSet<Integer>();
		for (int i = 1; i < 10000; i++) {
			squares.add(i*i);		
		}
		int sum = 0;
		int a = 0;
		while (sum < 1000000) { // Sum < 1 million
			a++;
			for (int b = 1; b <= a; b++) {
				for (int c = b; c <= a; c++) {
					int mindist = a*a + (b+c)*(b+c);
					mindist = Math.min(mindist, (a+b)*(a+b)+c*c);
					mindist = Math.min(mindist, b*b + (a+c)*(a+c));
					if (squares.contains(mindist)) {
						sum++;
					}
				}
			}
			System.out.println("There are " + sum + " sums for " + a);
		}
		System.out.println("The answer is: " + a + " for " + sum);
	}
}
