package linkedlist;

import java.util.LinkedHashMap;

public class LinkedList {

	Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	
	// qus 1
	public void printList() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("");
	}
	
	// qus 2
	public void reverseListIterative() {
		if (this.head == null || this.head.next == null) {
			return;
		}
		Node prev = this.head;
		Node curr = this.head.next;
		prev.next = null;
		
		while (curr != null) {
			Node temp = curr;
			curr = curr.next;
			temp.next = prev; 
			prev = temp;
		}
		this.head = prev;
	}
	
	public Node reverseListRecursion(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node rest = reverseListRecursion(head.next);
		head.next.next = head;
		head.next = null;
		return rest;
	}
	
	//qus 3
	public boolean detectLoop(Node head){
        if (head == null || head.next == null) {
            return false;
        }
        Node p = head;
        Node q = head;
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
	
	//qus 3
	public boolean detectLoop() {
		if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
	}
	
	//qus 4 & 5
	public static void removeLoop(Node head) {
		if (head == null) {
			return;
		}
		Node slow = head;
		Node fast = head;

		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				slow = head;
				while (slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				Node temp = slow;
				while (temp.next != slow) {
					temp = temp.next;
				}
				temp.next = null;
			}
		}
	}
	
	//qus 6
	public Node removeDuplicates(Node head) {
	    if (head == null || head.next == null) {
			return head;
		}
		Node temp1 = head;
		Node temp2 = head.next;
		while (temp2 != null) {
			if (temp1.data == temp2.data) {
				temp1.next = temp2.next;
				temp2 = temp2.next;
			} else {
				temp1 = temp2;
				temp2 = temp2.next;
			}
		}
		return head;
    }

	// qus 7
	public Node removeDuplicatesInUnSorted() {
		if (this.head == null || this.head.next == null) {
			return head;
		}
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
		Node p = head;
		Node q = null;
		while (p != null) {
			if (hm.containsKey(p.data)) {
				q.next = p.next;
				p.next = null;
				p = q.next;
			} else {
				hm.put(p.data, 1);
				q = p;
				p = p.next;
			}
		}
		return this.head;
	}
	
	// qus 8
	public void moveLastNodetoFront() {
		if (this.head == null || this.head == null) {
			return;
		}
		Node p = this.head;
		Node q = null;
		while (p.next != null) {
			q = p;
			p = p.next;
		}
		q.next = null;
		p.next = head;
		this.head = p;
	}
	
	//qus9
	int x = 0;
	public void addOne(Node head) {
		addOnetoLastNode(head);
		System.out.println(this.x);
		if (this.x > 0) {
			Node t = new Node(this.x);
			t.next = head;
			this.head = t;
		}
	}
	public void addOnetoLastNode(Node head) { 
		if (head.next ==  null) {
			int y = head.data + 1;
			if (y >= 10) {
				 head.data = y % 10; // 0
				 this.x = y / 10; // 1
			} else {
				head.data = y;
			}
			return;
		}
		addOnetoLastNode(head.next);
		int y = head.data + x; // 7
		if (y >= 10) {
			 head.data = y % 10;
			 this.x = y / 10;
		} else {
			this.x = 0;
			head.data = y;
		}
    }
	
	// qus 10
	public Node addTwoLists(Node first, Node second){
		Node l1 = reverseListRecursion(first);
        Node l2 = reverseListRecursion(second);
        Node l3 = null;
        Node p = null;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int x = l1.data + l2.data + carry;
            carry = x / 10;
            Node node = new Node(x % 10);
            if (l3 == null) {
                l3 = node;
                p = node;
            } else {   
                p.next = node;
                p = node;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int x = l1.data + carry;
            carry = x / 10;
            Node node = new Node(x % 10); 
            p.next = node;
            p = node;
            l1 = l1.next;
        }
        while (l2 != null) {
            int x = l2.data + carry;
            carry = x / 10;
            Node node = new Node(x % 10); 
            p.next = node;
            p = node;
            l2 = l2.next;
        }
        if (carry > 0) {
            Node node = new Node(carry); 
            p.next = node;
        }
        return reverseListRecursion(l3);
    }
	
	//qus 11
	public  Node findIntersection(Node head1, Node head2) {
        Node newHead = null;
        Node t = null;
        while (head1 != null && head2 != null) {
        	if (head1.data == head2.data) {
        		if (newHead == null) {
        			Node node = new Node(head1.data);
        			node.next = null;
        			t = node;
        			newHead = node;
        		} else {
        			Node node = new Node(head1.data);
        			node.next = null;
        			t.next = node;
        			t = node;
        		}
        		head1 = head1.next;
        		head2 = head2.next;
        	} else if (head1.data < head2.data) {
        		head1 = head1.next;
        	} else {
        		head2 = head2.next;
        	}
        }
        return newHead;
    }
	
	// qus 12
	int intersectPoint(Node head1, Node head2) {
	   Node first = head1, second = head2;
         
         while (first != null || second != null) {
             if (first == null) first = head2;
             
             if (second == null) second = head1;
             
             if (first == second) {
                 return first == null ? -1 : first.data;
             }
             
             first = first.next;
             second = second.next;
         }
         return -1;
	}
	
	// qus 15
	public Node middleNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // Node slow = head;
        // Node fast = head;
        // while (fast.next != null && fast.next.next != null) {
        //     slow = slow.next;
        //     fast = fast.next.next;
        // }
        // if (fast.next != null) {
        //     return slow.next;
        // }
        // return slow;
        Node p = head, q = head;
        while (q != null) {
            q = q.next;
            if (q != null) p = p.next;
            if (q != null) q = q.next;
        }
        return p;
    }
	
	// qus 16
	boolean isCircular(Node head) {
        Node p = head;
        do {
            p = p.next;
        } while (p != null && p != head);
        if (p == null) {
            return false;
        } else {
            return true;
        }
    }
	
	// qus 29
	public Node segregate(Node head){
        // add your code here
        int[] count = new int[3];
        Node p = head;
        while(p != null) {
            count[p.data]++;
            p = p.next;
        }
        p = head;
        int i = 0;
        while (p != null) {
            if (count[i] == 0) {
               i++;
            } else {
                p.data = i;
                count[i]--;
                p = p.next;
            }
        }
        return head;
    }
	
	//qus 18
	boolean isPalindrome() {
		if (head == null || head.next == null) {
			return true;
		}
		Node start = head;
		Node mid = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			mid = mid.next;
			fast = fast.next.next;
		}

		Node prev = null;
		Node next = null;

		while (mid != null) {
			next = mid.next;
			mid.next = prev;
			prev = mid;
			mid = next;
		}

		while (prev != null) {

			if (prev.data != start.data) {
				return false;
			}
			prev = prev.next;
			start = start.next;
		}
		return true;
	}
}
