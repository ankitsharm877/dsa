package applications;

public class CircularDeque {
	int[] Q;
	int front;
	int rear;
	int size;
	
	public CircularDeque(int size) {
		this.size = size;
		this.Q = new int[this.size];
		this.front = -1;
		this.rear = 0;
	}
	
	public boolean isEmpty() {
		if (this.front == -1) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if (this.front == 0 && this.rear == this.size - 1) {
			return true;
		}
		if (this.front == this.rear + 1) {
			return true;
		}
		return false;
	}
	
	public void insertFront(int data) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		}
		if (this.front == -1) {
			this.front = 0;
			this.rear = 0;
		} else if (this.front == 0) {
			this.front = this.size - 1;
		} else {
			this.front = this.front - 1;
		}
		this.Q[this.front] = data;
	}
	
	public void insertRear(int data) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		}
		if (this.front == -1) {
			this.front = 0;
			this.rear = 0;
		} else if (this.rear == this.size - 1) {
			this.rear = 0;
		} else {
			this.rear = this.rear + 1;
		}
		this.Q[this.rear] = data;
	}
	
	public void deleteFront() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		if (this.front == this.rear) {
			this.front = -1;
			this.rear = -1;
		} else if (this.front == this.size - 1) {
			this.front = 0;
		} else {
			this.front = this.front + 1;
		}
	}
	
	public void deleteRear() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		if (this.front == this.rear) {
			this.front = -1;
			this.rear = -1;
		} else if (this.rear == 0) {
			this.rear = this.size - 1;
		} else {
			this.rear = this.rear + 1;
		}
	}
	
	public int getFront() {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return -1;
        }
        return this.Q[this.front];
    }
 
    public int getRear() {
        if (isEmpty() || rear < 0) {
            System.out.println(" Underflow\n");
            return -1;
        }
        return this.Q[this.rear];
    }


}
