package coinChangeCombination;

public class CoinChangeCombination {

	public static void main(String[] args) {
		int[] denom = {2,3,5,6};
		coinChange(denom, 10, "", 0);
	}
	
	static int count = 0;
	public static void coinChange(int[] denom, int amount, String ans, int lastDenomIdx) {
		if (amount == 0) {
			count++;
			System.out.println(count + "." + ans);
			return;
		}
		for (int i = lastDenomIdx; i < denom.length; i++) {
			if (amount >= denom[i]) {
				coinChange(denom, amount - denom[i], ans + denom[i], i);				
			}
		}
	}

}
