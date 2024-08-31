package accoliteDigital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Round2 {

	public static void main(String[] args) {
		int a1 = 10;
		int b1 = 20;
		Addable addable = (a, b) -> a + b;
		//System.out.println(addable.add(a1, b1));
		//key, value
		//key -> hashcode
		
//		ArrayList<>
//		LinkedList<>
//		
//		Hashtable
//		
//		CurrentHashMap
		
		/*
		Given an array of integers arr, write a function to find the smallest subarray that 
		//contains all the occurrences of the most frequent element in the array.

		Input :
		int[] arr = {1, 2, 2, 3, 1, 4, 2};

		Output :
		The most frequent element is 2, which appears 3 times.
		The smallest subarray containing all occurrences of 2 is [2, 2, 3, 1, 4, 2].
		*/
		
		int[] arr = {1, 2, 2, 3, 1, 4, 2};
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int val : arr) {
			hm.put(val, hm.getOrDefault(val, 0) + 1);
		}
		int mostFrq = 0;
		int count = 0;
		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() > count) {
				count = entry.getValue();
				mostFrq = entry.getKey();
			}
		}
		System.out.println(mostFrq +"," +count);
		ArrayList<Integer> list = new ArrayList<>();
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == mostFrq && !flag) {
				flag = true;
				list.add(arr[i]);
				count--;
			} else if (flag && count > 0) {
				list.add(arr[i]);
				if (arr[i] == mostFrq) count--;
			}
		}
		System.out.println(list);
	}
}

//Node[] 
//
//class Node {
//	int key;
//	int value;
//	Node next;
//}

interface Addable {
	int add(int a, int b);
}