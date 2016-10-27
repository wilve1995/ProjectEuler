// Find perfect square of the form 1_2_3_4_5_6_7_8_9_0

//Well, we know it ends in 0900 or 4900. 
public class PE206 {
	public static boolean digitChecker(long sq) {
		long i = 8;
		while (sq != 0) {
			sq = sq/100;
			if (sq%10 != i) {
				return false;
			}
			i--;
		}
		return true;
		
	}
	
    public static void main(String[] args) {
    	long sq = 101010103; // 9-digit number.
    	boolean threes = true;
    	while (sq < 138902663) {
    		if (digitChecker(sq*sq)) {
    			System.out.println(sq);
    		}
    		if (threes) {
    			sq += 4;
    			threes = false;
    		}
    		else {
    			sq += 6;
    			threes = true;
    		}
    	}
    }
}
