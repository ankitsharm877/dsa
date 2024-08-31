package Deque;

import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentLinkedDequeClassDemo {

	public static void main(String[] args) {
		//An unbounded concurrent Deque based on linked nodes.
		//Concurrent insertion, removal, and access operations execute safely
		//across multiple threads.
		ConcurrentLinkedDeque<Integer> ll = new ConcurrentLinkedDeque<>();
		ll.add(1);
		ll.add(2);
	}

}
