package queues;

public class DynamicQueue extends QueueUsingArrays {
	
	public DynamicQueue() {
		this(DEFAULT_CAPACITY);
	}
	
	DynamicQueue(int capacity) {
		super(capacity);
	}
	
	public void enqueue(int data) throws Exception {
		if (this.isFull()) {
			int[] arr = new int[2 * this.data.length];
			for (int i = this.front; i < this.size; i++) {
				arr[i] = this.data[i];
			}
			this.data = arr;
		}
		super.enqueue(data);
	}
}
