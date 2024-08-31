package main;

public class DLLDemo {

	public static void main(String[] args) {
		DoubleLinkedList list = new DoubleLinkedList();
//		list.head = list.new Node(1);
//		list.head.next = list.new Node(2);
//		list.head.prev = null;
//		list.head.next.next = list.new Node(3);
//		list.head.next.prev = list.head.next;
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		list.addLast(4);
		list.addLast(5);
		list.add(0, 6);
		list.display();
		System.out.println("Lnegth: " + list.length());
		//System.out.println("Remove : " + list.removeFirst());
		//list.display();
		//System.out.println("Remove : " + list.removeFirst());
		//list.display();
		//System.out.println("Remove : " + list.removeLast());
		//list.display();
		//System.out.println("Remove : " + list.remove(1));
		//System.out.println("Remove : " + list.remove(0));
		//System.out.println("Remove : " + list.remove(0));
		list.display();
		list.reverse();
		list.display();
	}

}
