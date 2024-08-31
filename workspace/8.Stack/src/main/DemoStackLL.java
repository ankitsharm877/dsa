package main;

public class DemoStackLL {

	public static void main(String[] args) {
		StackLL stack = new StackLL(10);
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.print();
		System.out.println(stack.pop());
		stack.print();
		System.out.println(stack.peek(3));
	}

}
