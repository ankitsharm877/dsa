package leetcode;

public class ClimbingStairs {

	public static void main(String[] args) {
		int n = 50001;
		//System.out.println(climbStairs(n));
		//System.out.println(climbStairsTD(n, new int[n + 1]));
		System.out.println(climbStairsBU(n));
		System.out.println(climbStairsBUSE(n));
	}
	
	//n = 1 -> 1 => 1
	//n = 2 -> 1 + 1 -> 2 => 2
	//n = 3 -> 1 + 1 + 1 -> 1 + 2 -> 2 + 1 => 3
	//n = 4 -> 1 + 1 + 1 + 1 -> 1 + 1 + 2 -> 2 + 1 + 1 -> 1 + 2 + 1 -> 2 + 2 => 5
	//n = 5 -> 1 + 1 + 1 + 1 + 1 -> 1 + 1 + 1 + 2 -> 1 + 1 + 2 + 1 -> 1 + 2 + 1 + 1 -> 2 + 1 + 1 + 1 -> 1 + 2 + 2 -> 2 + 1 + 2
	//-> 2 + 2 + 1 => 8
	public static int climbStairs(int n) {
		if (n == 1 || n == 2) {
			return n;
		}
		int cnm1 = climbStairs(n - 1);
		int cnm2 = climbStairs(n - 2);
		return cnm1 + cnm2;
	}

	public static int climbStairsTD(int n, int[] memory) {
        if (n == 1 || n == 2) {
            return n;
        }
        if (memory[n] != 0) {
            return memory[n];
        }
        int fib = climbStairsTD(n - 1, memory) + climbStairsTD(n - 2, memory);
        memory[n] = fib;
        return fib;
    }
	
	public static int climbStairsBU(int n) {
		int[] table = new int[n + 1];
		table[1] = 1;
		table[2] = 2;
		for (int i = 3; i <= n; i++) {
			table[i] = table[i - 1] +  table[i - 2];
		}
		return table[n];
	}
	
	public static int climbStairsBUSE(int n) {
		int[] table = new int[2];
		table[0] = 1;
		table[1] = 2;
		for (int slide = 1; slide <= n - 2; slide++) {
			int sum = table[0] + table[1];
			table[0] = table[1];
			table[1] = sum;
		}
		return table[1];
	}
}
