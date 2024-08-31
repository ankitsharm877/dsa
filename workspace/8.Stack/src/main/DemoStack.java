package main;

public class DemoStack {

	public static void main(String[] args) {
		Stack stack = new Stack(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek(4));
		System.out.println(stack.stackTop());
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
	}

}
