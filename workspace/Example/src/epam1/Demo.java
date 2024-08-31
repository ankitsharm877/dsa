package epam1;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
//		Given an array of strings strs , group the anagrams together. You can return the answer in any order.
//				An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
//				typically using all the original letters exactly once.
		
//		Input: strs = ["Eat","Tea","Tan","ate","nat","bat"]
//		Output: [["bat"],["nat","Tan"],["ate","Eat","Tea"]]
		
//		nat, atn, tna, nat
//		tan, ant, nta, tan
		String[] strs = {"Eat","Tea","Tan","ate","nat","bat"};
		group(strs);
	}
	
	public static void group(String[] strs) {
		ArrayList<ArrayList<String>> ans = new ArrayList<>();
		for (int i = 0; i < strs.length; i++) { 
			
		}
		System.out.println(ans);
	}
}


