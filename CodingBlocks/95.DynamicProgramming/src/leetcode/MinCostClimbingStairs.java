package leetcode;

public class MinCostClimbingStairs {

	public static void main(String[] args) {
		int[] cost = {1,100,1,1,1,100,1,1,100,1};
		//System.out.println(minCostClimbingStairs(cost, 0, 0));
		//System.out.println(minCostClimbingStairs(cost, 1, 0));
		System.out.println(minCostClimbingStairsBU(cost));
		System.out.println(minCostClimbingStairsBUSE(cost));
	}
	
	public static int minCostClimbingStairs(int[] cost, int curr, int result) {
		if (curr == cost.length) {
			return result;
		}
		if (curr > cost.length) {
			return Integer.MAX_VALUE;
		}
		int step1 = minCostClimbingStairs(cost, curr + 1, result + cost[curr]);
		int step2 = minCostClimbingStairs(cost, curr + 2, result + cost[curr]);
		return step1 <= step2 ? step1 : step2;
	}
	
	public static int minCostClimbingStairsBU(int[] cost) {
		int[] table = new int [cost.length + 1];
		table[cost.length] = 0;
		table[cost.length - 1] = cost[cost.length - 1];
		for (int i = cost.length - 2; i >= 0; i--) {
			table[i] = cost[i] + Math.min(table[i + 1], table[i + 2]);
		}
		return Math.min(table[0], table[1]);
	}
	
	public static int minCostClimbingStairsBUSE(int[] cost) {
		int[] table = new int[2];
		table[0] = cost[cost.length - 1];
		table[1] = 0;
		for (int i = cost.length - 2; i >= 0; i--) {
			int step = cost[i] + Math.min(table[0], table[1]);
			table[1] = table[0];
			table[0] = step;
			
		}
		return Math.min(table[0], table[1]);
	}
	

}
