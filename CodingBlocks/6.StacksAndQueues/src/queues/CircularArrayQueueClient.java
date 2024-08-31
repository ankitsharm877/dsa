package queues;

public class CircularArrayQueueClient {

	public static void main(String[] args) throws Exception {
		CircularArrayQueue queue = new CircularArrayQueue(5);
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
