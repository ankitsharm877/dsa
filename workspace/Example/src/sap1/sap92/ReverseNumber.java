package sap1.sap92;

public class ReverseNumber {

	public static void main(String[] args) {
		int a = 123;
		int b = 0;
		while (a != 0) {
			int x = a % 10; // 2
			a = a / 10; // 1
			b = b * 10 + x; //30 + 2 = 32
		}
		System.out.println(b);
	}

}
