package application;

import core.LinkedList;

public class ReverseLL {

	public static void main(String[] args) throws Exception {
		LinkedList ll = new LinkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.display();
		//ll.reverseLLData();
		ll.reverseLL();
		ll.display();
		System.out.println(ll.middle());
		ll.removeLast();
		ll.display();
		System.out.println(ll.middle());
	}

}
