import java.util.ArrayList;
import java.util.HashSet;

/**public Pair() {
	Integer[] x;
	Integer[] y;
}

public Pair (Integer[] x, Integer[] y) {
	this.x = x; 
}*/

public class PE90 {
	
	
	public static ArrayList<Integer[]> diceGenerator() {
	ArrayList<Integer[]> dice = new ArrayList<Integer[]>();
		for (int a = 0; a < 5; a++) {
			for (int b = a+1; b < 6; b++) {
				for (int c = b+1; c < 7; c++) {
					for (int d = c+1; d < 8; d++) {
						for (int e = d+1; e < 9; e++) {
							for (int f = e+1; f < 10; f++) {
								Integer[] die = {a, b, c, d, e, f};
								dice.add(die);
							}
						}
					}
				}
			}
		}
	System.out.println("There are " + dice.size() + " dice");
	return dice;
	}
	
	public static void main(String[] args) {
		HashSet<Integer> squares = new HashSet<Integer>();
		ArrayList<Integer[]> dice1 = diceGenerator();
		ArrayList<Integer[]> dice2 = diceGenerator();
		int combo = 0;
		for (int a = 0; a < dice1.size(); a++) {
			for (int b = 0; b < dice2.size(); b++) {
				for (int i = 1; i < 10; i++) {
					squares.add(i*i);
				}
				for (int c: dice1.get(a)) {
					for (int d: dice2.get(b)){
						squares.remove(10*c+d);
						squares.remove(10*d+c);
						if (c == 6) {
							squares.remove(10*d + 9);
						}
						if (c == 9) {
							squares.remove(10*d + 6);
							squares.remove(60 + d);
						}
						if (d == 9) {
							squares.remove(60 + c);
							squares.remove(10*c + 6);
						}
						if (d == 6) {
							squares.remove(10*c + 9);
						}
					}
				}
				if (squares.isEmpty()) {
					String ans = "The sets are: {";
					for (int j = 0; j < 6; j++) {
						ans += dice1.get(a)[j];
						ans += ", ";
					}
					ans += "} and {";
					for (int k = 0; k < 6; k++) {
						ans += dice2.get(b)[k];
						ans += ", ";
					}
					ans += "}";
					System.out.println(ans);
					combo++;
				}
				//squares.clear();
			}
		}
		System.out.println("The answer is: " + combo);
	}
}
