package array.qus25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class NByKTimes {

	public static void main(String[] args) {
//		int arr[] = {3, 1, 2, 2, 1, 2, 3, 3};
//		int k = 4;
		int arr[] = {9, 8, 7, 9, 2, 9, 7}, k = 3;
		System.out.println(findElements(arr, k));
	}
	
	public static ArrayList<Integer> findElements(int[] arr, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
		}
		for (Entry<Integer, Integer> entry: hm.entrySet()) {
			if (entry.getValue() > (arr.length / k)) {
				list.add(entry.getKey());
			}
		}
		return list;
	}

}
