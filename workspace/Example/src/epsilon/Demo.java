package epsilon;

import java.util.Stack;

public class Demo {

	public static void main(String[] args) {
//		Input :  AabbcdefghijAaCbB
//		Ouput : 22cdefghij2C2
		
		String str = "AabbcdefFghijAaCbBB";
		String out = "";
		Stack<Character> stack = new Stack<>();
		char prev = '\0';
		for (char ch : str.toCharArray()) { // O(N)
			if (stack.isEmpty()) {
				stack.add(ch);
			} else {
				char c1 = stack.peek();
				if ((c1 + "").toLowerCase().equals((ch + "").toLowerCase())) {
					stack.pop();
					stack.push('2');
				} else if (Character.isDigit(c1) && (prev + "").toLowerCase().equals((ch + "").toLowerCase()) ) {
					char c2 = stack.pop();
					int val = Integer.parseInt((c2 + "")) + 1;
					stack.push((val + "").charAt(0));
				} else {
					stack.push(ch);
				}
			}
			prev = ch;
		}
		
		for (char ch : stack) { // O(N)
			out += ch;
		}
//		char prev = str.charAt(0); // A
//		int count = 1; // 2
//		for (int i = 1; i < str.length(); i++) { 
//			char ch = str.charAt(i); // a
//			if (!out.isEmpty() && Character.isDigit(out.charAt(out.length() - 1))) {
//				char c = out.charAt(out.length() - 1);
//				out = out.substring(0, out.length() - 2) + (Integer.parseInt(c + "") + "");
//			} else if (!out.isEmpty() && (out.charAt(out.length() - 1) + "").toLowerCase() == (ch + "").toLowerCase()) {
//				out += '2';
//			} else {
//				out += ch;				
//			}
//			prev = ch; // a
//		}
//		str = str.toLowerCase();
//		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
//		for (char ch : str.toCharArray()) {
//			
//			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
//		}
//		System.out.println(hm);
//		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
//			if (entry.getValue() == 1) {
//				out += entry.getKey();
//			} else {
//				out += entry.getValue();
//			}
//		}
		System.out.println(out);
	}


}
