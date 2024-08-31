package test;

import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		String s = "$problem$";
		String[] a = s.split("\\$");
		for (String v : a) {
			System.out.println(v);
		}
		Stack<Integer> st = new Stack<>();
	}
}
