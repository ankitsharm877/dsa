package main;

public class DoubleLinkedList {
	Node head = null;

	class Node {
		int data;
		Node prev = null;
		Node next = null;

		Node (int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}

	public void addFirst(int data) {
		Node node = new Node(data);
		if (this.head == null) {
			this.head = node;
			return;
		}
		node.next = this.head;
		this.head.prev = node;
		this.head = node;
	}

	public void addLast(int data) {
		Node node = new Node(data);
		if (this.head == null) {
			this.head = node;
			return;
		}
		Node p = this.head;
		while (p.next != null) {
			p = p.next;
		}
		p.next = node;
		node.prev = p;
	}

	public void add(int data, int pos) {
		Node node = new Node(data);
		if (pos == 0) {
			addFirst(data);
			return;
		}
		if (this.head == null) {
			return;
		}
		Node p = this.head;
		for (int i = 0; i < pos - 1; i++) {
			p = p.next;
		}
		if (p != null) {
			node.next = p.next;
			node.prev = p;
			p.next = node;
			if (node.next != null) {
				node.next.prev = node;
			}
		} else {
			System.out.println("Index out of bound");
		}
	}

	public int removeFirst() {
		if (this.head == null) {
			System.out.println("List is empty");
			return -1;
		}
		Node p = this.head;
		this.head = p.next;
		if (p.next != null) {
			p.next.prev = null;
		}
		p.next = null;
		return p.data;
	}

	public int removeLast() {
		if (this.head == null) {
			System.out.println("List is empty");
			return -1;
		}
		Node p = this.head;
		while (p.next != null) {
			p = p.next;
		}
		if (p.prev != null) {
			p.prev.next = null;
			p.prev = null;
		} else {
			this.head = null;
		}
		return p.data;
	}

	public int remove(int index) {
		if (index <= 1) {
			return removeFirst();
		}
		if (this.head == null) {
			System.out.println("List is empty");
			return -1;
		}
		Node p = this.head;
		for (int i = 0; i < index - 1 && p != null; i++) {
			p = p.next;
		}
		if (p != null) {
			if(p.prev != null) {
				p.prev.next = p.next;
			}
			if (p.next != null) {
				p.next.prev = p.prev;
			}
			p.next = null;
			p.prev = null;
			return p.data;
		} else {
			return -1;
		}

	}

	public int length() {
		int len = 0;
		Node p = this.head;
		while (p != null) {
			len++;
			p = p.next;
		}
		return len;
	}

	public void display() {
		Node p = this.head;
		while (p != null) {
			System.out.print(p.data + " -> ");
			p = p.next;
		}
		System.out.println("");
	}

	public void reverse() {
		if (this.head == null) {
			return;
		}
		Node p = this.head;
		while (p != null) {
			Node temp = p.next;
			p.next = p.prev;
			p.prev = temp;
			p = p.prev;
			if (p != null && p.next == null) {
				this.head = p;
			}
		}
	}

}
