package queue;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class LinkedBlockingQueueClassDemo {

	public static void main(String[] args) throws InterruptedException {
		//A Queue that additionally supports operations that wait 
		//for the queue to become non-empty when retrieving an element, 
		//and wait for space to become available in the queue when storing an element.
		
		//BlockingQueue<E>, java.io.Serializable
		LinkedBlockingQueue<Integer> lbq = new LinkedBlockingQueue<>();
		
		//Special value
		lbq.offer(1);
		lbq.poll();
		lbq.peek();
		
		//Throws exception
		lbq.add(1);
		lbq.element();
		lbq.remove();
		
		//blocks the current thread indefinitely until the operation can succeed
		lbq.put(1);
		lbq.take();
		
		//blocks for only a given maximum time limit before giving up.
		lbq.offer(1, 2 , TimeUnit.MINUTES);
		lbq.poll(2, TimeUnit.MINUTES);

	}

}
