package main;

public class OneTwoComplement {

	public static void main(String[] args) {
		//In two's complement, the MSB is a sign bit.
		//MSB Most significant bit or You can Say left most bit
		//A 0 in the MSB indicates a positive number while a 1 indicates a negative number.
		//so the most significant bit (MSB) is used to indicate the sign of the number.
		//The remaining 31 bits are used to represent the magnitude of the number.(I am taking 32bit number)
		//For example, the number 1 is represented as 00000000000000000000000000000001.
		//For example, the number -1 is represented as 11111111111111111111111111111111.

		System.out.println(Integer.toBinaryString(1));
		System.out.println(Integer.toBinaryString(-1));
		
		//In other words, the negative number -1 is represented as the bitwise complement of the positive number 1, plus 1.
		//The bitwise complement of a number is the number obtained by flipping all of the bits in the number. 
		//So, the bitwise complement of 1 is 11111111111111111111111111111110. When we add 1 to this number, 
		//we get 11111111111111111111111111111111, which is the two's complement representation of -1.
		
		//negative_number = ~positive_number + 1
		
		//In two's complement representation, subtraction can be done by simply adding the two numbers together, 
		//and then taking the bitwise complement of the result
		int num1 = 69;
		int num2 = 12;
		int num= num1 - num2;
		num= (num1) + ((~num2)+1);
		System.out.println(num);
		
		// complement
		int n = 5;
		int temp = 0;
        int i = 0;
        while (n != 0) {
            int d = (n & 1) == 1 ? 0 : 1;
            n = n >> 1;
            temp += Math.pow(2, i) * d;
            i++;
        }
        System.out.println("complement of 5: " + temp);
	}

}
