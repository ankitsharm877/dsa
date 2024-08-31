package main;

public class QueueLL {
	Node front;
	Node rear;
	int size;
	int length;
	
	public class Node {
		int data;
		Node next;
		
		public Node (int data) {
			this.data = data;
			this.next = null;
		}
	}

	public QueueLL(int size) {
		this.length = 0;
		this.size = size;
	}
	
	public void enqueue(int data) {
		if (this.length == this.size) {
			System.out.println("Queue is full");
		} else {
			Node node = new Node(data);
			if (this.front == null) {
				this.front = node;
				this.rear = node;
				this.length++;
			} else {
				this.rear.next = node;
				this.rear = node;
				this.length++;
			}
		}
	}
	
	public int dequeue() {
		if (this.front == null) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			Node p = this.front;
			this.front = this.front.next;
			this.length--;
			return p.data;
		}
	}
	
	public void print() {
		Node p = this.front;
		while (p != null) {
			System.out.print(p.data + " -> ");
			p = p.next;
		}
		System.out.println("");
	}
}
