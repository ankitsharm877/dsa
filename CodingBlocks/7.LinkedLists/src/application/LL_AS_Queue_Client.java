package application;

public class LL_AS_Queue_Client {

	public static void main(String[] args) throws Exception {
		LL_AS_Queue queue = new LL_AS_Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.display();
		queue.dequeue();
		queue.display();
	}

}
