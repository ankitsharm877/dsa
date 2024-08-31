package queues;

public class QueueUsingArrays {

	protected int[] data;
	protected int size;
	protected int front;
	private int rear;
	
	public static final int DEFAULT_CAPACITY = 10;
	
	public QueueUsingArrays() {
		this(DEFAULT_CAPACITY);
	}
	
	public QueueUsingArrays(int capacity) {
		this.data = new int[capacity];
		this.size = 0;
		this.front = -1;
		this.rear = -1;
	}
	
	public boolean isFull() {
		return this.size == this.data.length;
	}
	
	public boolean isEmpty() {
		return this.front == -1;
	}
	
	public void enqueue(int data) throws Exception {
		if (isFull()) {
			throw new Exception("Queue is Full");
		}
		if (this.front == -1) {
			this.front = 0;
		}
		this.rear = this.rear + 1;
		this.data[this.rear] = data;
		this.size++;
	}
	
	public int dequeue() throws Exception {
		if (isEmpty()) {
			throw new Exception("Queue is Empty");
		}
		int poppedElement = this.data[this.front];
		if (this.front == this.rear) {
			this.front = -1;
			this.rear = -1;
		} else {
			this.front = this.front + 1;
		}
		this.size--;
		return poppedElement;
	}
	
	public int getFront() {
		return this.data[this.front];
	}
	
	public void display() {
		for (int i = this.front; i <= this.rear; i++) {
			System.out.print(this.data[i] + ", ");
		}
		System.out.println("");
	}
	
	public int size() {
		return this.size;
	}
}
