package coinChangePermutation;

public class CoinChangePermutation {

	public static void main(String[] args) {
		int[] denom = {2,3,5,6};
		coinChange(denom, 10, "");
	}
	
	public static void coinChange(int[] denom, int amount, String ans) {
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		if (amount < 0) {
			return;
		}
		for (int i = 0; i < denom.length; i++) {
			coinChange(denom, amount - denom[i], ans + denom[i]);				
		}
	}

}
