package walmart.round1;

public class Demo2 {

	public static void main(String[] args) {
		//https://www.geeksforgeeks.org/find-k-th-bit-binary-string-created-repeated-invert-append-operations/
		int n = 4, k = 4;
		// n = 1, => 0 
		// n = 2, => 01
		// n = 3, => 01 10 -> 0 to 1
		// n = 4, => 01 10 10 01
		// n = 5, => 01 10 10 01 10 01 01 10
		
				//   01  23  45 
		System.out.println(print(n, k));
		System.out.println(printIndexVal(k, "0"));
		System.out.println(printIndexVal(k));
	}
	// O(N * K)
	public static String print(int n, int k) {
		if (n == 1) {
			return "0";
		}
		String str = "0";
		for (int i = 2; i <= n; i++) {
			String s = str;
			str = "";
			for (int j = 0; j < s.length(); j++) {
				str += getBinaryValue(s.charAt(j));
			}
		}
		System.out.println(str);
		return str.charAt(k) + "";
	}
	
	public static String getBinaryValue(char ch) {
		if (ch == '0') {
			return "01";
		} else {
			return "10";
		}
	}
	
	// O(k log k)
	public static int printIndexVal(int k, String s) { 
	    while (s.length() <= k) {
	        String t = ""; 
	        for (int i = 0; i < s.length(); i++){ 
	            if (s.charAt(i) == '0') 
	                t += '1'; 
	            else
	                t += '0'; 
	        }
	        s += t; 
	    }
	    System.out.println(s);
	    return s.charAt(k) - '0'; 
	} 
	
	// O(log k)
	public static int printIndexVal(int k) {
        long c = 0;
        while (k > 0) {
            k &= (k - 1);
            c++;
        }
        return (int) (c & 1);
    }
}
