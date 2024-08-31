package example;

import java.util.Arrays;

public class Day4 {

	public static void main(String[] args) {
		System.out.println(isPrime(5));
		System.out.println(isPrimeI(5));
		System.out.println(isPrimeII(5));
		SOE(23);
	}
	
	//T.C = O(n)
	public static boolean isPrime(int n) {
		int factor = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				factor++;
			}
		}
		if (factor == 2) {
			return true;
		} else {
			return false;
		}
	}
	//T.C = O(n / 2) => O(n)
	public static boolean isPrimeI(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	//T.C = O(sqrt(n)) => O(n)
	public static boolean isPrimeII(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	//T.C = O(n * log(logn))
	public static void SOE(int n) {
		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, true);
		primes[0] = false;
		primes[1] = false;
		for (int table = 2; table * table <= n; table++) {
			if (primes[table]) {
				for (int multi = 2; table * multi <= n; multi++) {
					primes[multi * table] = false;
				}
			}
		}
		for (int i = 0; i < primes.length; i++) {
			if (primes[i]) {
				System.out.print(i + ", ");
			}
		}
	}
}
