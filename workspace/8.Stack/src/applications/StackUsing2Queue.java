package applications;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queue {
	Queue<Integer> q1 = null;
    Queue<Integer> q2 = null;

    public StackUsing2Queue() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
       if (q2.isEmpty()) {
            q1.add(x);
       } else {
            q2.add(x);
       }
    }
    
    public int pop() {
        while (!q1.isEmpty()) {
            int x = q1.remove();
            if (q1.isEmpty()) {
                return x;
            } else {
                q2.add(x);
            }
        }
        while (!q2.isEmpty()) {
            int x = q2.remove();
            if (q2.isEmpty()) {
                return x;
            } else {
                q1.add(x);
            }
        }
        return -1;
    }
    
    public int top() {
        while (!q1.isEmpty()) {
            int x = q1.remove();
            q2.add(x);
            if (q1.isEmpty()) {
                return x;
            }
        }
        while (!q2.isEmpty()) {
            int x = q2.remove();
            q1.add(x);
            if (q2.isEmpty()) {
                return x;
            }
        }
        return -1;
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}
