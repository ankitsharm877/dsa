package queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueInterfaceDemo {

	public static void main(String[] args) throws InterruptedException {
		//A Queue that additionally supports operations that wait 
		//for the queue to become non-empty when retrieving an element, 
		//and wait for space to become available in the queue when storing an element.
		
		//Queue<E>
		BlockingQueue<Integer> bq = new ArrayBlockingQueue<>(1);
		
		//Special value
		bq.offer(1);
		bq.poll();
		bq.peek();
		
		//Throws exception
		bq.add(1);
		bq.element();
		bq.remove();
		
		//blocks the current thread indefinitely until the operation can succeed
		bq.put(1);
		bq.take();
		
		//blocks for only a given maximum time limit before giving up.
		bq.offer(1, 2 , TimeUnit.MINUTES);
		bq.poll(2, TimeUnit.MINUTES);

	}

}
