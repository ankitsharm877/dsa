package queue;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueClassDemo {

	public static void main(String[] args) throws InterruptedException {
		//An unbounded {@linkplain BlockingQueue blocking queue} that uses
		//the same ordering rules as class {@link PriorityQueue} and supplies
		//blocking retrieval operations.
		
		PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<>();
		pbq.put(1);
		pbq.take();
	}

}
