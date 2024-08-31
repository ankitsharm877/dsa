package application;

public class PowerOfN {

	public static void main(String[] args) {
		//Q ) Check if a number is a power of 4 or not  ?
		//The given number n is a power of 4 if it is a power of 2 and
		//its remainder is 1 when it is divided by 3.
		System.out.println(checkPowerOf4(16));
		System.out.println(checkPowerOf2(2));
		System.out.println(checkPowerOf3(9));
	}
	
	public static boolean checkPowerOf4(int x){
	    // return true if `n` is a power of 2, and
	    // the remainder is 1 when divided by 3
		return (x != 0 && ((x & (x - 1)) == 0)) && (x % 3 == 1);
	}
	
	public static boolean checkPowerOf2(int x){
	    // return true if `n` is a power of 2, and
		return (x != 0 && ((x & (x - 1)) == 0));
	}
	
	public static boolean checkPowerOf3(int n){
		if (n <= 0)
			 return false;
        /* The maximum power of 3 value that
           integer can hold is 1162261467 ( 3^19 ) .*/
        return 1162261467 % n == 0;
	}
	

}
