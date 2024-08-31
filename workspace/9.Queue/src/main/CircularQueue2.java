package main;

public class CircularQueue2 {
	
	int size;
    int front, rear;
    int items[];

    CircularQueue2(int size) {
    	this.size = size;
        front = -1;
        rear = -1;
        this.items = new int[this.size];
    }

    boolean isFull() {
        if (front == 0 && rear == this.size - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % this.size;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }
    
    int dequeue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % this.size;
            }
            return (element);
        }
    }

    void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Items -> ");
            for (i = front; i != rear; i = (i + 1) % this.size)
                System.out.print(items[i] + " ");
            System.out.println(items[i]);

        }
    }
}
