import java.util.HashSet;

public class PE32 {
    /*
	public HashSet<Integer> panDigital(int n) {
		return panAm(n)
	*/
	
	public static void main(String[] args) {
		HashSet<Integer> products = new HashSet<Integer>();
		HashSet<Integer> digits = new HashSet<Integer>();
		for (int i = 1; i < 9; i++) {
			for (int j = 1000; j < 10000; j++) {
				int prod = i*j;
				if (prod < 10000) {
				digits.add(i);
				int temp = j;
				while (temp > 0) {
					if (temp%10 != 0) {
					    digits.add(temp%10);
					}
					if (temp%10 != 0) {
					    digits.add(prod%10);
					}
					temp = temp / 10;
					prod = prod / 10;
				}
				if (!digits.contains(0) && digits.size() == 9) {
					products.add(i*j);
					System.out.println(i + " times " + j + " equals " + i*j);
				}
				}
				digits.clear();
			}
		}
		for (int a = 10; a <= 99; a++) {
			for (int b = 100; b < 1000; b++) {
				int pro = a*b;
				int tempA = a;
				int tempB = b;
				int tempP = pro;
				if (pro < 10000) {
				digits.add(tempA%10);
				tempA = tempA/10;
				digits.add(tempA);
				digits.add(tempB%10);
				tempB = tempB / 10;
				digits.add(tempB%10);
				tempB = tempB/10;
				digits.add(tempB);
				
				while (tempP > 0) {
					digits.add(tempP%10);
					tempP = tempP / 10;
				}
				if (!digits.contains(0) && digits.size() == 9) {
					products.add(pro);
					System.out.println(a + " times " + b + " equals " + a*b);
				}
				}
				digits.clear();
			}
			
		}
		int sum = 0;
		for (int c: products) {
			sum += c;
		}
		System.out.println("The answer is: " + sum);
	}
	
}
