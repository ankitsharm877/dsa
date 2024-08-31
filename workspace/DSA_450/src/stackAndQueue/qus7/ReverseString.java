package stackAndQueue.qus7;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		String S = "GeeksforGeeks";
		System.out.println(reverse(S));
	}
	
	public static String reverse(String S){
       Stack<Character> stack = new Stack<>();
       for (char c : S.toCharArray()) {
            stack.push(c);
       }
       S = "";
       while (!stack.isEmpty()) {
         S += stack.pop();
       }
       return S;
	}

}
