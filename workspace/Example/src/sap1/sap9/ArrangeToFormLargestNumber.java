package sap1.sap9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrangeToFormLargestNumber {

	public static void main(String[] args) {
		//Given a list of non negative integers, arrange them in such a manner that they form the largest number possible.
		Integer arr[] = {3, 30, 34, 5, 9}; // O(n) , O(1)
		System.out.println(largestNumber(arr));
		//9,5,34,3,30 (34 % 10 = 4, 3 % 10 = 3, 30 % 10 = 0)
	}
	
	public static String largestNumber(Integer[] nums) {
		ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            arr.add(String.valueOf(nums[i]));
        }

        Collections.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String x, String y) {
                String xy = x + y;
                String yx = y + x;
                return yx.compareTo(xy);
            }
        });

        if (arr.get(0).equals("0")) {
            return "0";
        }


        StringBuilder s = new StringBuilder();
        for (int i = 0; i < arr.size(); i++) {
            s.append(arr.get(i));
        }

        return s.toString();
    }

}
