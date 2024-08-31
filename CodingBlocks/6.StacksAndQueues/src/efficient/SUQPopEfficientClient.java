package efficient;

public class SUQPopEfficientClient {

	public static void main(String[] args) throws Exception {
		SUQPopEfficient stack = new SUQPopEfficient();
		for (int i = 1; i <= 6; i++) {
			stack.push(i);
		}
		stack.display();
		System.out.println(stack.pop());
		System.out.println(stack.top());
		stack.display();
	}

}
