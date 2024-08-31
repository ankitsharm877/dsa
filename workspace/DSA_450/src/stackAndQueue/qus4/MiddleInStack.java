package stackAndQueue.qus4;

public class MiddleInStack {
	
	Node top;
	Node mid;
	int size;
	
	class Node {
		int data;
		Node next;
		Node prev;
		Node (int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	
	public MiddleInStack(int size) {
		this.size = size;
	}
	
	public void push(int data) {
		Node node = new Node(data);
		if (this.top == null) {
			top = node;
			mid = node;
			this.size++;
			return;
		}
		this.top.next = node;
		node.prev = this.top;
		
		this.top = this.top.next;
		if (this.size % 2 != 0) {
			mid = mid.next;
		}
		this.size++;
	}
	
	public int pop() {
		int data = -1;
		if (this.size == 0) {
			System.out.println("stack is empty");
			return data;
		}
		if (this.size != 0) {
			data = top.data;
			if (this.size == 1) {
				this.top = null;
				this.mid = null;
			} else {
				this.top = this.top.prev;
				this.top.next = null;
				if (this.size % 2 == 0) {
					mid = mid.prev;
				}
			}
			this.size--;
		}
		return data;
	}
	
	public int findMiddle() {
		if (this.size == 0) {
			System.out.println("stack is empty");
			return -1;
		}
		return mid.data;	
	}
	
	public void deleteMiddle() {
		if (this.size != 0) {
            if (size == 1) {
                this.top = null;
                mid = null;
            }
            else if (size == 2) {
                this.top = this.top.prev;
                mid = mid.prev;
                this.top.next = null;
            }
            else {
                this.mid.next.prev = this.mid.prev;
                this.mid.prev.next = this.mid.next;
                if (this.size % 2 == 0) {
                    this.mid = this.mid.prev;
                }
                else {
                    this.mid = this.mid.next;
                }
            }
            size--;
        }
	}
}
