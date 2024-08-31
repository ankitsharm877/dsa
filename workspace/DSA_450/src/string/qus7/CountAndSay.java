package string.qus7;

import java.util.HashMap;
import java.util.Map.Entry;

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String countAndSay(int n) {
        String res = "";
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                res = "1";
            } else {
                res = say(res);
            }
        }
        return res;
    }

    public String say(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length();i++) {
            hm.put(str.charAt(i), hm.getOrDefault(str.charAt(i), 0) + 1);
        }
        String res = "";
        hm.forEach((key, value) -> {
        	
        });
        return res;
    }

}
