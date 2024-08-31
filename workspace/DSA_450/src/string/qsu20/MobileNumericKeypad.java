package string.qsu20;

public class MobileNumericKeypad {

	public static void main(String[] args) {
		//String str = "GEEKSFORGEEKS";
		String str = "HELLO WORLD";
		System.out.println(mobileNumericKeypad(str));
	}
	
	public static String mobileNumericKeypad(String str) {
		String[] mobileKeypad = {"2","22", "222", "3","33","333","4","44","444",
				"5","55","555","6","66","666","7","77","777","7777",
				"8","88","888","9","99","999","9999"};
		String output = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				output += "0";
			} else {
				int k = str.charAt(i) - 65;
				output += mobileKeypad[k];
			}
		}
		return output;
	}

}
