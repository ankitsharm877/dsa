package core;

public class Strings {

	public static void main(String[] args) {
		char A[] = {};
		char B[] = {'a', 'b', 'c', 'd'};
		char C[] = {65, 66, 67, 68, 69};
		System.out.println(A);
		System.out.println(B[0]);
		System.out.println(String.valueOf(C));
		
		String str = "welcome";
		String str1 = new String("Welcome");
		System.out.println(str);
		System.out.println(str1);	
  	}
	
	public static int length(char[] str) {
		return str.length;
	}	

}
