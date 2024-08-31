package sap1.sap92;

public class ConvertStringDecimalToDecimal {

	public static void main(String[] args) {
		// convert it to double without using method
		String str = "123.456";
		double x = 0;
		boolean flag = true;
		int count = 1;
		for (char c: str.toCharArray()) {
			if (c == '.') {
				flag = false;
			} else {
				if (flag) {
					x = x * 10 + (c - '0'); // 123.0
				} else {
					x = x  + ((c - '0')  / Math.pow(10, count));
					count++;
				}
			}
		}
		System.out.println(x);
		
	}

}
