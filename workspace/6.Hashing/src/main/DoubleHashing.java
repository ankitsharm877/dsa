package main;

public class DoubleHashing {

	public static void main(String[] args) {
		int[] hashTable = new int[10];
		insert(hashTable, 12);
		insert(hashTable, 25);
		insert(hashTable, 35);
		insert(hashTable, 26);
		System.out.println(search(hashTable, 25));
	}
	
	public static int hash1(int key) {
		return key % 10;
	}
	
	public static int hash2(int key) {
		return 7 - (key % 7);
	}
	
	public static int probe(int hashTable[], int key) {
		int index = hash1(key);
		int i = 0;
		while (hashTable[(index + i * hash2(key)) % 10] != 0) {
			i++;
		}
		return (index + i * hash2(key)) % 10;
	}
	
	public static void insert(int hashTable[], int key) {
		int index = hash1(key);
		if (hashTable[index] != 0) {
			index = probe(hashTable, key);
		}
		hashTable[index] = key;
	}
	
	public static int search (int hashTable[], int key) {
		int index = hash1(key);
		int i = 0;
		while(hashTable[(index + i * hash2(key)) % 10] != key) {
			i++;
		} 
		return (index + i * hash2(key)) % 10;
	}

}
