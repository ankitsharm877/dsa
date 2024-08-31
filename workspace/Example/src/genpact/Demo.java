package genpact;

public class Demo {

	public static void main(String[] args) {
		// n = length is always even, str = string "00011011" 00 -> a, 01 -> t, 10 -> c, 11 -> g

		int n = 2;
		String str ="11";

		

		String str1 = "Hi I am ankit";
		char key = 'z';

		

		int[] arr = {50, 62, 100, 40, 30, 60, 70, 30, 200};
		
	}
	
	int search(String str, char key) {
		for (int i = 0; i < str.length(); i++) {
		    if (str.charAt(i) == key) {
		        return i;
		    }
		}
		return -1;
	}
	
	String transform(int n , String str) {
	    String res = "";
	    for (int i = 0; i < str.length(); i = i + 2) {
	        String s = str.charAt(i) + " " + str.charAt(i + 1);
	        if (s.equals("00")) {
	            res += "a";
	        } else if (s.equals("01")) {
	            res += "t";
	        }  else if (s.equals("10")) {
	            res += "c";
	        }  else if (s.equals("11")) {
	            res += "g";
	        } 
	    }
	    return res;
	}	
}

class Singleton {
	private static Singleton instance = null;
	
    private Singleton() {
		
	}
    
    public static Singleton getInstance() {
    	if (instance == null) {
    		instance = new Singleton();
    	}
    	return instance;
    }
}