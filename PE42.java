import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashSet;


public class PE42 {
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
	
    HashSet<Integer> delta = new HashSet<Integer>();
    int i = 0;
    for (int j = 1; j < 1000; j++) {
    	i += j;
    	delta.add(i);
    }
    
	Scanner names = null;
	try {
		names = new Scanner(new File ("p042.txt"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String list = names.next();
	//System.out.println(list);
	String[] ppl = list.split(",");
	System.out.println(ppl[1000]);
	int count = 0;
	for (String s: ppl) {
		if (delta.contains(wordValue(s))) {
			count++;
		}
	}
	System.out.println("The answer is: " + count);
	}
}
