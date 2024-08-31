package sap1.sap8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDuplicates {

	public static void main(String[] args) {
		//1. Find duplicates from array list
		int[] arr = {1,2,3,2,1};
		System.out.println(findDuplicatesII(arr));
	}
	
	public static List<Integer> findDuplicates(int[] nums) {
		HashSet<Integer> hs = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hs.add(nums[i])) {
                list.add(nums[i]);
            }
        }
        return list;
	}
	
	public static List<Integer> findDuplicatesI(int[] arr) {
		int[] array = new int[arr.length];  
        ArrayList<Integer> res = new ArrayList<>();
        for( int num : arr){ 
            array[num]++; 
        }
        for(int i = 0; i < arr.length; i++){
            if(array[i] > 1){ 
                res.add(i);  
            }
        }
        if(res.size() == 0) 
        	res.add(-1);
        return res;
	}
	
	public static List<Integer> findDuplicatesII(int[] arr) {
		Arrays.sort(arr);
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] == arr[i]) {
				list.add(arr[i]);
			}
		}
		return list;
	}

}
