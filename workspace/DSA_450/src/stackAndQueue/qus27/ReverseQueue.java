package stackAndQueue.qus27;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		System.out.println(q);
		reverse(q);
		System.out.println(q);
	}
	
	 public static Queue<Integer> reverseI(Queue<Integer> q){
		 if (q.isEmpty()) {
			 return q;
		 }
		 int last = q.remove();
		 reverseI(q);
		 q.add(last);
		 return q;
	 }
	 
	 public static Queue<Integer> reverse(Queue<Integer> q){
		Stack<Integer> s = new Stack<>();
		while(!q.isEmpty()) {
			s.push(q.remove());
		}
		while(!s.isEmpty()) {
			q.add(s.pop());
		}
		return q;
	 }

}
