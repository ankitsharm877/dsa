package example3;

public class Day8 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.head = new LinkedList.Node(1);
		ll.head.next = new LinkedList.Node(2);
		LinkedList.Node temp = ll.head.next.next = new LinkedList.Node(3);
		ll.head.next.next.next = new LinkedList.Node(4);
		ll.display();
		//ll.deleteNode(temp);
		//ll.display();
		ll.plusOne();
		ll.display();
	}
}

