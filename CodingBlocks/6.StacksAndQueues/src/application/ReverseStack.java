package application;

import stacks.StackUsingArrays;

public class ReverseStack {

	public static void main(String[] args) throws Exception{
		StackUsingArrays stack = new StackUsingArrays();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.display();
		StackUsingArrays helper = new StackUsingArrays();
		reverseStack(stack, helper, 0);
		stack.display();
	}
	
	public static void reverseStack(StackUsingArrays stack, StackUsingArrays helper, int index) throws Exception {
		// +ve base case
		if (stack.isEmpty()) {
			return;
		}
		int item = stack.pop();
		reverseStack(stack, helper, index + 1);
		helper.push(item);
		if (index == 0) {
			while (!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}
	}

}
