import java.util.HashSet;

public class PE23 {
	
	public static int sumFactors(int n) {
		int sum = 1;
		double epsilon = 0.0000001;
		for (int i = 2; i <= (Math.sqrt(n)); i++) {
			if (n%i == 0) {
				sum += i;
				
				if (Math.abs(Math.sqrt(n) - i) > epsilon){
				    sum += (int)Math.floor(n/i);
				    //System.out.println((int)Math.floor(n/i));
				}
			}
		}
		return sum;
	}
	
    public static void main(String[] args) {
    	HashSet<Integer> abs = new HashSet<Integer>();
    	abs.add(12);
    	for (int i = 2; i < 28123; i++) {
    		if (sumFactors(i) > i) {
    			abs.add(i);
    			System.out.println(i);
    		}
    		
    	}
    	System.out.println("Done with part 1");
    	int[] odds = new int[]{945, 1575, 2205, 3465, 4095, 5355, 5775, 5985, 6435, 6825, 7245,
    			7425, 8085, 8415, 8925, 9135, 9555, 9765, 11655, 12705, 12915,
    			13545, 14805, 15015, 16695, 18585, 19215, 19635, 21105, 21945,
    			22365, 22995, 23205, 24885, 25935, 26145, 26565, 28035};
    	int sum = 0;
    	for (int j = 1; j <= 28123; j++) {
    		boolean add = true;
    		for (int a: abs) {
    				if (abs.contains(j-a)) {
    					add = false;
    				}
    		}

    		if (add) {
    			sum += j;
    			System.out.println(j);
    		}
    	}

    	System.out.println("The answer is " + sum);
    	

    }
}
/* 945, 1575, 2205, 3465, 4095, 5355, 5775, 5985, 6435, 6825, 7245,
 * 7425, 8085, 8415, 8925, 9135, 9555, 9765, 11655, 12705, 12915,
 * 13545, 14805, 15015, 16695, 18585, 19215, 19635, 21105, 21945,
 * 22365, 22995, 23205, 24885, 25935, 26145, 26565, 28035, 28215
 * 
 */

