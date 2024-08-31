package main;

public class CircularLinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		Node (int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addFirst(int data) {
		Node node = new Node(data);
		if (this.head == null) {
			node.next = node;
			this.head = node;
			return;
		}
		Node p = this.head;
		node.next = p;
		while (p.next != this.head) {
			p = p.next;
		}
		p.next = node;
		this.head = node;
	}

	public void addLast(int data) {
		Node node = new Node(data);
		if (this.head == null) {
			node.next = node;
			this.head = node;
			return;
		}
		Node p = this.head;
		while (p.next != this.head) {
			p = p.next;
		}
		node.next = p.next;
		p.next = node;
	}

	public void add(int data, int pos) {
		Node node = new Node(data);
		if (this.head == null) {
			node.next = node;
			this.head = node;
			return;
		}
		if (pos == 0) {
			addFirst(data);
			return;
		}
		Node p = this.head;
		for (int i = 0; i < pos - 1; i++) {
			p = p.next;
		}
		node.next = p.next;
		p.next = node;
	}

	public void removeLast() {
		if (this.head == null || this.head.next == this.head) {
			this.head = null;
			return;
		}
		Node p = this.head;
		Node q = null;
		while (p.next != this.head) {
			q = p;
			p = p.next;
		}
		q.next = p.next;
		p.next = null;
	}

	public void removeFirst() {
		if (this.head == null || this.head.next == this.head) {
			this.head = null;
			return;
		}
		Node p = this.head;
		while (p.next != this.head) {
			p = p.next;
		}
		p.next = this.head.next;
		this.head = this.head.next;
	}

	public void remove(int pos) {
		if (this.head == null || pos == 0) {
			return;
		}
		if (pos == 1) {
			removeFirst();
			return;
		}
		Node p = this.head;
		for (int i = 0; i < pos - 2; i++) {
			p = p.next;
		}
		Node q = p.next;
		p.next = q.next;
		q = null;
	}

	public void display() {
		if (this.head == null) {
			System.out.println("List is empty!");
			return;
		}
		Node p = this.head;
		do {
			System.out.print(p.data + " -> ");
			p = p.next;
		} while (p != head);
		System.out.println("");
	}

	boolean flag = true;
	public void display(Node head) {
		if (head != this.head || flag) {
			flag = false;
			System.out.println(head.data);
			display(head.next);
		}
		flag = true;
	}

	public int length() {
		int len = 0;
		Node p = this.head;
		do {
			len++;
			p = p.next;
		} while (p != this.head);
		return len;
	}

}
