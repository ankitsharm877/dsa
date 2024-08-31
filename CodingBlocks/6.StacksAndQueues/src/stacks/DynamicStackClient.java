package stacks;

public class DynamicStackClient {

	public static void main(String[] args) throws Exception {
		StackUsingArrays stack = new DynamicStack(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.push(70);
		stack.display();
		System.out.println(stack.top());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Pop: " + stack.pop());
		stack.display();
	}

}
