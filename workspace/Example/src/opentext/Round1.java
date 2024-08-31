package opentext;

import java.util.ArrayList;
import java.util.Stack;

public class Round1 {

	public static void main(String[] args) {
		// input = (){}[]
		//String str = "({}){}[]";
		//System.out.println(isBalanced(str));
		
		//user, admin
		
		//employee table name, age, designation 
		//name = 'James' or designation = 
				
		//findByNameAndAgeAndDesignation(name, age, designation)
		
		// palindrome partition
		
		//aba abba a
		
		//a b c
		
		String s = "abaabbaaba";
		System.out.println(palindromePartition(s));
	}
	
	public static ArrayList<String> palindromePartition(String str) {
		ArrayList<String> result = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			String palindrome = "";
			for (int j = i; j < str.length(); j++) {
				String s = str.substring(i, j);
				if (isPalindrome(s) && s.length() > palindrome.length()) {
					palindrome = s;
					
				}
			}
			result.add(palindrome);
		}
		return result;
	}
	
	public static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		return str.equals(sb.toString());
	}
	
//	@Transaction 
//	operation() {
//		1 - 100
//		
//		
//		flush();
//		101 - 200
//		
//		throw new Exception();
//	}
//	
	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<>();
		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else {
				if (!stack.isEmpty()) {
					char x = stack.pop();
					if (ch == ')' && x != '(') {
						return false;
					}
					if (ch == '}' && x != '{') {
						return false;
					}
					if (ch == ']' && x != '[') {
						return false;
					}
				} else {
					return false;
				}
			}
		}
		if (stack.isEmpty()) {			
			return true;
		} else {
			return false;
		}
	}
}


//url and click -> download file from url

//class Controller {
//	
//	@GetMapping("\download")
//	 public ResponseEntity<String> download() {
//		
////		HttpClient
////		HttpGet get = new HttpGet(url);
//		
//		//File file = new File("file.csv");
//		
//		
//		
//	}
//}


