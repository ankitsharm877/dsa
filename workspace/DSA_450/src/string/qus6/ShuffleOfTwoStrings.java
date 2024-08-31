package string.qus6;

import java.util.Arrays;

public class ShuffleOfTwoStrings {

	public static void main(String[] args) {
		String first = "XY";
		String second = "12";
		String[] results = {"1XY2", "Y1X2", "Y21XX"};
		shuffleCheck(first, second, results);
	}
	
	public static void shuffleCheck(String first, String second, String[] results) {
		for (int i = 0; i < results.length; i++) {
			String result = results[i];
			String input = first + second;
			if (result.length() != input.length()) {
				System.out.println(result + " is a not valid shuffle of "+ first +" and " + second);
				return;
			} else {
				first = sortString(first);
				second = sortString(second);
				result = sortString(result);
				int x = 0, y = 0, z = 0;
				while (z < result.length()) {
					if (x < first.length() && first.charAt(x) == result.charAt(z)) {
						x++;
					} else if(y < second.length() && second.charAt(y) == result.charAt(z)) {
						y++;
					} else {
						System.out.println(result + " is a not valid shuffle of "+ first +" and " + second);
						return;
					}
					z++;
				}
				if(x < first.length() || y < second.length()) {
					System.out.println(result + " is a not valid shuffle of "+ first +" and " + second);
					return;
				}
			}
			System.out.println(result + " is a valid shuffle of "+ first +" and " + second);
		}
	}
	
	public static String sortString(String str) {
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		return String.valueOf(arr);
	}

}
