import java.util.HashSet;

public class PE44 {
    public static void main(String[] args) {
    	int diff = 1000000000;
    	HashSet<Integer> penta = new HashSet<Integer>();
    	for (int i = 1; i < 100000; i++) {
    		penta.add(i*(3*i-1)/2);
    	}
    	for (int a: penta) {
    		for (int b: penta) {
    			if (penta.contains(a+b) && penta.contains((int)Math.abs(a-b))) {
    				diff = Math.min(diff,(int)Math.abs(a-b));
    				System.out.println(diff);
    			}
    		}
    	}
    	System.out.println("The answer is: " + diff);
    }
}
