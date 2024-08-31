package linkedlist;

import linkedlist.LinkedList.Node;

public class DemoLL {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(2);
        list.head.next.next.next.next = new Node(1);
        
        list.printList();
        //System.out.println("----------------");
        //list.reverseListIterative();
        //list.head = list.reverseListRecursion(list.head);
        //list.printList();
        
        //System.out.println("Is Loop exist: " + list.detectLoop(list.head));
        
        
        // qus 7
        //list.head.next.next.next.next = new Node(6);
        //list.printList();
        //list.removeDuplicatesInUnSorted();
        //list.printList();
        
        // qus 8
        //list.moveLastNodetoFront();
        //list.printList();
        
        // qus 9
        //list.addOne(list.head);
        
        // qus 18
        //list.isPalindrome();
        //list.head = list.reverse(list.head);
        //list.isPalindrome();
        //list.printList();
        
        //qus 34
        

	}

}
