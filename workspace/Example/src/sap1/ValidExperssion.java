package sap1;

import java.util.Stack;

public class ValidExperssion {

	public static void main(String[] args) {
		//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
		String str = "({})";
		Stack<Character> stack = new Stack<>();
		boolean flag = true;
		for (char c : str.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else {
				if (stack.isEmpty()) {
					flag = false;
				} else {
					stack.pop();
				}
			}
		}
		if (flag) {			
			System.out.println("Valid: " + stack.isEmpty());
		} else {
			System.out.println("Valid: " + flag);
		} 
	}
}
