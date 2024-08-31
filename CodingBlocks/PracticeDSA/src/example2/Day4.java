package example2;

import java.util.Arrays;

public class Day4 {

	public static void main(String[] args) {
		System.out.println(isPrime(5));
		System.out.println(isPrimeI(5));
		System.out.println(isPrimeII(5));
		SOE(23);
	}
	
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
	
	public static boolean isPrimeI(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPrimeII(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	} 
	
	public static void SOE(int n) {
		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, true);
		primes[0] = primes[1] = false;
		
		for (int table = 2; table * table <= n; table++) {
			for (int mult = 2; table * mult <= n ; mult++) {
				primes[table * mult] = false;
			}
		}
		
		for (int i = 0; i < primes.length; i++) {
			if (primes[i]) {
				System.out.println(i);
			}
		}
	}

}
