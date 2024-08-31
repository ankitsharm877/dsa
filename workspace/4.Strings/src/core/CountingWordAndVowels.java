package core;

public class CountingWordAndVowels {

	public static void main(String[] args) {
		String A = "How are you ?";
		int vcount = 0, ccount = 0;
		
		for (char c: A.toCharArray()) {
			if ("aeiouAEIOU".indexOf(c) != -1) {
				vcount++;
			} else {
				ccount++;
			}
		}
		System.out.println(vcount + "," + ccount);
		
		int words = 1;
		for (char c : A.toCharArray()) {
			if (c == ' ') {
				words++;
			}
		}
		System.out.println(words);
	}

}
