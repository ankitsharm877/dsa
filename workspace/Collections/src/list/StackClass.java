package list;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.pop();
		stack.peek();
		stack.empty();
		stack.search(1);
	}

}
