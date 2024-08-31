package linkedlist;

public class CLinkedList {

	Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	//qus 17
	void splitList(){
         Node head1=null;
         Node head2=null;
           
         head1 = head;
         Node fast = head1;
         head2 = head;
         Node slow = head2;
         while (fast.next != head && fast.next.next != head) {
             fast = fast.next.next;
             slow = slow.next;
         }
         if (fast.next != head) {
             fast = fast.next;
         }
        head2 = slow.next;
        slow.next = head1;
        fast.next = head2;
 }
	
}
