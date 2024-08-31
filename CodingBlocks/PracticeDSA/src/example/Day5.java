package example;

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
	
	//print 5,4,3,2,1
	//doing work while stack is building (fn pushed into stack)
	public static void printD(int n) {
		if (n == 0) {
			return;
		}
		System.out.print(n + ", ");
		printD(n - 1); // -> printD(n - 2) -> printD(n - 3) -> ... -> printD(1) -> printD(0)
	}
	
	//print 1,2,3,4,5
	//doing work when stack is failing (fn popped from stack)
	public static void printI(int n) {
		if (n == 0) {
			return;
		}
		printI(n - 1); // -> printD(n - 2) -> printD(n - 3) -> ... -> printD(1) -> printD(0)
		System.out.print(n + ", ");
	}
	
	//print 5,4,3,2,1,1,2,3,4,5
	//doing work before a call and after the call
	public static void printDI(int n) {
		if (n == 0) {
			return;
		}
		System.out.print(n + ", ");
		printDI(n - 1); // -> printD(n - 2) -> printD(n - 3) -> ... -> printD(1) -> printD(0)
		System.out.print(n + ", ");
	}
	
	//print 5,3,1,2,4
	//doing work before a call and after call with skip
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
