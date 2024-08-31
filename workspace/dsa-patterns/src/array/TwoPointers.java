package array;

import java.util.Arrays;
import java.util.List;

public class TwoPointers {
	
	//Two pointers is really an easy and effective technique that is typically used for searching pairs in a sorted array.

	public static void main(String[] args) {
		// Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.
		List<Integer> arr = Arrays.asList(2, 3, 5, 8, 9, 10, 11);
	    int val = 17;
	    int arrSize = arr.size();
	    arr.sort(null);
	    System.out.println(pairWithTargetSum(arr, arrSize, val));
	    
	    //2. Given two arrays arr1[0…m-1] and arr2[0..n-1], and a number x, the task is to 
	    //find the pair arr1[i] + arr2[j] such that absolute value of (arr1[i] + arr2[j] – x) is minimum.
	    int ar1[] = {1, 4, 5, 7};
        int ar2[] = {10, 20, 30, 40};
        int m = ar1.length;
        int n = ar2.length;
        int x = 38;
        printClosest(ar1, ar2, m, n, x);
        
        //3. Given a sorted array and a number x, find a pair in an array whose sum is closest to x.
        int[] arr1 = { 10, 22, 28, 29, 30, 40 }; 
        int x1 = 54; 
        int n1 = arr1.length; 
        printClosest(arr1, n1, x1);
        
        //4. Given an array of distinct elements. The task is to find triplets in the array whose sum is zero.
        int[] arr2 = {1, 2, -3, 4, -1, -2, 0};
        int N = arr2.length;
        findTriplet(arr2, N);
	}

	private static boolean pairWithTargetSum(List<Integer> list, int N, int target) {
        int start = 0;
        int end = N - 1;
        while (start < end) {
        	int currentSum = list.get(start) + list.get(end);
            if (currentSum == target) {
                return true;
            } else if (currentSum < target) {
                start++;
            } else {
                end--;
            }
        }
        return false;	
	}
	
	private static void printClosest(int ar1[], int ar2[], int m, int n, int x) {
        int diff = Integer.MAX_VALUE;
        int res_l = 0, res_r = 0;
        
        int l = 0, r = n-1;
        while (l<m && r>=0)
        {
           if (Math.abs(ar1[l] + ar2[r] - x) < diff) {
               res_l = l;
               res_r = r;
               diff = Math.abs(ar1[l] + ar2[r] - x);
           }
           if (ar1[l] + ar2[r] > x) {
               r--;
           } else {
               l++;
           }
        }
        System.out.println("The closest pair is [" + ar1[res_l] + ", " + ar2[res_r] + "]");
    }
	
	public static void printClosest(int[] arr, int n, int x) { 
		int res_l=0, res_r=0;
        int l = 0, r = n-1, diff = Integer.MAX_VALUE; 
        while (r > l) { 
            if (Math.abs(arr[l] + arr[r] - x) < diff) { 
               res_l = l; 
               res_r = r; 
               diff = Math.abs(arr[l] + arr[r] - x); 
            } 
            if (arr[l] + arr[r] > x) {
               r--; 
            } else {
               l++; 
            }
        } 
        System.out.println("The closest pair is "+arr[res_l]+" and "+ arr[res_r]); 
	} 
	
	public static void findTriplet(int[] arr, int N) {
        for (int i = 0; i < N - 2; i++) {
            if (arr[i] + arr[i + 1] + arr[i + 2] == 0) {
                System.out.println(arr[i] + " " + arr[i + 1] + " " + arr[i + 2]);
                return;
            }
        }
        System.out.println("No such triplet available");
    }
}
