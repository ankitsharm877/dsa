package queues;

public class DynamicQueueClient {

	public static void main(String[] args) throws Exception {
		QueueUsingArrays queue = new DynamicQueue(5);
		for (int i = 1; i <= 10; i++) {
			queue.enqueue(i);
		}
		queue.display();
		System.out.println("-----------------------");
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(8);
		queue.display();
	}

}
