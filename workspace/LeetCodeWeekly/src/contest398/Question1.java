package contest398;

public class Question1 {

	public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(isArraySpecial(nums));
	}
	
	public static boolean isArraySpecial(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] % 2 == nums[i - 1] % 2) return false; 
        }
        return true;
        // for (int i = 1; i < nums.length; i = i + 1) {
        //     Boolean flag = true;
        //     if (nums[i] % 2 == 0 && nums[i - 1] % 2 == 0) {
        //             flag = false;
        //     }
        //     if (nums[i] % 2 != 0 && nums[i - 1] % 2 != 0) {
        //         flag = false;   
        //     }
        //     if (!flag) {
        //         return false;
        //     }
        // }
        // return true;
    }
}
