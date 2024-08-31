package stackAndQueue.qus20;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
	
	Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    void push(int a) {
    	if (q2.isEmpty()) {
            q1.add(a);
       } else {
            q2.add(a);
       }
    }

    int pop() {
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
}
