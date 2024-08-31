package main;

public class JavaMethods {

	public static void main(String[] args) {
		// count no of bits
		System.out.println(Integer.bitCount(4));
		System.out.println(Integer.bitCount(7));
		
		// convert integer to binary
		System.out.println(Integer.toBinaryString(5));
		System.out.println(Integer.toBinaryString(7));
		
		//convert binary to integer
		System.out.println(Integer.parseInt("11100101", 2));
		System.out.println(Integer.parseInt("111", 2));
	}

}
