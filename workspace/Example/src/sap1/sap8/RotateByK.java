package sap1.sap8;

import java.util.Arrays;

public class RotateByK {

	//1. Find duplicates from array list
	//2. Create HashMap with tree
	//3. Rotate k time right in array
	//4. Indexing 
	//5. Profiling in browser
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int k = 3;
		rotateByKIII(arr, k);
	}
	
	public static void rotateByKI(int[] arr, int k) {
		for (int i = 0; i < k; i++) {
			int x = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0 ; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = x;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void rotateByKII(int[] nums, int k) {
		 k = k % nums.length;
        int rotated[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            rotated[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rotated[i];
        }
        System.out.println(Arrays.toString(nums));
	}
	
	public static void rotateByKIII(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
