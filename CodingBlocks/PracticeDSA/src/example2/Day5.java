package example2;

public class Day5 {

	public static void main(String[] args) {
		printD(5);
		System.out.println();
		printI(5);
		System.out.println();
		printDI(5);
		System.out.println();
		printDISkip(5);

	}
	
	public static void printD(int n) {
		if (n == 0) {
			return;
		}
		System.out.print(n + ",");
		printD(n - 1);
	}
	
	public static void printI(int n) {
		if (n == 0) {
			return;
		}
		printI(n - 1);
		System.out.print(n + ",");
	}
	
	public static void printDI(int n) {
		if (n == 0) {
			return;
		}
		System.out.print(n + ",");
		printDI(n - 1);
		System.out.print(n + ",");
	}
	
	public static void printDISkip(int n) {
		if (n == 0) {
			return;
		}
		if (n % 2 == 1) {
			System.out.print(n + ",");
		}
		printDISkip(n - 1);
		if (n % 2 == 0) {
			System.out.print(n + ",");
		}
	}
}
