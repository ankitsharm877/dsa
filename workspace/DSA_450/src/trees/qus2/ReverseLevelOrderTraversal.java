package trees.qus2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

import trees.Node;

public class ReverseLevelOrderTraversal {

	
	public ArrayList<Integer> reverseLevelOrder(Node root) {
		ArrayList <Integer> list = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr== null) continue;
            list.add(curr.data);
            q.add(curr.right);
            q.add(curr.left);
        }
        Collections.reverse(list);
        return list;
    }
}
