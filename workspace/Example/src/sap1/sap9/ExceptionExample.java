package sap1.sap9;

public class ExceptionExample {

	public static void main(String[] args) {
		try {
			int x = 0;
	        int y = 10;
	        int z = y / x;
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
