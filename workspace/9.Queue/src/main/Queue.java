package main;

public class Queue {
	int[] Q;
	int size;
	int front;
	int rear;
	
	public Queue(int size) {
		this.size = size;
		this.Q = new int[this.size];
		this.front = -1;
		this.rear = -1;
	}
	
	public void enqueue(int data) {
		if (this.rear == this.size - 1) {
			System.out.println("Queue is full");
		} else {
			this.Q[++this.rear] = data;
		}
	}
	
	public int dequeue() {
		if (this.front == this.rear) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			return this.Q[++this.front];
		}
	}
	
	public void print() {
		int i = this.front + 1;
		while (i <= this.rear) {
			System.out.print(this.Q[i++] +", ");
		}
		System.out.println("");
	}

}
