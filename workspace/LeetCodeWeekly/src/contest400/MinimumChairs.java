package contest400;

public class MinimumChairs {

	public static void main(String[] args) {
		String s = "EEEEEEE";
		//String s = "ELELEEL";
		//String s = "ELEELEELLL";
		System.out.println(minimumChairs(s));
	}

	public static int minimumChairs(String s) {
		int min = 0;
		int count = 0;
		for (char c : s.toCharArray()) {
			if (c == 'E') {
				count++;
			} else if (c == 'L') {
				count--;
			}
			min = Math.max(min, count);
		}
		return min;
	}
}
