package coinChangeCombinationCoinRespect;

public class CoinChangeCombinationCoinRespect {

	public static void main(String[] args) {
		int[] denom = {2,3,5,6};
		coinChange(denom, 10, "", 0);
	}
	
	public static void coinChange(int[] denom, int amount, String ans, int vidx) {
		// positive bc
		if (amount == 0) {
			System.out.println(ans);
			return;
		}
		//negative bc
		if (amount < 0 || vidx == denom.length) {
			return;
		}
		
		// yes
		coinChange(denom, amount - denom[vidx], ans + denom[vidx], vidx);
		// no
		coinChange(denom, amount, ans, vidx + 1);
		
	}

}
