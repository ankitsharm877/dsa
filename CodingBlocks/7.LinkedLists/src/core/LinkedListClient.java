package core;

public class LinkedListClient {

	public static void main(String[] args) throws Exception {
		LinkedList ll = new LinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addFirst(40);
		ll.addFirst(50);
		ll.display();
		ll.addAt(1, 4);
		ll.display();
	}
}
