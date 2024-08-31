package test;

public class CharacterDemo {

	public static void main(String[] args) {
		String str = "asd12";
		for (char c : str.toCharArray()) {
			if (Character.isDigit(c)) {
				System.out.println(c);
			}
			if (Character.isAlphabetic(c)) {
				System.out.println(c);
			}
		}
		System.out.println();
	}

}
