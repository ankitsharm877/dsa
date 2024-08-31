package contest3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Question2 {

	public static void main(String[] args) {
		String a = "ZURGCENPRD";
		String b = "BURGCENPRD";
		
	}
	
	 public static ArrayList<String> sortItems(int n, String[] items) {
	        // code here
	        Arrays.sort(items, new Comparator<String>() {
	            public int compare(String a, String b) {
	                if (a.length() == 1 && b.length() == 1) {
	                     return a.compareTo(b);   
	                } else if (a.length() < b.length()) {
	                     return a.length() - b.length();
	                } else if (a.length() > b.length()) {
	                     return a.length() - b.length();
	                } else {
	                    long x = 0;
	                    long y = 0;
	                    while (!a.isEmpty()) {
	                        char cc = a.charAt(0);
	                        a = a.substring(1);
	                        x = x * 26 + (cc - 'A' + 1);
	                    }
	                    while (!b.isEmpty()) {
	                        char cc = b.charAt(0);
	                        b = b.substring(1);
	                        y = y * 26 + (cc - 'A' + 1);
	                    }
	                    if ((x - y) > 0) {
	                        return 1;
	                    } else if ((x - y) < 0) {
	                        return -1;
	                    } else {
	                        return 0;
	                    }
	                }
	            }
	        });
	        ArrayList<String> list = new ArrayList<>();
	        for (String item : items) {
	            list.add(item);
	        }
	        return list;
	    }

}
