package sap1.sap6;

import java.util.ArrayList;

public class FindSmallestSubarraySum {

	public static void main(String[] args) {
		System.out.println(find());
	}

	//Find the smallest sub array sum >= given number 
		public static ArrayList<Integer> find() {
			int[] arr = {4,2,2,7,8,1,2,8,10};
			int x = 29;
			//Arrays.sort(arr);
			int i = 2;
			ArrayList<Integer> list = new ArrayList<>();
			while (i < arr.length) { // O(n)
				for (int j = 0; j < arr.length; j++) { // O(n)
					int sum = 0;
					for (int k = 0; k < i && j + k < arr.length; k++) { // O(n)
						sum += arr[j + k];
						list.add(arr[j + k]);
					}
					if (sum == x) {
						return list;
					} else {
						list = new ArrayList<>();
					}
				}
				i++;
			}
			return list;
		}
		
		public int minSubArrayLen(int target, int[] nums) {
	        int i = 0;
	        int j = 0; 
	        int minLen = Integer.MAX_VALUE;
	        int windowSum = 0;
	        
	        while (j < nums.length) {
	            windowSum += nums[j];

	            while (windowSum >= target) {
	                minLen = Math.min(minLen, j - i + 1);
	                windowSum -= nums[i];
	                i++;
	            }
	            j++;
	        }
	        return minLen == Integer.MAX_VALUE ? 0 : minLen;
	    }
}
