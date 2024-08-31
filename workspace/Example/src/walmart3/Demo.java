package walmart3;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		/**

		* Given an array arr[] of n integers, construct a Product Array prod[] (of the same size) such that prod[i]

		* is equal to the product of all the elements of arr[] except arr[i]

		* Input: arr[]  = {10, 3, 5, 6, 2}
		* 
		* {10, 30, 150, 900, 1800}

		* Output: prod[]  = {180, 600, 360, 300, 900}

		*/
		
		int arr[]  = {10, 3, 5, 6, 2};
		arr = findProductII(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static int[] findProductII(int[] nums) {
		int n = nums.length;
        int pre[] = new int[n];
        int suff[] = new int[n];
        pre[0] = 1;
        suff[n - 1] = 1;
        
        for(int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        for(int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }
        
        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i];
        }
        return ans;
	}
	
	public static int[] findProductIII(int[] nums) {
		int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
	}
	
	public static int[] findProductI(int[] arr) { // O(N^2)
		int[] prod = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) { // O(N)
			int val = 1;
			for (int j = 0; j < arr.length; j++) { // O(N)
				if (i != j) {
					val *= arr[j];
				}
			}
			prod[i] = val;
		}
		return prod;
	}
	
	public static int[] findProduct(int[] arr) { //O(N)
		int[] prod = new int[arr.length];
		
		int prodAll = arr[0];
		for (int i = 1; i < arr.length; i++) { // O(N)
			prodAll *= arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) { // O(N)
			prod[i] = (prodAll) / arr[i]; 
		}
		return prod;
	}
	
	// arr[] = {}, prod = {}
	// arr[] = {1, 2, 3}
	// arr[] = {10, 3, 5, 6, 2}
}