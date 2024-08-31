package stacks;

public class StackUsingArraysClient {

	public static void main(String[] args) throws Exception {
		StackUsingArrays stack = new StackUsingArrays(5);
		System.out.println(stack.isEmpty());
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		//stack.push(60);
		stack.display();
		System.out.println(stack.top());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Pop: " + stack.pop());
		stack.display();
		System.out.println(stack.isEmpty());
	}

}
