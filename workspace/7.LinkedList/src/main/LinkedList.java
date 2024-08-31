package main;

import java.util.ArrayList;
import java.util.Stack;

public class LinkedList {

	Node head;

	class Node {
		int data;
		Node next;

		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
	}

	public void addFirst(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (this.head == null) {
			this.head = node;
		} else {
			node.next = this.head;
			this.head = node;
		}
	}

	public void addLast(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (this.head == null) {
			this.head = node;
		} else {
			Node temp = this.head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void add(int data, int pos) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (pos == 0) {
			node.next = this.head;
			this.head = node;
		} else {
			Node temp = this.head;
			for (int i = 0; i < pos - 1 && temp != null; i++) {
				temp = temp.next;
			}
			if (temp != null) {
				node.next = temp.next;
				temp.next = node;
			}
		}
	}

	public void addInSortedList(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		Node temp1 = this.head;
		if (temp1 == null) {
			this.head = node;
		} else {
			Node temp2 = null;
			while (temp1 != null && temp1.data < data) {
				temp2 = temp1;
				temp1 = temp1.next;
			}
			if (temp1 == this.head) {
				node.next = temp1;
				this.head = node;
			} else {
				node.next = temp1;
				temp2.next = node;
			}
		}
	}

	public int removeFirst() {
		Node temp = this.head;
		if (temp == null) {
			return -1;
		}
		this.head = this.head.next;
		return temp.data;
	}

	public int removeLast() {
		Node temp = this.head;
		if (temp == null) {
			return -1;
		} else {
			Node temp2 = null;
			while (temp.next != null) {
				temp2 = temp;
				temp = temp.next;
			}
			temp2.next = null;
			return temp.data;
		}
	}

	public int remove(int index) {
		Node temp = this.head;
		if (index < 1) {
			return -1;
		}
		if (index == 1) {
			this.head = this.head.next;
			return temp.data;
		} else {
			Node temp2 = null;
			for (int i = 0; i < index - 1 && temp != null; i++) {
				temp2 = temp;
				temp = temp.next;
			}
			if (temp != null) {
				temp2.next = temp.next;
				return temp.data;
			}
			return -1;
		}
	}

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			if (temp.next == null) {
				System.out.print(temp.data);
			} else {
				System.out.print(temp.data + " -> ");
			}
			temp = temp.next;
		}
		System.out.println("");
	}

	public void display(Node head) {
		if (head != null) {
			System.out.println(head.data);
			display(head.next);
		}
	}

	public void displayR(Node head) {
		if (head != null) {
			displayR(head.next);
			System.out.println(head.data);
		}
	}

	public int count() {
		int count = 0;
		Node temp = this.head;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public int count(Node head) {
//		if (head == null) {
//			return 0;
//		}
//		return count(head.next) + 1;
//		if (head == null) {
//			return 0;
//		}
//		return 1 + count(head.next);
		int x = 0;
		if (head != null) {
			x = count(head.next);
			return x + 1;
		}
		return x;
	}

	public int sum() {
		Node temp = this.head;
		int sum = 0;
		while (temp != null) {
			sum += temp.data;
			temp = temp.next;
		}
		return sum;
	}

	public int sum(Node head) {
		if (head == null) {
			return 0;
		}
		return sum(head.next) + head.data;
	}

	public int max() {
		int max = Integer.MIN_VALUE;
		Node temp = this.head;
		while (temp != null) {
			max = temp.data > max ? temp.data : max;
			temp = temp.next;
		}
		return max;
	}

	public int max(Node head) {
		if (head == null) {
			return Integer.MIN_VALUE;
		}
		int x = max(head.next);
		return head.data > x ? head.data : x;
	}

	public Node linearSearch(int key) {
		Node temp = this.head;
		while (temp != null) {
			if (key == temp.data) {
				return temp;
			}
			temp = temp.next;
		}
		return null;
	}

	public Node linearSearch(Node head, int key) {
		if (head == null) {
			return null;
		}
		if (head.data == key) {
			return head;
		}
		return linearSearch(head.next, key);
	}

	public Node linearSearchMoveToHead(int key) {
		Node temp = this.head;
		Node temp2 = null;
		while (temp != null) {
			if (key == temp.data) {
				temp2.next = temp.next;
				temp.next = this.head;
				this.head = temp;
				return this.head;
			}
			temp2 = temp;
			temp = temp.next;
		}
		return null;
	}

	public boolean isSorted() {
		int max = Integer.MIN_VALUE;
		Node temp = this.head;
		while (temp != null) {
			if (temp.data < max) {
				return false;
			}
			max = temp.data;
			temp = temp.next;
		}
		return true;
	}

	public void removeDuplicatesInSortedList() {
		if (this.head == null || this.head.next == null) {
			return;
		}
		Node temp1 = this.head;
		Node temp2 = this.head.next;
		while (temp2 != null) {
			if (temp1.data == temp2.data) {
				temp1.next = temp2.next;
				temp2 = temp2.next;
			} else {
				temp1 = temp2;
				temp2 = temp2.next;
			}
		}
	}

	public void reverse() {
		Node temp = this.head;
		int i = 0;
		ArrayList<Integer> list = new ArrayList<>();
		while (temp != null) {
			list.add(temp.data);
			temp = temp.next;
			i++;
		}
		temp = this.head;
		i--;
		while (temp != null) {
			temp.data = list.get(i--);
			temp = temp.next;
		}
	}

	public void reverseI() {
		Node p = this.head;
		Node q = null;
		Node r = null;
		while (p != null) {
			r = q;
			q = p;
			p = p.next;
			q.next = r;
		}
		this.head = q;
	}

	public void reverse(Node q, Node p) {
		if (p != null) {
			reverse(p, p.next);
			p.next = q;
		} else {
			this.head = q;
		}
	}

	public Node concatenating(Node list1, Node list2) {
		Node temp = list1;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = list2;
		return list1;
	}

	public Node mergeSortedList(Node first, Node second) {
		if (first == null && second == null) {
            return null;
        }
        if (first == null && second != null) {
            return second;
        } else if (first != null && second == null) {
            return first;
        }
        Node merge = null;
        Node last = null;
        if (first.data <= second.data) {
            merge = first;
            last = first;
            first = first.next;
            last.next = null;
        } else {
            merge = second;
            last = second;
            second = second.next;
            last.next = null;
        }
        while (first != null && second != null) {
            if (first.data <= second.data) {
                last.next = first;
                last = first;
                first = first.next;
                last.next = null;
            } else {
                last.next = second;
                last = second;
                second = second.next;
                last.next = null;
            }
        }
        if (first != null) {
            last.next = first;
        }
        if (second != null) {
            last.next = second;
        }
        return merge;
	}

	public boolean isLoop() {
		if (this.head == null || this.head.next == null) {
			return false;
		}
		Node p = this.head;
		Node q = this.head;
		do {
			p = p.next;
			q = q.next;
			q = q != null ? q.next : q;
		} while (p != null && q != null && p != q);
		if (p == q) {
			return true;
		} else {
			return false;
		}
	}

	public int middle() {
		Node p = this.head, q = this.head;
		while (q != null) {
			q = q.next;
			if (q != null) {
				q = q.next;
			}
			if (q != null) {
				p = p.next;
			}
		}
		return p.data;
	}

	public int intersection(Node p, Node q) {
		Stack<LinkedList.Node> stack1 = new Stack<>();
		Stack<LinkedList.Node> stack2 = new Stack<>();
		while (p != null) {
			stack1.push(p.next);
			p = p.next;
		}
		while (q != null) {
			stack2.push(q.next);
			q = q.next;
		}
		LinkedList.Node ans = null;
		while (!stack1.isEmpty() && !stack2.isEmpty()) {
			LinkedList.Node t1 = stack1.pop();
			LinkedList.Node t2 = stack2.pop();
			if (t1 == t2) {
				ans = t1;
			} else {
				return ans.data;
			}
		}
		return ans.data;
	}

}
