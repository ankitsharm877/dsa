package linkedlist;

import linkedlist.DLinkedList.Node;

public class DemoDLL {

	public static void main(String[] args) {
		DLinkedList list = new DLinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.prev = list.head;
        list.head.next.next = new Node(3);
        list.head.next.prev = list.head.next;
        list.head.next.next.next = new Node(4);
        list.head.next.next.prev = list.head.next.next;
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.prev = list.head.next.next.next;
        list.print();
        list.rotateByK(2);
        list.print();
	}

}
