package contest131;

import java.util.ArrayList;

public class Question2 {

	public static void main(String[] args) {
		int[] nums = {1,3,1,7}, queries = {1,3,2,4};
		int x = 1;
		System.out.println(occurrencesOfElement(nums, queries, x));
	}
	
	public static int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
               list.add(i);
            } 
            // else {
            //     ans[i] = -1;
            // }
        }
        //[-1, -1, 2, -1]
        int[] out = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            if (queries[i] <= list.size()) {
                out[i] = list.get(queries[i] - 1);
            } else {
                out[i] = -1;
            }
        }
        return out;
    }

}
