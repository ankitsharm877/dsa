package trees.qus1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import trees.Node;

public class LevelOrderTraversal {

	static ArrayList<Integer> levelOrder(Node root) {
		ArrayList<Integer> list = new ArrayList<>();
		if (root == null) {
			return list;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		list.add(root.data);
		while (!q.isEmpty()) {
			Node p = q.poll();
			if (p.left != null) {
				list.add(p.left.data);
				q.add(p.left);
			}
			if (p.right != null) {
				list.add(p.right.data);
				q.add(p.right);
			}
		}
		return list;
	}
	
	public ArrayList<Integer> levelOrderI(Node root) {
		Queue<Node> q = new LinkedList<>();
		ArrayList<Integer> ans = new ArrayList<>();
		if (root == null)
			return ans;
		q.add(root);
		while (!q.isEmpty()) {
			int cnt = q.size();
			while (cnt > 0) {
				Node node = q.remove();
				ans.add(node.data);
				if (node.left != null)
					q.add(node.left);
				if (node.right != null)
					q.add(node.right);
				cnt--;
			}
		}
		return ans;
	}
	
}
