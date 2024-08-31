package core;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CreateThread {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyThread t1 = new MyThread();
		t1.start();
		System.out.println("main thread");
		
		Thread t2 = new Thread(new MyThread2());
		t2.start();
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		
		System.out.println(Thread.currentThread());
		System.out.println(t1);
		System.out.println(t2);
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.join();
		
		Callable callable = new MyThreadCallable();
		FutureTask<Integer> ft = new FutureTask<>(callable);
		Thread t3 = new Thread(ft);
		t3.start();
		System.out.println(ft.get());
	}

}

class MyThread extends Thread {
	
	public void run () {
		Thread.yield();
		System.out.println("child thread");
	}
}

class MyThread2 implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("child runnable thread");
	}
}

class MyThreadCallable implements Callable<Integer> {
	public Integer call() {
		return Integer.getInteger("34");
	}
}
