package main;

public class StackLL {
	Node top;
	int size;
	int length;

	class Node {
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	
	public StackLL(int size) {
		this.top = null;
		this.length = 0;
		this.size = size;
	}
	
	public void push(int data) {
		if (this.length == this.size) {
			System.out.println("Stack Overflow");
		} else {
			Node node = new Node(data);
			node.next = this.top;
			this.top = node;
			this.length++;
		}
	}
	
	public int pop() {
		if (this.top == null) {
			System.out.println("Stack Underflow");
			return -1;
		} else {
			Node p = this.top;
			this.top = this.top.next;
			this.length--;
			return p.data;
		}
	}
	
	public int peek(int index) {
		if (this.top == null) {
			System.out.println("Stack Underflow");
			return -1;
		} else {
			Node p = this.top;
			for (int i = 0; i < index - 1 && p != null; i++) {
				p = p.next;
			}
			if (p == null) {
				return -1; 
			} else {
				return p.data;
			}
		}
	}
	public int stackTop() {
		return this.top != null ? this.top.data : -1;
	}
	
	public boolean isEmpty() {
		return this.top == null;
	}
	
	public boolean isFull() {
		return this.length == this.size;
	}
	
	public void print() {
		Node p = this.top;
		while(p != null) {
			System.out.print(p.data + " -> ");
			p = p.next;
		}
		System.out.println("");
	}
}
