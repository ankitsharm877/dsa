package applications;

public class DemoDequeue {

	public static void main(String[] args) {
		DequeueArray dequeueArray = new DequeueArray(4);
		dequeueArray.insertFront(1);
		dequeueArray.insertLast(2);
		dequeueArray.insertLast(3);
		dequeueArray.insertLast(4);
		System.out.println("delete : " + dequeueArray.deleteFront());
		dequeueArray.insertFront(1);
		System.out.println(dequeueArray.getFront());
		System.out.println(dequeueArray.getRear());
	}

}
