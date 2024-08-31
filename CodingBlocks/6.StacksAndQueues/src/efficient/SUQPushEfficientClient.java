package efficient;

public class SUQPushEfficientClient {

	public static void main(String[] args) throws Exception {
		SUQPushEfficient stack = new SUQPushEfficient();
		for (int i = 1; i <= 6; i++) {
			stack.push(i);
		}
		stack.display();
		System.out.println(stack.pop());
		System.out.println(stack.top());
		stack.display();
	}

}
