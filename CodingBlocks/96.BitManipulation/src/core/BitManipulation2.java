package core;

public class BitManipulation2 {

	public static void main(String[] args) {
		System.out.println(addOne(9));
		System.out.println(addOne(27));
		
		//No which is Power of 5 or sum of powers of 5, find ith magic no
		System.out.println(magicNo(5));
		System.out.println(magicNo(2));
		
		//pascal nth row sum
		System.out.println(pascalSum(5));
		
		//power of two
		System.out.println(powerofTwo(2));
		System.out.println(powerofTwo(16));
		System.out.println(powerofTwo(5));
		
		//power of four
		System.out.println(powerofFour(2));
		System.out.println(powerofFour(16));
		System.out.println(powerofFour(5));
	}
	
	public static int addOne(int n) {
		int mask = 1;
		while ((n & mask) != 0) {
			n = n ^ mask;
			mask = mask << 1;
		}
		n = n ^ mask;
		return n;
	}
	
	
	public static int magicNo(int i) {
		int ans = 0;
		int pow = 1;
		while (i != 0) {
			pow = pow * 5;
			if ((i & 1) != 0) {
				ans = ans + pow;
			}
			i = i >> 1;
		}
		return ans;
	}
	
	public static int pascalSum(int n) {
		int res = (1 << n);
		return res - 1;
	}
	
	public static boolean powerofTwo(int n) {
		if (n != 0) {
            return (n & (n - 1)) == 0;
        } else {
            return false;
        }
	}
	
	public static boolean powerofFour(int x) {
        if (x > 0) {
            return ((x & (x - 1)) == 0) && (x % 3 == 1);
        } else {
            return false;
        }
	}

}
