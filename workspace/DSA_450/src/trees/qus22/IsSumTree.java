package trees.qus22;

import trees.Node;

public class IsSumTree {

	boolean res;
	boolean isSumTree(Node root) {
	    res = true;
	    solve(root);
        return res;
	}
	
	private int solve(Node node){
	    if(node == null) return 0;
	    
	    if(node.left == null && node.right == null) return node.data;
	    
	    int l = solve(node.left);
	    int r = solve(node.right);
	    
	    if(l+r != node.data){
	        res = false;
	    }
	    
	    return l+r+node.data;
	}
}
