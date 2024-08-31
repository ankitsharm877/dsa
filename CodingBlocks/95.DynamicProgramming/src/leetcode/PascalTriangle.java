package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		System.out.println(pascalTriangle(5));
	}
	
	public static List<List<Integer>> pascalTriangle(int numRows) {
		List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    if (i <= ans.size()) {
                        list.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                    }
                }
            }
            ans.add(list);
        }
        return ans;
	}
}
