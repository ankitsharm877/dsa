package application;

import queues.DynamicQueue;

public class ReverseQueue {

	public static void main(String[] args) throws Exception {
		//1,2,3,4,5,6
		//6,5,4,3,2,1
		DynamicQueue queue = new DynamicQueue();
		for (int i = 1; i <= 6; i++) {
			queue.enqueue(i);
		}
		queue.display();
		reverseQueue(queue);
		queue.display();
	}
	
	public static void reverseQueue(DynamicQueue queue) throws Exception {
		if (queue.isEmpty()) {
			return;
		}
		int element = queue.dequeue();
		reverseQueue(queue);
		queue.enqueue(element);
	}

}
