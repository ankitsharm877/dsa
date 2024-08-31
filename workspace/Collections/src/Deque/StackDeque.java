package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackDeque {

	public static void main(String[] args) {
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(1);
		stack.pop();
		stack.peek();
	}

}
