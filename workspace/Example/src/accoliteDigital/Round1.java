package accoliteDigital;

public class Round1 {

	public static void main(String[] args) {
		// 1. difference between promise and obeversable 
		String str = "adida";
		System.out.println(isPalindrome(str));
		
		//2.detect loop in linked list
	}
	
	public static boolean isPalindrome(String str) {
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
		    if (str.charAt(i) != str.charAt(j)) {
		        return false;
		    }
		    i++;
		    j--;
		}
		return true;
	}
}

class Node {
	int data;
	Node next;
	Node () {
		
	}
}