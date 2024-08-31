package bst.qus3;

import trees.Node;

public class MinMaxValue {
	
	int minValue(Node root) {
		if (root.left == null) {
			return root.data;
		}
		return minValue(root.left);
	}
	
	int maxValue(Node root) {
		if (root.right == null) {
			return root.data;
		}
		return maxValue(root.right);
	}

}
