package microsoft1;

import java.util.HashMap;
import java.util.Map;

public class Round2 {

	public static void main(String [] args) {
        // you can write to stdout for debugging purposes, e.g.
        //System.out.println("This is a debug message");
        checkEven("NAVAN");
        checkEven("NAAN");
        checkEven("ababcdcd");
        checkEven("abaabcdcd");
    }

    public static void checkEven(String str) {
        if (str.isEmpty()) {
            System.out.println("EVEN");
            return;
        }
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char ch : str.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        
        int count = -1;
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (count == -1) {
                count = entry.getValue();
            } else {
                if (count != entry.getValue()) {
                    System.out.println("NOT EVEN");
                    return;
                }
            }
        }
        System.out.println("EVEN");
    }
}