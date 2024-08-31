package core;

public class BitManipulation {

	public static void main(String[] args) {
		System.out.println(extractBit(22, 5));
		System.out.println(extractBit(6, 5));
		
		System.out.println(setBit(21, 4));
		
		System.out.println(clearBit(21, 3));
		
		System.out.println(rightMostSetBit(8));
	}
	
	public static int extractBit(int n, int i) {
		n = (1 << (i - 1)) & n;
		return n == 0 ? 0 : 1;
	}

	public static int setBit(int n, int i) {
		n = (1 << (i - 1)) | n;
		return n;
	}
	
	public static int clearBit(int n, int i) {
		n = (~(1 << (i - 1))) & n;
		return n;
	}
	
	public static int rightMostSetBit(int n) {
		int pos = 1;
		int mask = 1;
		while ((n & mask) == 0) {
			pos++;
			mask = mask << 1;
		}
		return pos;
	}
}

