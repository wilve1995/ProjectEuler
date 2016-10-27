
public class PE85 {
	public static void main(String[] args) {
		int lenans = 0;
		int heightans = 0;
		int mindist = 2000000;
		int score = 0;
		for (int length = 1; length < 100; length++) {
			for (int height = 1; height < 100; height++) {
				int rekt = 0;
				for (int a = 1; a <= length; a++) {
					for (int b = 1; b <= height; b++) {
						rekt += a*b;
					}
				}
				int dist = Math.abs(2000000 - rekt);
				if (dist < mindist) {
					mindist = dist;
					lenans = length;
					heightans = height;
					score = rekt;
				}
			}
		}
		int res = lenans*heightans;
		System.out.println("The answer is: " + res + " with height " + heightans + " and length " + lenans + " and score " + score);
	}
}
