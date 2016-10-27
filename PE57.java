
public class PE57 {
    public static void main(String[] args) {
    	int count = 0; 
    	long num = 3;
    	long denom = 2;
    	for (int i = 1; i <= 1000; i++) {
    		System.out.println("The fraction is " + num + " over " + denom);
    		String a = Long.toString(num);
    		String b = Long.toString(denom);
    		if (a.length() > b.length()) {
    			count++;
    		}
    		long temp = denom;
    		denom = num + denom;
    		num = temp + denom;
    		if (a.length() > 18) {
    			denom = denom/10;
    			num = num/10;
    		}
    	}
    	System.out.println("The answer is: " + count);
    }
}
