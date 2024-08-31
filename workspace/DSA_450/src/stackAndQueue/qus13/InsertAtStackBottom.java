package stackAndQueue.qus13;

import java.util.Stack;

public class InsertAtStackBottom {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s);
		insertAtBottom(s, 0);
		System.out.println(s);
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
