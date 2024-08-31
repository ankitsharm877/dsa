package array.qus11;

public class DuplicateNumber {

	public static void main(String[] args) {
		int[] nums = {13,46,8,11,20,17,40,13,13,13,14,1,13,36,48,41,13,13,13,13,45,13,28,42,13,10,15,22,13,13,13,13,23,9,6,13,47,49,16,13,13,39,35,13,32,29,13,25,30,13}; // 1+2+3+4 = 10 + 2 = 12 -> 4 * 5 /2  = 10
		System.out.println(findDuplicate(nums));
	}

	public static int findDuplicate(int[] nums) {
		int slow = 0;
        int fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        
        return slow;
    }
	
	 public int findDuplicateBit(int[] nums) {
        int n = nums.length-1, res = 0;
        for (int p = 0; p < 32; ++ p) {
            int bit = (1 << p), a = 0, b = 0;
            for (int i = 0; i <= n; ++ i) {
                if (i > 0 && (i & bit) > 0) ++a;
                if ((nums[i] & bit) > 0) ++b;
            }
            if (b > a) res += bit;
        }
        return res;
	 }
	 
	 public static int findDuplicateBitII(int[] nums) {
		 int H = 0, x = 0;
		for (int i = 0; i < nums.length; i++) {
			x = 1;
			x = x << nums[i];
			if ((x & H) > 0) {
                return nums[i];
			} else {
				H = x | H;
			}
		}
        return 0;
	 }
}
