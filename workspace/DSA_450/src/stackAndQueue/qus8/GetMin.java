package stackAndQueue.qus8;

import java.util.Stack;

public class GetMin {
	
	public void push(int a,Stack<Integer> s) {
	    s.push(a);
	}
	public int pop(Stack<Integer> s) {
        return s.pop();
	}
	public int min(Stack<Integer> s){
        int min = Integer.MAX_VALUE;
        for (Integer x : s) {
            if (x < min) {
                min = x;
            }
        }
        return min;
	}
	public boolean isFull(Stack<Integer>s, int n){
          return s.size() == n;
	}
	public boolean isEmpty(Stack<Integer>s) {
          return s.isEmpty();
	}

}
