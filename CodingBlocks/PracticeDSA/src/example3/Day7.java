package example3;

public class Day7 {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.head = new LinkedList.Node(1);
		ll.head.next = new LinkedList.Node(2);
		ll.head.next.next = new LinkedList.Node(3);
		ll.head.next.next.next = new LinkedList.Node(4);
		ll.display();
		ll.reverse();
		ll.display();
		ll.head = ll.reverseI(ll.head);
		ll.display();
		System.out.println("Middle: " + ll.middle().data);
		System.out.println("Has Cycle: " + ll.hasCycle());
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
	}

	Node head;
	
	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	
	public void reverse() {
		Node curr = this.head;
		Node prev = null;
		while (curr != null) {
			Node aHead = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = aHead;
		}
		this.head = prev;
	}
	
	public Node reverseI(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node rest = reverseI(head.next);
		head.next.next = head;
		head.next = null;
		return rest;
	}
	
	public Node middle() {
		if (head == null || head.next == null) {
			return head;
		}
		Node slow = this.head;
		Node fast = this.head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if (fast.next != null) {
			return slow.next;
		}
		return slow;
	}
	
	public boolean hasCycle() {
		if (head == null || head.next == null) {
			return false;
		}
		Node slow = this.head;
		Node fast = this.head.next;
		while (slow != fast) {
			if (fast.next == null || fast.next.next == null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}
	
	public void deleteNode (Node node) {
		Node temp = node.next;
		node.data = temp.data;
		node.next = temp.next;
		temp = null;
	}
	
	public void plusOne() {
		//step 1 
		this.reverse();
		// step2 add One
		Node temp = this.head;
		int carry = 1;
		
		while (temp.next != null) {
			int sum = temp.data + carry;
			carry = sum >= 10 ? 1 : 0;
			sum = sum % 10;
			
			temp.data = sum;
			temp = temp.next;
		}
		if (temp != null) {
			int sum = temp.data + carry;
			carry = sum >= 10 ? 1 : 0;
			sum = sum % 10;
			
			temp.data = sum;
		}
		if (carry == 1) {
			temp.next = new Node(carry);
		}
		//step 3
		this.reverse();
	}
}
