package application;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String str = "cbabcadbd";
		firstNonRepeatingCharacter(str);
	}

	public static void firstNonRepeatingCharacter(String str) {
		HashMap<Character, Integer> hm = new HashMap<>();
		Queue<Character> queue = new ArrayDeque<>();
		
		for (char ch : str.toCharArray()) {
			queue.add(ch);
			if (hm.containsKey(ch)) {
				int x = hm.get(ch);
				x++;
				hm.put(ch, x);
			} else {
				hm.put(ch, 1);
			}
			
			while (!queue.isEmpty()) {
				char fc = queue.peek();
				if (hm.get(fc) == 1) {
					System.out.println(fc);
					break;
				} else {
					queue.poll();
				}
			}
			
			if (queue.isEmpty()) {
				System.out.println("-1");
			}
			
		}
	}
}
