package sortingAndSearching.qus5;

public class MiddleOfThree {

	public static void main(String[] args) {
		int A = 162, B = 934, C = 200;
		System.out.println(middle(A, B, C));
	}

	static int middle(int A, int B, int C){
		if ((A < B && B < C) || (C < B && B < A)) {
			return B;
		} else if ((A < C && C < B) || (B < C && C < A)) {
			return C;
		} else {
			return A;
		}
		
	}
}
