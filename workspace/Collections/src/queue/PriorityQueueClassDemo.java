package queue;

import java.util.PriorityQueue;

public class PriorityQueueClassDemo {

	public static void main(String[] args) {
		//A collection designed for holding elements prior to processing according to some priority
		//based on priority heap
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		//Special value
		pq.offer(1);
		pq.poll();
		pq.peek();
		
		//Throws exception
		pq.add(1);
		pq.element();
		pq.remove();
		
		System.out.println(pq);
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

}
