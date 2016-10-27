import java.util.HashSet;

public class PE66 {
    public static void main(String[] args) {
    	HashSet<Long> sq = new HashSet<Long>();
    	for (long i = 1; i < 50000000; i++) {
    		sq.add(i*i);
    	}
    	System.out.println("Done");
    	long D = 2;
    	long max_sq = 0;
    	long max_D = 0;
    	while(D < 1001) {
    		if (!sq.contains(D)) {
    			long n = 1;
    			while (n < 5000000) {
    				long sol = 1+D*n*n;
    				if (sq.contains(sol)) {
    					System.out.println("We get " + Math.sqrt(sol) + " for D = " + D);
    					if (max_sq < sol) {
    						max_D = D;
    						max_sq = sol;
        					System.out.println("Better: we get " + Math.sqrt(max_sq) + " for D = " + max_D);

    					}   
    					n = 200000010;
    				}
    				n++;
    				if (n == 5000000) {
    					System.out.println("Skipped " + D);
    				}
    			}
    		}
    		D++;
    	}
    	System.out.println("The answer is: " + max_D);
    }
}
