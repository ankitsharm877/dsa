package trees.qus19;

import trees.Node;

public class SumTree {

	public void toSumTree(Node root){
        sumTree(root);
   }
   public int sumTree(Node root) {
       if (root == null) {
           return 0;
       }
       int x = root.data;
       int left = sumTree(root.left);
       int right = sumTree(root.right);
       root.data = left + right;
       return x + left + right;
   }
   
}
