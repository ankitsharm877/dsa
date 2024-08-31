package application;

import java.util.List;

public class PropertyOfXOR {

	public static void main(String[] args) {
		//1) xor of a same number with itself is zero, i.e A ^ A = 0
		//2) xor is commutative that means a ^ b = b ^ a.
		//3) xor of any number with zero is the number itself i.e A ^ 0 = A.
		System.out.println(2 ^ 2);
		System.out.println((2 ^ 4) == (4 ^ 2));
		System.out.println(2 ^ 0);
		
		//every element appears twice except for one. Find that single one.
		System.out.println(singleNumber(new int[] {1,2,2}));
		
		//every element appears three times except for one, which appears exactly once. Find the single one.
		System.out.println(singleNumberI(new int[] {2,2,3,2}));
		
		//two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.
		System.out.println(singleNumberII(new int[] {1,2,1,3,2,5}));
	}

	public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans = ans ^ num;
        }
        return ans;
    }
	
	public static int singleNumberI(int[] nums) {
		int ones = 0, twos = 0;
        for(int num : nums) {
            ones = ((ones ^ num) & (~ twos));  
            twos = ((twos ^ num) & (~ ones)); 
        }
        return ones;
    }
	
	public static int[] singleNumberII(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
        }
        int a = 0;
        int b = 0;
        int rmsb = xor & (~xor + 1);
        for (int i=0; i<nums.length; i++){
            if ((nums[i] & rmsb) == rmsb){
                a = a^nums[i];
            } else{
                b = b^nums[i];
            }
        }
        return new int[]{a, b};
    }
}
