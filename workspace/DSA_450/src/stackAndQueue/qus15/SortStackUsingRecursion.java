package stackAndQueue.qus15;

import java.util.Stack;

public class SortStackUsingRecursion {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.push(4);
		s.push(3);
		s.push(2);
		s.push(1);
		System.out.println(s + ", Top: " + s.peek());
		sort(s);
		System.out.println(s + ", Top: " + s.peek());
		
	}
	
	public static void sort(Stack<Integer> s) { // 4
		if (s.isEmpty()) {
			return;
		}
		int last = s.pop();
		sort(s);
		for (int i = 0; i < s.size(); i++) {
			if (last < s.get(i)) {
				int x = s.remove(i);
				s.add(i, last);
				last = x;
			}
		}
		s.push(last);
		return;
	}

}
