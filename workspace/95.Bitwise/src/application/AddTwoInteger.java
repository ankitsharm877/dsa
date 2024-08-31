package application;

public class AddTwoInteger {

	public static void main(String[] args) {
		int a = 20; // 10100
		int b = 30; // 11110 , 11100ß
		int c = add(a, b); //   10010
		System.out.println(c);
	}
	
	public static int add(int x, int y) {
		while (y != 0) {
            int carry = x & y;
            x = x ^ y; 
            y = carry << 1;
        }
        return x;
	}
}
