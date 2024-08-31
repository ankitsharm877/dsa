package sortingAndSearching.qus4;

public class CountPerfectSquared {

	public static void main(String[] args) {
		int N = 15;
		System.out.println(countSquares(N));
	}
	
	static int countSquares(int N) {
		return (int)(Math.sqrt(N-1));
	}
}
