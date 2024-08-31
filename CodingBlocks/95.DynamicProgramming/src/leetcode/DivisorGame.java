package leetcode;

public class DivisorGame {

	public static void main(String[] args) {
		int n = 10000;
		System.out.println(divisorGame(n));
		System.out.println(divisorGameBU(n));
	}

	public static boolean divisorGame(int n) {
		if (n == 1) {
            return false;
        }
        boolean nm1 = divisorGame(n - 1);
        if (nm1) {
            return false;
        } else {
            return true;
        }
	}
	
	public static boolean divisorGameBU(int n) {
		if (n == 1) {
            return false;
        }
        return n % 2 == 0;
	}

}
