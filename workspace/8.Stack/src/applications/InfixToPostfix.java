package applications;

import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {
		String infix = "a+b*c-d/e";
		System.out.println(convert(infix));
	}
	
	public static String convert(String infix) {
		StringBuilder postfix = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		stack.push('#');
		int i = 0;
		while (i < infix.length()) {
			if (isOperand(infix.charAt(i))) {
				postfix.append(infix.charAt(i));
				i++;
			} else {
				if (pre(infix.charAt(i)) > pre(stack.peek())) {
					stack.push(infix.charAt(i));
					i++;
				} else {
					postfix.append(stack.pop());
				}
			}
		}
		while (!stack.isEmpty()) {
			postfix.append(stack.pop());
		}
		return postfix.toString();
	}
	
	public static boolean isOperand(char c) {
		if (c == '+' || c == '-' || c == '*' || c == '/') {
			return false;
		} else {
			return true;
		}
	}
	
	public static int pre(char c) {
		if (c == '+' || c == '-') {
			return 1;
		} else if (c == '*' || c == '/') {
			return 2;
		}
		return 0;
	}
	
}
