package main;

public class QuadraticProbing {

	public static void main(String[] args) {
		int[] hashTable = new int[10];
		insert(hashTable, 12);
		insert(hashTable, 25);
		insert(hashTable, 35);
		insert(hashTable, 26);
		System.out.println(search(hashTable, 25));
	}
	
	public static int hash(int key) {
		return key % 10;
	}
	
	public static int probe(int hashTable[], int key) {
		int index = hash(key);
		int i = 0;
		while (hashTable[(index + i*i) % 10] != 0) {
			i++;
		}
		return (index + i*i) % 10;
	}
	
	public static void insert(int hashTable[], int key) {
		int index = hash(key);
		if (hashTable[index] != 0) {
			index = probe(hashTable, key);
		}
		hashTable[index] = key;
	}
	
	public static int search (int hashTable[], int key) {
		int index = hash(key);
		int i = 0;
		while(hashTable[(index + i*i) % 10] != key) {
			i++;
		} 
		return (index + i*i) % 10;
	}

}
