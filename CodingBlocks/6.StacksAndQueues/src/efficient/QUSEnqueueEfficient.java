package efficient;

import stacks.DynamicStack;
import stacks.StackUsingArrays;

public class QUSEnqueueEfficient {

	DynamicStack primary;
	DynamicStack secondary;
	
	public QUSEnqueueEfficient() throws Exception {
		this.primary = new DynamicStack();
		this.secondary = new DynamicStack();
	}
	
	public boolean isEmpty() {
		return this.primary.isEmpty();
	}
	
	public boolean size() {
		return this.primary.isEmpty();
	}
	
	public void enqueue(int data) throws Exception {
		this.primary.push(data);
	}
	
	public int dequeue() throws Exception {
		while (this.primary.size() != 1) {
			this.secondary.push(this.primary.pop());
		}
		int rv = this.primary.pop();
		while (!this.secondary.isEmpty()) {
			this.primary.push(this.secondary.pop());
		}
		return rv;
	}
	
	public int getFront() throws Exception {
		while (this.primary.size() != 1) {
			this.secondary.push(this.primary.pop());
		}
		int rv = this.primary.top();
		while (!this.secondary.isEmpty()) {
			this.primary.push(this.secondary.pop());
		}
		return rv;
	}
	
	public void display() throws Exception {
		reverseStack(this.primary, this.secondary, 0);
		this.primary.display();
		reverseStack(this.primary, this.secondary, 0);
	}
	
	public static void reverseStack(StackUsingArrays stack, StackUsingArrays helper, int index) throws Exception {
		// +ve base case
		if (stack.isEmpty()) {
			return;
		}
		int item = stack.pop();
		reverseStack(stack, helper, index + 1);
		helper.push(item);
		if (index == 0) {
			while (!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}
	}
}
