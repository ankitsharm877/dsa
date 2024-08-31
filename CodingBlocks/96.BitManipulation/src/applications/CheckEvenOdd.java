package applications;

public class CheckEvenOdd {

	public static void main(String[] args) {
		System.out.println(checkEven(2));
		System.out.println(checkEven(3));
	}
	
	public static boolean checkEven(int n) {
		return (n & 1) == 0 ? true : false;
	}

}
