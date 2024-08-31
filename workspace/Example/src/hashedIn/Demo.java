package hashedIn;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		//1. communication between two services
		//2. why create micro-services instead of single service
		int[] arr = { 1, 2, 3, 2, 1, 2, 3, 1, 2, 4, 3 };
		int target = 3;
		System.out.println(find(arr, target));
		System.out.println(find(arr, target));
		System.out.println(find(arr, target));
		System.out.println(find(arr, target));
	}

	static ArrayList<Integer> list = new ArrayList<>();

	public static int find(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				if (list.contains(i)) {
					continue;
				} else {
					list.add(i);
					return i;
				}
			}
		}
		if (list.size() > 0) {
			list.clear();
			return find(arr, target);
		} else {			
			return -1;
		}

	}
}