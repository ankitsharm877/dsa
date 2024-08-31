package trees.qus10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import trees.Node;

public class RightView {
	
	public ArrayList<Integer> leftView(Node root) {
		Queue<Node> q = new LinkedList<>();
		ArrayList<Integer> ans = new ArrayList<>();
		if (root == null)
			return ans;
		q.add(root);
		while (!q.isEmpty()) {
			int cnt = q.size();
			boolean flag = true;
			while (cnt > 0) {
				Node node = q.remove();
				if (flag)
					ans.add(node.data);
				if (node.right != null)
					q.add(node.right);
				if (node.left != null)
					q.add(node.left);
				flag = false;
				cnt--;
			}
		}
		return ans;
    }

}
