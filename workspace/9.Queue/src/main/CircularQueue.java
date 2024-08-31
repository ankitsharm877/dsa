package main;

public class CircularQueue {
	int[] Q;
	int size;
	int front;
	int rear;
	
	public CircularQueue(int size) {
		this.size = size;
		this.Q = new int[this.size];
		this.front = -1;
		this.rear = -1;
	}
	
	public void enqueue(int data) {
		if ((this.rear + 1) % this.size == this.front) {
			System.out.println("Queue is full");
		} else {
			this.rear = (this.rear + 1) % this.size ;
			this.Q[this.rear] = data;
		}
	}
	
	public int dequeue() {
		if (this.front == this.rear) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			this.front = (this.front + 1) % this.size;
			return this.Q[this.front];
		}
	}
	
	public void print() {
		int i = this.front + 1;
		do {
			System.out.print(this.Q[i] +", ");
			i = (i + 1) % this.size;
		} while (i != (this.rear + 1) % this.size);
		System.out.println("");
	}

}
