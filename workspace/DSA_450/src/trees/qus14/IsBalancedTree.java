package trees.qus14;

import trees.Node;

public class IsBalancedTree {
	
	public boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }
        boolean b1 = isBalanced(root.left);
        boolean b2 = isBalanced(root.right);
        int x = height(root.left);
        int y = height(root.right);
        if (!b1 || !b2 ) {
            return false;
        } else if (Math.abs(x - y) > 1) {
            return false;
        }
        return true;
    }

    public int height(Node node) {
		int x = 0, y = 0;
		if (node == null) {
			return 0;
		}
		x = height(node.left);
		y = height(node.right);
		return x > y ? x + 1 : y + 1;
	}
    
    public boolean isBalancedI(Node root) {
        if(root == null) return true;
        return heightI(root) != -1;
    }

    public int heightI(Node node) {
		if(node == null) return 0;
        int left = heightI(node.left);
        int right = heightI(node.right);
        int bf = Math.abs(left - right);

        if(bf > 1 || left == -1 || right == -1) return -1;
        return 1 + Math.max(left, right);
	}

}
