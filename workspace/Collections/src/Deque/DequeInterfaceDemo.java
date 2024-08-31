package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterfaceDemo {

	public static void main(String[] args) {
		//A linear collection that supports element insertion and removal at
		//both ends.  The name <i>deque</i> is short for "double ended queue"
		
		//implements Queue
		Deque<Integer> deque = new ArrayDeque<>();
		deque.addFirst(1);
		deque.addLast(2);
		deque.getFirst();
		deque.getLast();
		deque.removeFirst();
		deque.removeLast();
		
		deque.offerFirst(1);
		deque.offerLast(1);
		deque.pollFirst();
		deque.pollLast();
		deque.peekFirst();
		deque.peekLast();
		
		deque.offer(1);
		deque.poll();
		deque.peek();
		
		deque.push(1);
		deque.pop();
		deque.peek();

	}

}
