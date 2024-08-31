package rumango;

import java.util.Arrays;
import java.util.Stack;

public class Round2 {

	public static void main(String[] args) {
		// xml msg 
		String str = "<A><Acc><AMT>10</AMT><DATE>2024-07-22</DATE><LIAB>12</LIAB test></Acc></A>";
		String out = ""; // <A
		String[] arr = str.split(">");
		Stack<String> stack = new Stack<>();
		for (String s : arr) {
			if (s.contains("/")) {
				String st = stack.peek();
				String et = s.substring(s.lastIndexOf("<") + 2);
				String ros = s.substring(0, s.lastIndexOf("<"));
				//System.out.println(ros+"</" +(st.substring(1)) + ">");
				stack.push(ros+"</" +(st.substring(1)) + ">");
				//System.out.println((st.substring(1)) + "," + et);
			} else {
				stack.push(s);
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(stack);
	}
}

