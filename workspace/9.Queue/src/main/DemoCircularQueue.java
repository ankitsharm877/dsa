package main;

public class DemoCircularQueue {

	public static void main(String[] args) {
		CircularQueue2 queue = new CircularQueue2(3);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.display();

	}

}
