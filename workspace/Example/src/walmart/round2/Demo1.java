package walmart.round2;

import walmart.round2.LinkedList.Node;

public class Demo1 {

	public static void main(String[] args) {
		// 1->9->9->9 
		// Add 1
		// 2->0->0->0
		
		LinkedList ll = new LinkedList();
		ll.head = new LinkedList.Node(9);
		ll.head.next = new Node(9);
		ll.head.next.next = new Node(9);
		ll.head.next.next.next = new Node(9);
		ll.display();
		
//		int n = 0; // 1999 + 1 = 2000
//		
//		while () {
//			
//		}
		// 1237283727221 + 1
//		9,9,9,1 -> n
//		1
//		0,0,0,2 -> n
//		2,0,0,0 -> n
		
		ll.reverse();
		//ll.display();
		ll.addOneAtFirst();
		ll.display();
		ll.reverse();
		ll.display();
	}

}


class LinkedList {
	static class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			this.next = null;
		}
		public String toString() {
			return this.data + "";
		}
	}
	
	Node head;
	
	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp + "->");
			temp = temp.next;
		}
		System.out.println("");
	}
	
	public void reverse() {
		Node prev = this.head; // 1
		Node curr = prev.next; // 2
		
		//1, 2, 3, 4
		while (curr != null) {
			Node aHead = curr.next; // null
			curr.next = prev;  //4 -> 1
			
			prev = curr; // 3
			curr = aHead; // 4
		}
		this.head.next = null;
		this.head = prev;
	}
	
	public void addOneAtFirst() {
		Node temp = this.head;
		Node prev = null;
		int carry = 0;
		while (temp != null) {
			int n = temp.data;
			int total = n + 1;
			if (total >= 10) {
				n = total % 10; // 0
				carry = total / 10; // 1
			} else {
				n = total; // 9
				carry = 0; // 0
			}
			temp.data = n;
			prev = temp;
			temp = temp.next;
		}
		if (carry != 0) {
			Node nn = new Node(carry);
			prev.next = nn;
		}
	}
}