package main;

public class BitwiseOperations {

	public static void main(String[] args) {
		System.out.println("AND: " + (3 & 1)); // 011 & 001 = 001 (1)
		System.out.println("OR: " + (3 | 1)); // 011 & 001 = 011 (3)
		System.out.println("XOR: " + (3 ^ 1)); // 011 ^ 001 = 010 (2)
		System.out.println("NOT: " + (~1)); // 001 = 
		// Every time we shift a number towards the left by 1 bit it multiply that number by 2.
		System.out.println("Left Shift: " + (2 << 1)); // 010 << 1 = 100 (4)
		//Every time we shift a number towards the right by 1 bit it divides that number by 2.
		System.out.println("Right Shift: " + (2 >> 1)); // 010 >> 1 = 001 (1)
		
		System.out.println("How to Set a bit in the number?");
		int num = 4, pos = 1;
        num = set(num, pos);
        System.out.println(num);
        
        System.out.println("How to unset/clear a bit at n’th position in the number");
        num = 7; pos = 0;
        num = unset(num, pos);
        System.out.println(num);
        
        System.out.println("Toggling a bit at nth position");
        num = 4; pos = 1;
        num = toggle(num, pos);
        System.out.println(num);
        
        System.out.println("Checking if the bit at nth position is Set or Unset");
        num = 5;
        pos = 1;
        int bit = at_position(num, pos);
        System.out.println(bit);
        
        System.out.println("Multiply a number by 2 using the left shift operator");
        
        num = 12;
        int ans = num << 1;
        System.out.println(ans);
        
        System.out.println("Divide a number 2 using the right shift operator");
        
        num = 12;
        ans = num >> 1;
        System.out.println(ans);
        
        System.out.println("Compute XOR from 1 to n (direct method)");
        System.out.println(computeXOR(6));
        
        System.out.println("How to know if a number is a power of 2");
        System.out.println(isPowerOfTwo(4));
        
        System.out.println("Count Set bits in an integer");
        System.out.println(countBits(7));
        System.out.println(countBitsI(7));
        
        System.out.println("Position of rightmost set bit");
        System.out.println(positionOfRightmostSetBit(20));
        
        System.out.println("Swap two numbers");
        int a = 12;
        int b = 23;
        swap(a, b);
        
        System.out.println("Printing the binary representation of any Number.");   
        int x = 7; //111
        printBinary(x);
        
        System.out.println("For clearing the set bits upto ith bit");
        int i=4;
        //clearing upto 5 the place;
        a=59;
        b=(a&(~((1<<(i+1))-1)));
        System.out.println(b);
        //clearing the lsb upto ith bit;

        i=3;
        int c=(a&((1<<(i+1))-1));
        System.out.println(c);
        //clearing the msb upto ith bit; 
        
        //Some Medium level uses
        //1.Set union A | B
        //2.Set intersection A & B
        //3.Set subtraction A & ~B
        //4.Set negation ALL_BITS ^ A or ~A
        //5.Set bit A |= 1 << bit
        //6.Clear bit A &= ~(1 << bit)
        //7.Test bit (A & 1 << bit) != 0
        //8.Extract last bit A&-A or A&~(A-1) or x^(x&(x-1))
        //9.Remove last bit A&(A-1)
        //10.Get all 1-bits ~0==-1
	}
	
	public static int set(int num, int pos) {
        num = num | (1 << pos);
        return num;
    }

	public static int unset(int num, int pos){
        num = num & (~(1 << pos));
        return num;
    }
	
	public static int toggle(int num, int pos) {
        num = num ^ (1 << pos);
        return num;
    }
	
	public static int at_position(int num, int pos) {
        int bit = num & (1 << pos);
        return bit;
    }
	
	public static int computeXOR(int n) {
        if (n % 4 == 0)
            return n;
        if (n % 4 == 1)
            return 1;
        if (n % 4 == 2)
            return n + 1;
        else
            return 0;
    }
	
	public static boolean isPowerOfTwo(int x){
	    return x != 0 && ((x & (x - 1)) == 0);
	}

	public static int countBits(int n){
	    int count = 0;
	    while (n > 0) {
	        count += n & 1;
	        n >>= 1;
	    }
	    return count;
	}
	public static int countBitsI(int num){
		 int count=0;
		 for (int i=31; i>=0;--i) {
			 if((num & (1<<i)) != 0) 
				 count++;			 
		 }
		 return count;
	}
	
	public static int positionOfRightmostSetBit(int n) {
	    if ((n & 1) != 0) {
	        return 1;
	    }
	    n = n ^ (n & (n - 1));
	    
	    int pos = 0;
	    while (n != 0) {
	        n = n >> 1;
	        pos++;
	    }
	    return pos;
	}
	
	public static void swap(int a, int b) {
		a ^= b;
		b ^= a;
		a ^= b;
		System.out.println(a + ", " + b);
	}
	
	public static void printBinary(int x) {
		for (int i = 10; i >= 0; i--) {
			System.out.print((x >> i) & 1);
		}
		System.out.println("");
	}
}
