package bst.qus4;

import trees.Node;

public class FindPreSuc {
	
	Node pre = null;
	Node suc = null;
	public void find(Node root, int key) {
		pre = suc = null;
        Node node = root;
        while(node != null){
            if(node.data <= key){
                node = node.right;
            } else {
                suc = node;
                node = node.left;
            }
        }
        node = root;
        while(node != null){
            if(key > node.data){
                pre = node;
                node = node.right;
            } else {
                node = node.left;
            }
        }
	}

}
