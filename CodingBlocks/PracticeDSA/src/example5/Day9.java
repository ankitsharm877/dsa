package example5;

import java.util.ArrayList;

public class Day9 {

	public static void main(String[] args) {
		printPermutations("abc", "");
		System.out.println(getPermutations("abc"));
		printSS("abc", "");
		System.out.println(getSS("abc"));
	}
	
	public static void printPermutations(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			printPermutations(ros, ans + ch);
		}
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
				String val = rrs.substring(0, i) + ch + rrs.substring(i);
				mr.add(val);
			}
		}
		return mr;
	}
	
	public static void printSS(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		printSS(ros, ans);
		printSS(ros, ans + ch);
	}

	public static ArrayList<String> getSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rr = getSS(ros);
		
		for (String rrs : rr) {
			mr.add(rrs);
			mr.add(cc + rrs);
		}
		return mr;
	}

}
