package get_;

import java.util.ArrayList;

public class GetPermutations {

	public static void main(String[] args) {
		System.out.println(getPermutations("abc"));
	}
	
	public static ArrayList<String> getPermutations(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rr = getPermutations(ros);
		
		for (String rrs : rr) {
			for (int i = 0; i <= rrs.length(); i++) {
				String val = rrs.substring(0, i) +  ch + rrs.substring(i);
				mr.add(val);
			}
		}
		return mr;
	}
}
