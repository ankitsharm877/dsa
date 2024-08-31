package core;

public class SynchronizedClassMethodDemo {
	
	//method level synchronized
	public synchronized void test() {
		System.out.println("Synchronized test");
	}

	//class level synchronized
	public synchronized static void testStatic() {
		System.out.println("Synchronized test");
	}
	String str = "";
//	synchronized(str) {
//		
//	}
	
	public static void main(String[] args) {

	}

}
