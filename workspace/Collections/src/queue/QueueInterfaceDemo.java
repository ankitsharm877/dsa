package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceDemo {

	public static void main(String[] args) {
		//A collection designed for holding elements prior to processing.
		Queue<Integer> q = new LinkedList<>();
		//Special value
		q.offer(1);
		q.poll();
		q.peek();
		
		//Throws exception
		q.add(1);
		q.element();
		q.remove();
	}

}
