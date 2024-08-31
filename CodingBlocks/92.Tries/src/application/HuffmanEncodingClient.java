package application;

import java.util.BitSet;

public class HuffmanEncodingClient {

	public static void main(String[] args) {
		String str = "abbccda";
		HuffmanEncoding hf = new HuffmanEncoding(str);
		String codedString = hf.encode(str);
		System.out.println(codedString);
		String output = hf.decode(codedString);
		System.out.println(output);
		
		BitSet bitSet = new BitSet(codedString.length());
		int bitCounter = 0;
		for (Character c : codedString.toCharArray()) {
			if (c.equals('1')) {
				bitSet.set(bitCounter);
			}
			bitCounter++;
		}
		
		byte[] arr = bitSet.toByteArray();
		System.out.println(arr.length);
	}

}
