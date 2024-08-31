package main;

public class CLLDemo {

	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();
//		list.head = list.new Node(1);
//		list.head.next = list.new Node(2);
//		list.head.next.next = list.new Node(3);
//		list.head.next.next.next = list.new Node(4);
//		list.head.next.next.next.next = list.head;
//		list.display(list.head);
//		list.addLast(1);
//		list.addLast(2);
//		list.addLast(3);
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		list.add(4, 0);
		list.display();
		//list.removeLast();
		//list.display();
		list.remove(1);
		list.display();
		System.out.println("Length: " + list.length());
	}

}
