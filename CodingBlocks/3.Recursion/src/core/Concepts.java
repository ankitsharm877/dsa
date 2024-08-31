package core;

public class Concepts {

	public static void main(String[] args) {
		//printD(5);
		//printI(5);
		//printID(5);
		printDISkip(5);
	}
	
	// doing work while stack is building
	public static void printD(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		printD(n - 1);
	}

	// doing work while stack is failing
	public static void printI(int n) {
		if (n == 0) {
			return;
		}
		printI(n - 1);
		System.out.println(n);
	}
	
	//doing work before call and after call
	public static void printDI(int n) {
		if (n == 0) {
			return;
		}
		System.out.println(n);
		printDI(n - 1);
		System.out.println(n);
	}
	
	// doing work before call and after call with skip
	public static void printDISkip(int n) {
		if (n == 0) {
			return;
		}
		if (n % 2 == 1) {
			System.out.println(n);			
		}
		printDISkip(n - 1);
		if (n % 2 == 0) {
			System.out.println(n);			
		}
	}
}
