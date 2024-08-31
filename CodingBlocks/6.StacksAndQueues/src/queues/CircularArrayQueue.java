package queues;

public class CircularArrayQueue {

	protected int[] data;
	protected int size;
	protected int maxSize;
	private int front;
	private int rear;
	
	public static final int DEFAULT_CAPACITY = 10;
	
	public CircularArrayQueue() {
		this(DEFAULT_CAPACITY);
	}
	
	public CircularArrayQueue(int capacity) {
		this.data = new int[capacity];
		this.size = 0;
		this.maxSize = capacity;
		this.front = 0;
		this.rear = this.maxSize - 1;
	}
	
	public boolean isFull() {
		return this.size == this.maxSize;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public void enqueue(int data) throws Exception {
		if (isFull()) {
			throw new Exception("Queue is Full");
		}
		this.rear = (this.rear + 1) % this.maxSize;
		this.data[this.rear] = data;
		this.size++;
	}
	
	public int dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int poppedElement = this.front;
		this.front = (this.front + 1) % this.maxSize;
		this.size--;
		return poppedElement;
	}
	
	public int getFront() {
		return this.data[this.front];
	}
	
	public void display() {
		for (int i = this.front; i < this.front + this.size; i++) {
			System.out.print(this.data[i % this.maxSize] + ", ");
		}
		System.out.println("");
	}
	

}
