package walmart3;

public class Demo2 {

	public static void main(String[] args) {
		//Given an array of  prices[] of length N, representing the prices of the stocks on different days, 
		//the task is to find the maximum profit possible by buying and selling the stocks on different days 
		//when at most one transaction is allowed.
		int[] prices = {1,3,2,5}; // 5 - 1 = 4
		System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices) {
		int maxProfit = 0;
		int min = prices[0];
		for (int i = 1; i < prices.length; i++) {
			maxProfit = Math.max(maxProfit, prices[i] - min);
			min = Math.min(min, prices[i]);
		}
		return maxProfit;
	}

}
