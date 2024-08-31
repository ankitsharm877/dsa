package string.qus12;

public class Split1And0 {

	public static void main(String[] args) {
		String str = "0000000000";
		System.out.println(splitBinary(str));
	}
	
	public static int splitBinary(String str) {
		int count = 0;
		int bCount = 0;
		if (str.charAt(0) == '1') {
			return -1;
		}
		for (int i = 0; i < str.length(); i++) {
			if ("0".equals(str.charAt(i) + "")) {
				bCount++;
			} else if ("1".equals(str.charAt(i) + "")) {
				bCount--;
			}
			
			if (bCount == 0) {
				count++;
			} 
		}
		if (count > 0) {
			return count;
		} else {
			return -1;
		}
	}
}
