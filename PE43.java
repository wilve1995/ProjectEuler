import java.util.HashSet;
// How to get all digits to be different?
public class PE43 {
    public static void main(String[] args) {
    	HashSet<Long> panAm = new HashSet<Long>();
    	HashSet<Long> digits = new HashSet<Long>();
    	for (int d1 = 1; d1 < 10; d1++) {
    		for (int d2 = 0; d2 < 10; d2++) {
    			for (int d3 = 0; d3 < 10; d3++) {
    				for (int d4 = 0; d4 < 10; d4+=2) {
    					for (int d5 = 0; d5 < 10; d5++) {
    						for (int d6 = 0; d6 < 10; d6+=5) {
    							for (int d7 = 0; d7 < 10; d7++) {
    								for (int d8 = 0; d8 < 10; d8++) {
    									for (int d9 = 0; d9 < 10; d9++) {
    										for (int d10 = 0; d10 < 10; d10++) {
    											long num = (long)d10+10*d9+100*d8+1000*d7+10000*d6+100000*d5+1000000*d4+10000000*d3+100000000*d2+(long)1000000000*d1;
    											long temp = num;
    											if ((d3+d4+d5)%3 == 0 && (100*d5+10*d6+d7)%7 == 0 && (100*d6+10*d7+d8)%11 == 0 && (100*d7+10*d8+d9)%13 == 0 && (100*d8+10*d9+d10)%17==0) {
    												while(temp > 0) {
    												    digits.add(temp%10);
    											    
    												    temp = temp/10;
    												}
    												if (digits.size() == 10) {
    											    panAm.add(num);
    											    System.out.println(num);
    												}
    												digits.clear();
    											}
    										}
    									}
    								}
    							}
    						}
    					}
    				}
    			}
    		}
    	}
    	long sum = 0;
    	for (long a: panAm) {
    		sum += a;
    	}
    	System.out.println("The answer is " + sum);
    }
}
