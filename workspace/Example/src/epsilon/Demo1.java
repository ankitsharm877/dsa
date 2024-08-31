package epsilon;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {
		int[] arr = {2,0,4,5,0,3,7,0,8,5,0,6,2,0};
		//moveZero(arr);
		//System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(findGreaterElement(arr)));
		
		//list.stream().forEach()
		
		
	}
	
	public static int[] findGreaterElement(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int val : arr) {
			if (!list.contains(Integer.valueOf(val))) {
				list.add(val);
			}
		}
		//System.out.println(list);
		int[] ans = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			for (int j = i; j < list.size(); j++) {
				if (list.get(i) < list.get(j)) {
					ans[i] = list.get(j);
					break;
				}
				ans[i] = -1;
			}
		}
		return ans;
	}
	
	public static void moveZero(int[] arr) {
		int i = 0; // 1
		for (int j = 0; j < arr.length; j++) { // j = 2
			if (arr[j] != 0) {
				int x = arr[i];
				arr[i] = arr[j];
				arr[j] = x;
				i++;
			}
		}
		//Arrays.sort(arr);
		bubbleSort(arr);
	}
	
	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j - 1] > arr[j]) {
					int x = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = x;
				}
			}
		}
	}
}

