package applications;

public class SingleNumber {

	public static void main(String[] args) {
		int[] nums = {2,1,1,3,4,4,2};
		System.out.println(singleNumber(nums));
		
	}
	
	public static int singleNumber(int[] nums) {
		int ans = 0;
		for (int val : nums) {
			ans ^= val;
		}
		return ans;
	}

}
