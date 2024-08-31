package deltaairlines;

import java.util.Arrays;

public class WinnersProbability {

	public static void main(String[] args) {
		int input1 = 3;
		int[][] input2 = {{1,0,2},{2,2,0},{0,0,0}};
		winners(input1, input2);
	}
	
	public static void winners(int input1, int[][] input2) {
		int[] ans = new int[input1];
		int max = 0;
		for (int i = 0; i < input2.length; i++) {
			int count = 0;
			for (int j = 0; j < input2[i].length; j++) {
				if (input2[i][j] == 1 || input2[i][j] == 2) {
					count++;
				}
 			}
			ans[i] = count;
			max = Math.max(max, count);
		}
		for (int i = 0; i < ans.length; i++) {
			ans[i] = (ans[i] == max) ? 1 : 0;
		}
		System.out.println(Arrays.toString(ans));
	}

}
