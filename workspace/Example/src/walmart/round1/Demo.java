package walmart.round1;

public class Demo {
	
	public static void main(String[] args) {
		// power function (x, n) => x^n
		int n = -4;
		System.out.println(1 / powerII(2.0, -1 * n));
	}
	
	// T.C = O(n)
	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		}
		return x * power(x, n - 1);
	}
	
	//2 ^ 5 =  2.0 ^ 2  * 2.0 ^ 2 * 2.0 = 
	
	//2 ^ -5 = 1 / 2^2 =>  2.5
	//2 ^ -4 = 1 / 2^4 =>
	// power(2, -2) * power (2, -2) = 1/ 2^2 * 1/ 2^2 = 1 / 2 ^ 4
	// power(2, -2) * power (2, -2) * 1/2 = 1/ 2^2 * 1/ 2^2 * 1/2 = 1 / 2 ^ 5 = 2 ^ -5
	
	public static int powerI(int x, int n) {
		if (n < 1) {
			return 1;
		}
		int pd2 = powerI(x, n / 2);
		if (n % 2 == 0) {
			return pd2 * pd2;
		} else {
			return pd2 * pd2 * x;
		}
	}

	
	public static double powerII(double x, int n) {
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return x;
		}
		double pd2 = powerII(x, n / 2);
		if (n % 2 == 0) {
			return pd2 * pd2;
		} else {
			return pd2 * pd2 * x;
		}
	}
}