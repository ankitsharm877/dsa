package applications;

import java.util.Stack;

public class ParanthesisMatching {

	public static void main(String[] args) {
		String str = "((a+b)*(c*d))";
		System.out.println(isMatching(str));
	}

	public static boolean isMatching(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(') {
				stack.push(c);
			} else if (c == ')') {
				if (stack.isEmpty()) {
					return false;
				} else {
					stack.pop();
				}
			}
		}
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
	
	public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        char[] str = s.toCharArray();
        StringBuilder sb = new StringBuilder("");
        for (char c: str) {
            if (c == '(') {
                if(stack.size()>0){
                    sb.append(c);
                }
                stack.push(c);
            } else {
                stack.pop();
                if(stack.size()>0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
