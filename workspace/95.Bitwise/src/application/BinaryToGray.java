package application;

import java.util.ArrayList;

public class BinaryToGray {

	public static void main(String[] args) {
		//Binary Number to gray Code
		System.out.println(greyCode(2));
		//Gray Code to Binary Number
		System.out.println(grayCodeToBinaryNumber(2));
	}
	
	public static ArrayList<Integer> greyCode(int n) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < (1 << n); i++) {
			list.add(i ^ (i >> 1));
		}
		return list;
	}
	
	public static int grayCodeToBinaryNumber(int g) {
		int n = 0;
		while (g > 0) {
			n = n ^ g;
			g = g >> 1;
		}
		return n;
	}

}
