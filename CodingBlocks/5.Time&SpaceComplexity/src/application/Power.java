package application;

public class Power {

	public static void main(String[] args) {
		System.out.println(power(2, 4));
		System.out.println(powerI(2, 4));
		System.out.println(powerII(2, 4));
	}
	
	// O(n)
	public static int power(int x, int n) {
		int pow = 1;
		for (int i = 1; i <= n; i++) {
			pow *= x;
		}
		return pow;
	}
	
	// O(n)
	public static int powerI(int x, int n) {
		if (n == 0) {
			return 1;
		}
		return x * power(x, n - 1);
	}
	
	// O(logn)
	public static int powerII(int x, int n) {
		// +ve bc
		if (n == 0) {
			return 1;
		}
		int pnb2 = power(x, n/2);
		if (n % 2 == 0) {
			return pnb2 * pnb2;
		} else {
			return pnb2 * pnb2 * x;
		}
	}

}
