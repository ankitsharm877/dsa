package contest131;

import java.util.HashMap;
import java.util.Map;

public class Question1 {
	
	public static void main(String[] args) {
		int[] nums = {1,2,1,3};
		System.out.println(duplicateNumbersXOR(nums));
	}
	
	public static int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int val : nums) {
            hm.put(val, hm.getOrDefault(val, 0) + 1);
        }
        int xor = 0;
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 2) {
                xor ^= entry.getKey();
            }
        }
        return xor;
    }
}
