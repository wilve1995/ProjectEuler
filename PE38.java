import java.util.HashSet;

public class PE38 {

	public static void main(String[] args) {
		int panAm = 0;
		for (int i = 9000; i < 10000; i++) {
			HashSet<Integer> digits = new HashSet<Integer>();
			int prod = i*2;
			int temp = i;
			while (prod > 0) {
				digits.add(prod%10);
				prod = prod/10;
			}
			while (temp > 0) {
				digits.add(temp%10);
				temp = temp/10;
			}
			if (!digits.contains(0) && digits.size() == 9) {
				panAm = Math.max(panAm, 100000*i+2*i);
				System.out.println(i + " gives " + panAm);
			}
		}
	}
	
}
