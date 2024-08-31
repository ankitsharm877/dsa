package efficient;

public class QUSDequeueEfficientClient {

	public static void main(String[] args) throws Exception {
		QUSDequeueEfficient queue = new QUSDequeueEfficient();
		for (int i = 1; i <= 6; i++) {
			queue.enqueue(i);
		}
		queue.display();
		queue.dequeue();
		queue.display();
		queue.dequeue();
		queue.display();
		queue.enqueue(10);
		queue.display();
		System.out.println("Front: " + queue.getFront());
	}

}
