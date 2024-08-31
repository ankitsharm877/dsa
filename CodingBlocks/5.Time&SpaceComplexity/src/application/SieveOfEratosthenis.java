package application;

import java.util.Arrays;

public class SieveOfEratosthenis {

	public static void main(String[] args) {
		SOE(25);
	}
	
	// T.C. -> O(N*log(log(N))), S.C -> O(n)
	public static void SOE(int n) {
		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, true);
		
		primes[0] = primes[1] = false;
		
		for (int table = 2; table * table <= n; table++) {
			if (primes[table] == true) {
				for (int mult = 2; table * mult <= n; mult++) {
					primes[table * mult] = false;
				}
			}
		}
		
		for (int i = 0; i < primes.length; i++) {
			if (primes[i]) {
				System.out.println(i);
			}
		}
	}

}
