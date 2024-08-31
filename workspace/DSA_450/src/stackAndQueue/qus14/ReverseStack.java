package stackAndQueue.qus14;

import java.util.Stack;

public class ReverseStack {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s);
		reverse(s);
		System.out.println(s);

	}
	
	public static void reverse(Stack<Integer> s) {
		if (s.isEmpty()) {
			return;
		}
		int last = s.pop();
		reverse(s);
		insertAtBottom(s,last);
		return;
	}
	
	public static void insertAtBottom(Stack<Integer> s, int x) {
		if (s.isEmpty()) {
			s.push(x);
			return;
		}
		int last = s.pop();
		insertAtBottom(s, x);
		s.push(last);
		return;
	}

}
