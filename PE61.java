import java.util.HashSet;

public class PE61 {
	public static HashSet<Integer> Triangle() {
		HashSet<Integer> nums = new HashSet<Integer>();
		for (int i = 1; i < 200; i++) {
			int res = (i*(i+1))/2;
			if (res > 1000 && res < 10000) {
				nums.add(res);
			}
		}
		return nums;	
	}
	public static HashSet<Integer> Square() {
		HashSet<Integer> nums = new HashSet<Integer>();
		for (int i = 1; i < 200; i++) {
			int res = i*i;
			if (res > 1000 && res < 10000) {
				nums.add(res);
			}
		}
		return nums;	
	}
	public static HashSet<Integer> Pentagon() {
		HashSet<Integer> nums = new HashSet<Integer>();
		for (int i = 1; i < 200; i++) {
			int res = (i*(3*i-1))/2;
			if (res > 1000 && res < 10000) {
				nums.add(res);
			}
		}
		return nums;	
	}
	public static HashSet<Integer> Hexagon() {
		HashSet<Integer> nums = new HashSet<Integer>();
		for (int i = 1; i < 200; i++) {
			int res = (i*(2*i-1));
			if (res > 1000 && res < 10000) {
				nums.add(res);
			}
		}
		return nums;	
	}
	public static HashSet<Integer> Heptagon() {
		HashSet<Integer> nums = new HashSet<Integer>();
		for (int i = 1; i < 200; i++) {
			int res = (i*(5*i-3))/2;
			if (res > 1000 && res < 10000) {
				nums.add(res);
			}
		}
		return nums;	
	}
	public static HashSet<Integer> Octogon() {
		HashSet<Integer> nums = new HashSet<Integer>();
		for (int i = 1; i < 200; i++) {
			int res = (i*(3*i-2));
			if (res > 1000 && res < 10000) {
				nums.add(res);
			}
		}
		return nums;	
	}
	public static int lastTwo(int n) {
		return n%100;
	}
	public static int firstTwo(int n) {
		return n/100;
	}
	
	public static void main(String[] args) {
		HashSet<Integer> triangle = Triangle();
		HashSet<Integer> square = Square();
		HashSet<Integer> pentagon = Pentagon();
		HashSet<Integer> hexagon = Hexagon();
		HashSet<Integer> heptagon = Heptagon();
		HashSet<Integer> octogon = Octogon();
		int sum = 0;
		for (int a: octogon) {
			
		}
	}
}
