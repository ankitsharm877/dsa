package stackAndQueue.qus3;

public class TwoStacks {
	int[] stack;
	int top1 = -1;
	int top2 = -1;
	int size = 100;

	TwoStacks() {
		this.stack = new int[this.size];
		this.top2 = this.size / 2;
	}

	void push1(int x) {
		if ((this.top1 + 1) == (this.size / 2) - 1) {
			System.out.println("Stack is full");
		} else {
			this.stack[++this.top1] = x;
		}
	}
	
	void push2(int x) {
		if ((this.top2 + 1) == this.size - 1) {
			System.out.println("Stack is full");
		} else {
			this.stack[++this.top2] = x;
		}
	}

	int pop1() {
		if (this.top1 == -1) {
			return -1;
		} else {
			return this.stack[this.top1--];
		}
	}

	int pop2() {
		if (this.top2 == this.size / 2) {
			return -1;
		} else {
			return this.stack[this.top2--];
		}
	}
}
