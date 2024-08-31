package test;

public class DemoFib {

	public static void main(String[] args) {
		int n = 2;
		int x = 0;
		int y = 1;
		for (int i = 0; i < n; i++) {
		    System.out.println(x); 
		    int t = x;
		    x = y; 
		    y =  t + y;
		}

	}

}
