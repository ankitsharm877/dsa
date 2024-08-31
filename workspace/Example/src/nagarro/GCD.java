package nagarro;

public class GCD {

	public static void main(String[] args) {
		int a = 2, b = 10;
        System.out.println("GCD of " + a + " and " + b
                           + " is " + gcd(a, b));
	}
	public static int gcd(int a, int b) {
		if (a == 0) {
			return a;
		}
		if (b == 0) {
			return b;
		}
		if (a == b) {
			return a;
		}
		if (a > b) {
			return gcd(a - b, b);
		} else {
			return gcd(a, b - a);
		}
	}

	public static int gcdI(int a, int b) {
	    if(a==0)
	    	return b;
	    return gcdI(b%a,a);
	}
}
