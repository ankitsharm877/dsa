package contest398;

public class Question2 {

	public static void main(String[] args) {
		int[] nums = {3,4,1,2,6};
		int[][] queries = {{0,4}};
		System.out.println(isArraySpecial(nums, queries));
	}
	
	public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int[] list = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            if((nums[i] + nums[i-1]) % 2 == 0) list[i] = 1;
        }
        for(int i = 1; i < list.length; i++) 
            list[i] += list[i-1];
        boolean[] flags = new boolean[queries.length];
        int k = 0;
        for(int i = 0; i < queries.length; i++) {
            int from = queries[i][0];
            int to = queries[i][1];
            
            if(list[from] != list[to]) 
                flags[k++] = false;
            else 
                flags[k++] = true;
        }
        return flags;
    }
}
