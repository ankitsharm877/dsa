package main;

public class Recursion {

	public static void main(String[] args) {
		int x = 3;
		fibonacci(x);
	}
	
	public static void funI(int n) {
		if (n > 0) {
			System.out.println(n);
			funI(n - 1);
		}
	}
	
	public static void funII(int n) {
		if (n > 0) {
			funII(n - 1);
			System.out.println(n);
		}
	}
	
	public static void funIII(int n) {
		if (n > 0) {
			System.out.println(n);
			funIII(n - 1);
			System.out.println(n);
		}
	}
	
	public static int fibonacci(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
