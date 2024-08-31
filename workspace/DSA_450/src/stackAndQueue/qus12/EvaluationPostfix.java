package stackAndQueue.qus12;

import java.util.Stack;

public class EvaluationPostfix {

	public static void main(String[] args) {
		String s = "12+3*";
		System.out.println(evaluatePostFix(s));

	}

	public static int evaluatePostFix(String tokens) {
       Stack<Integer> s = new Stack<>();
        for (char t : tokens.toCharArray()) {
            if (isOperand(t)) {
                int x = Integer.parseInt(t + "");
                s.push(x);
            } else {
                int x2 = s.pop();
                int x1 = s.pop();
                switch (t) {
                    case '+' : s.push(x1 + x2); break;
                    case '-' : s.push(x1 - x2); break;
                    case '*' : s.push(x1 * x2); break;
                    case '/' : s.push(x1 / x2); break;
                }
            }
        }
        return s.pop();
    }

    public static boolean isOperand(char s) {
        if (s == '+' || s == '-' || s == '*' || s == '/')  {
            return false;
        }
        return true;
    }
}
