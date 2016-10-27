import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class PE22 {
	
	public static int wordValue(String word) {
		int summer = 0;
		char[] let = word.toCharArray();
		//Character letters = new Character{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		for (char a: let) {
			int val = (int)a - 64;
			summer += val;
			System.out.println("The value of " + a + " is " + val);
		}
		return summer + 60;
	}
	
    public static void main(String[] args) {
    	Scanner names = null;
    	try {
			names = new Scanner(new File ("names.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	String list = names.next();
    	//System.out.println(list);
    	String[] ppl = list.split(",");
    	Arrays.sort(ppl);
    	int sum = 0; 
    	for (int i = 0; i < ppl.length; i++) {
    		System.out.println("The sum for " + ppl[i] + " is " + wordValue(ppl[i]));
    		sum += (i+1)*wordValue(ppl[i]);
    	}
    	System.out.println("The answer is: " + sum);
    }
}
