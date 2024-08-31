package stackAndQueue.qus9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		

	}
	
	public static long[] nextLargerElement(long[] arr, int n) { 
		Stack<Long> s = new Stack<>();              
        long ans[] = new long[n];
        for (int i = n - 1; i >= 0; i--) {     
            while (!s.empty() && s.peek() <= arr[i]) {
                s.pop();                              
            } 
            ans[i] = s.empty() ? -1 : s.peek();  
            s.push(arr[i]);                     
        } 
        return ans;
    }
	
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextGreater = new int[10001];
        Arrays.fill(nextGreater, -1);
        Stack<Integer> stack = new Stack<>();
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreater[stack.pop()] = num;
            }
            stack.push(num);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater[nums1[i]];
        }
        return result;
    }
	
	public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Stack<Integer> s = new Stack<>();              
        int ans[] = new int[list.size()]; 

        for (int i = list.size() - 1; i >= 0; i--) {     
            while (!s.empty() && s.peek() <= list.get(i)) {
                s.pop();                              
            } 
            ans[i] = s.empty() ? 0 : s.peek();  
            s.push(list.get(i));                     
        } 
        return ans;
    }
	
	
}
