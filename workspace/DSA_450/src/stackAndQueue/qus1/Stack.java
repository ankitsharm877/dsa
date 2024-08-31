package stackAndQueue.qus1;

public class Stack {
	
	int top = -1;
	int size = 0;
	int[] S;
	
	public Stack(int size) {
		this.size = size;
		this.S = new int[this.size];
	}
	
	public void push(int data) {
		if (this.top == this.size - 1) {
			System.out.println("Error: Stack Overflow");
		} else {
			this.S[++this.top] = data;
		}
		
	}
	public int pop() {
		if (this.top == -1) {
			System.out.println("Error: Stack Underflow");
			return -1;
		}
		return this.S[this.top--];
	}
	public int peek(int index) {
		if ((this.top - index + 1) < 0) {
			System.out.println("Position Invalid");
			return -1;
		} else {
			return this.S[this.top - index + 1];
		}
	}
	public int stackTop() {
		if (this.top == -1) {
			return -1;
		} else {
			return this.S[this.top];
		}
	}
	public boolean isEmpty() {
		return this.top == -1;
	}
	public boolean isFull() {
		return this.top == this.size - 1;
	}
}
