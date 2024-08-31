package application;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		int[] arr = {2, 1, 3, 8, 6, 7, 5};
		nextGreaterElement(arr);
	}
	
	public static void nextGreaterElement(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[i] > stack.peek()) {
				int x = stack.pop();
				System.out.println(x + " -> " + arr[i]);
			}
			stack.push(arr[i]);
		}
		
		while (!stack.isEmpty()) {
			System.out.println(stack.pop() + " -> " + -1);
		}
	}

}
