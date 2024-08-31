package queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ArrayBlockingQueueClassDemo {

	public static void main(String[] args) throws InterruptedException {
		//A Queue that additionally supports operations that wait 
		//for the queue to become non-empty when retrieving an element, 
		//and wait for space to become available in the queue when storing an element.
		
		//BlockingQueue<E>, java.io.Serializable
		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<>(10);
		
		//Special value
		abq.offer(1);
		abq.poll();
		abq.peek();
		
		//Throws exception
		abq.add(1);
		abq.element();
		abq.remove();
		
		//blocks the current thread indefinitely until the operation can succeed
		abq.put(1);
		abq.take();
		
		//blocks for only a given maximum time limit before giving up.
		abq.offer(1, 2 , TimeUnit.MINUTES);
		abq.poll(2, TimeUnit.MINUTES);
		

	}

}
