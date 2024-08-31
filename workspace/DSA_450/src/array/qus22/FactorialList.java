package array.qus22;

import java.util.ArrayList;
import java.util.Collections;

public class FactorialList {

	public static void main(String[] args) {
		int N = 10; // N= 5, 120 and N=10, 3628800
		ArrayList<Integer> list = factorial(N);
		System.out.println(list);
		
		//5! = 1*2*3*4*5 = 120 , 4*5=20, 3 * 20 = 60,
	}
	
	static ArrayList<Integer> factorial(int N) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		for (int i = 2; i <= N; i++) {
			multiply(a, i);
		}
		Collections.reverse(a);
		return a;
	}

	static void multiply(ArrayList<Integer> a, int n) {
		int c = 0;
		for (int i = 0; i < a.size(); i++) {
			int p = a.get(i) * n + c;
			a.set(i, p % 10);
			c = p / 10;
		}
		while (c != 0) {
			a.add(c % 10);
			c /= 10;
		}
	}

}
