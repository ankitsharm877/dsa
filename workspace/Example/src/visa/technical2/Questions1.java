package visa.technical2;

import java.util.Arrays;
import java.util.Comparator;

public class Questions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. Subject and Observables
		//2. Authentication in spring boot
		//3. sort array of serial numbers
		
		String[] serials = {"ABA","ABC","ABCD", "12BN", "156N", "A"};
		Arrays.sort(serials, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if (s1.length() < s2.length()) {
					return -1;
				} else if (s1.length() > s2.length()) {
					return 1;
				} else {
					return s1.compareTo(s2);
				}
			}
		});
		System.out.println(Arrays.toString(serials));
	}

}
