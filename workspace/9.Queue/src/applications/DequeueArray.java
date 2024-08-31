package applications;

public class DequeueArray {
	int[] dequeue;
	int front;
	int rear;
	int size;
	
	public DequeueArray(int size) {
		this.size = size;
		this.dequeue = new int[this.size];
		this.front = -1;
		this.rear = -1;
	}
	
	public void insertFront(int value) {
		if (this.front == -1) {
			System.out.println("Queue is full");
		} else {
			this.dequeue[this.front] = value;
			this.front--;
		}
        
    }
    
    public void insertLast(int value) {
        if (isFull()) {
        	System.out.println("Queue is full");
        } else {
        	this.rear++;
        	this.dequeue[this.rear] = value;
        }
        
    }
    
    public int deleteFront() {
        if (isEmpty()) {
        	System.out.println("Queue is empty");
        	return -1;
        } else {
        	this.front++;
        	int x = this.dequeue[this.front];
        	return x;
        }
    }
    
    public int deleteLast() {
        if (this.rear == -1) {
        	System.out.println("Queue is empty");
        	return -1;
        } else {
        	int x = this.dequeue[this.rear];
        	this.rear--;
        	return x;
        }
    }
    
    public int getFront() {
    	if (isEmpty()) {
        	System.out.println("Queue is empty");
        	return -1;
        } else {
        	return this.dequeue[this.front + 1];
        }
    }
    
    public int getRear() {
    	if (this.rear == -1) {
        	System.out.println("Queue is empty");
        	return -1;
        } else {
        	return this.dequeue[this.rear];
        }
    }
    
    public boolean isEmpty() {
    	if (this.front == this.rear) {
    		return true;
    	}
        return false;
    }
    
    public boolean isFull() {
        if (this.rear == this.size - 1) {
        	return true;
        }
        return false;
    }

}
