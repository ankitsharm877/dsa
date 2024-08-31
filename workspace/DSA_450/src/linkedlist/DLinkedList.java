package linkedlist;

public class DLinkedList {

	Node head;

	static class Node {

		int data;
		Node next;
		Node prev;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	public void print() {
		Node p = head;
		while (p != null) {
			System.out.print(p.data + " -> ");
			p = p.next;
		}
		System.out.println("");
	}
	
	//qus 20
	public static Node reverseDLL(Node head){
	    if (head == null) {
	        return head;
	    }
	    Node p = head;
	    while (p != null) {
	        Node t = p.next;
	        p.next = p.prev;
	        p.prev = t;
	        p = p.prev;
	        if (p != null && p.next == null) {
				head = p;
			}
	    }
	    return head;
	}
	
	//qus 21
	public boolean pairSum(int x) {
		Node p = head;
		Node q = head;
		while (q != null) {
			q = q.next;
		}
		while (p != q) {
			if ((p.data + q.data) == x) {
				return true;
			} else if ((p.data + q.data) < x) {
				p = p.next;
			} else {
				q = q.prev;
			}
		}
		return false;
	}
	
	//qus 24
	public void rotateByK(int k) {
		Node p = head;
		for (int i = 0; i < k - 1 && p != null; i++) {
			p = p.next;
		}
		Node q = p.next;
		p.next = null;
		p = q;
		while (q.next != null) {
			q = q.next;
		}
		q.next = head;
		head = p;
	}
	
}
