package fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 25;
		System.out.println(fibRecursion(n));
		System.out.println(fibTD(n, new int[n + 1]));
		System.out.println(fibBU(n));
		System.out.println(fibBUSE(n));
	}
	
	public static int fibRecursion(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int fnm1 = fibRecursion(n - 1);
		int fnm2 = fibRecursion(n - 2);
		int fn = fnm1 + fnm2;
		return fn;
	}
	
	public static int fibTD(int n, int[] memory) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (memory[n] != 0) { // reuse
			return memory[n];
		}
		int fnm1 = fibTD(n - 1, memory);
		int fnm2 = fibTD(n - 2, memory);
		int fn = fnm1 + fnm2;
		memory[n] = fn; // store
		return fn;
	}
	
	public static int fibBU(int n) {
		//array size
		int[] table = new int[n + 1];
		
		//base case values fill
		table[0] = 0;
		table[1] = 1;
		
		// filling direction start to end
		for (int i = 2; i <= n; i++) {
			table[i] = table[i - 1] + table[i - 2];
		}
		return table[n];
	}
	
	public static int fibBUSE(int n) {
		int[] table = new int[2];
		
		table[0] = 0;
		table[1] = 1;
		for (int slide = 1; slide <= n - 1; slide++) {
			int sum = table[0] + table[1];
			table[0] = table[1];
			table[1] = sum;
		}
		return table[1];
	}

}
