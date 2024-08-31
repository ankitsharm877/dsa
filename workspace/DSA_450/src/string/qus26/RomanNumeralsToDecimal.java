package string.qus26;

import java.util.HashMap;

public class RomanNumeralsToDecimal {

	public static void main(String[] args) {
		String str = "XIX";
		System.out.println(romanToDecimal(str));

	}
	
	public static int romanToDecimal(String str) {
		int output = 0;
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("I", 1);
		hm.put("V", 5);
		hm.put("X", 10);
		hm.put("L", 50);
		hm.put("C", 100);
		hm.put("D", 500);
		hm.put("M", 1000);
		int prev = 0;
		if (str.length() == 1) {
			output = hm.get(str);
		} else {
			int res = 0;
			for (int i = 0; i < str.length(); i++) {
				int temp = hm.get(str.charAt(i) + "");
				if (prev < temp) {
					int k = temp - prev;
					res = res - prev;
					res += k;
				} else {
					res += temp;
				}
				prev = hm.get(str.charAt(i) + "");
			}
			output = res;
			
		}
		return output;
	}

}
