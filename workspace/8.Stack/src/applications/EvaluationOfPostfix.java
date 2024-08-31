package applications;

import java.util.Stack;

public class EvaluationOfPostfix {

	public static void main(String[] args) {
		String postfix = "35*62/+4-";
		System.out.println(evaluate(postfix));
	}

	public static int evaluate(String postfix) {
		Stack<Integer> stack = new Stack<>();
		for (char c : postfix.toCharArray()) {
			if (isOperand(c)) {
				stack.push(Character.getNumericValue(c));
			} else {
				int x2 = stack.pop(), x1 = stack.pop();
				switch (c) {
					case '+': {
						int x = x1 + x2; stack.push(x); break;
					}
					case '-' : {
						int x = x1 - x2; stack.push(x); break;
					}
					case '*': {
						int x = x1 * x2; stack.push(x); break;
					}
					case '/' : {
						int x = x1 / x2; stack.push(x); break;
					}
				}
			}
		}		
		return stack.pop();
	}
	
	public static boolean isOperand(char c) {
		if (c == '+' || c == '-' || c == '*' || c == '/') {
			return false;
		} else {
			return true;
		}
	}
}
