package core;

public class ChangeCase {

	public static void main(String[] args) {
		char A[] = {'W','E','L','C','O','M','E'};
		toUpperCase(A);
		System.out.println(A);
	}

	public static void toUpperCase(char[] str) {
		for (int i = 0; i < str.length; i++) {
			if (str[i] >= 65 && str[i] <= 90) {
				str[i] += 32;
			} else {
				str[i] -= 32;
			}
		}
	}
}
