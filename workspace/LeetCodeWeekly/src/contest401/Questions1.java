package contest401;

public class Questions1 {

	public static void main(String[] args) {
		int n = 5, k = 6;
		int x = 0;
		boolean dir = true;
		for (int i = 0; i < k; i++) {
			if (x == n - 1) {
				dir = false;
			}
			if (x == 0) {
				dir = true;
			}
			if (dir) {
				x++;
			} else {
				x--;
			}
		}
		System.out.println(x);
	}

}
