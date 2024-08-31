package stackAndQueue.qus28;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q);
		modifyQueue(q, 3);
		System.out.println(q);

	}

	public static Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
		int n = q.size() - k;
		Stack<Integer> stack = new Stack<>();
		while (k > 0) {
			stack.push(q.poll());
			k--;
		}
		while (stack.size() > 0) {
			q.add(stack.pop());
		}
		while (n > 0) {

			q.add(q.poll());
			n--;
		}
		return q;
	}
}
