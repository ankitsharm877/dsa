package main;

public class DemoQueueLL {

	public static void main(String[] args) {
		QueueLL queueLL = new QueueLL(10);
		queueLL.enqueue(1);
		queueLL.enqueue(2);
		queueLL.print();
		queueLL.dequeue();
		queueLL.dequeue();
		queueLL.print();
		queueLL.enqueue(1);
		queueLL.print();
	}

}
