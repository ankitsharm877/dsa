package bst.qus8;

import java.util.Stack;

import trees.Node;

public class ConstructFromPreorder {
	
	public Node construct(int pre[], int n) {
		Stack<Node> stack = new Stack<>();
		Node t;
		int i = 0;
		Node root = new Node(pre[i++]);
		root.left = root.right = null;
		Node p = root;
		while (i < n) {
			if (pre[i] < p.data) {
				t = new Node(pre[i++]);
				p.left = t;
				stack.push(p);
				p = t;
			} else {
				if (pre[i] > p.data && ((!stack.isEmpty() && pre[i] < stack.peek().data) || stack.isEmpty())) {
					t = new Node(pre[i++]);
					p.right = t;
					p = t;
				} else {
					p = stack.pop();
				}
			}
		}
		return root;
	}

}
