package queues;

public class QueueUsingArraysClient {

	public static void main(String[] args) throws Exception {
		QueueUsingArrays queue = new QueueUsingArrays(10);
		for (int i = 1; i <= 5; i++) {
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
