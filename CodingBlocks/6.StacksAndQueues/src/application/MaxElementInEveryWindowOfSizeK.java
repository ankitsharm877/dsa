package application;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxElementInEveryWindowOfSizeK {

	public static void main(String[] args) {
		int[] arr = {1,2,3,1,4,5,2,3,6};
		int k = 3;
		maxElementInEveryWindowOfSizeK(arr, k);
	}
	
	public static void maxElementInEveryWindowOfSizeK(int[] arr, int k) {
		Deque<Integer> queue = new ArrayDeque<>();
		int i;
		for (i = 0; i < k; i++) {
			while (!queue.isEmpty() && arr[i] > arr[queue.getLast()]) {
				queue.removeLast();
			}
			queue.addLast(i);
		}
		for (;i < arr.length; i++) {
			System.out.println(arr[queue.getFirst()]);
			while (!queue.isEmpty() && queue.getFirst() <= i - k) {
				queue.removeFirst();
			}
			
			while (!queue.isEmpty() && arr[i] > arr[queue.getLast()]) {
				queue.removeLast();
			}
			queue.addLast(i);
		}
		System.out.println(arr[queue.getFirst()]);
	}

}
