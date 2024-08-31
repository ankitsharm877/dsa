package main;

public class CharacterBitwiseOperations {

	public static void main(String[] args) {
		//Difference between upper case letter and lower case letter binary is that
		//In upper case letter 5th bit != 1;
		//In lower case letter 5th bit = 1;
		System.out.println(Integer.toBinaryString('A'));
		System.out.println(Integer.toBinaryString('a'));

		//Convert Char to lower case;
		System.out.println((char)('A' | (1 << 5)));
		System.out.println((char)('C' | ' '));
		//Convert Char to upper case;
		System.out.println((char)('b' & ~(1 << 5)));
		System.out.println((char)('d' & '_'));
		
		//Find a letter’s position in alphabet
		System.out.println(('A' & 31)); //returns position 1
		System.out.println(('C' & 31)); //returns position 3
	}

}
