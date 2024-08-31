package utils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysClassDemo {

	public static void main(String[] args) {
		Integer[] arr = new Integer[5];
		int[] nums = new int[5];
		Arrays.sort(arr);
		Arrays.sort(arr, Comparator.reverseOrder());
		Arrays.binarySearch(arr, 0);
		
		List<Integer> list = Arrays.asList(arr);

		Arrays.fill(arr, 1);
		
		Integer min = Arrays.stream(nums).max().getAsInt();
		Integer max = Arrays.stream(nums).max().getAsInt();
	}
}
