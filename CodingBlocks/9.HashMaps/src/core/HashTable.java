package core;

import generics.LinkedList;

public class HashTable<K, V> {
	
	private class Node {
		K key;
		V value;
		
		Node (K key, V value) {
			this.key = key;
			this.value = value;
		}
		public boolean equals(Object other) {
			Node node = (Node)other;
			return this.key.equals(node.key);
		}
		@Override
		public String toString() {
			return "Node [key=" + key + ", value=" + value + "]";
		}
	}
	
	public static final int DEFAULT_CAPACITY = 10;
	private LinkedList<Node>[] bucketArray;
	private int size;
	
	public HashTable() {
		this(DEFAULT_CAPACITY);
	}
	
	public HashTable(int capacity) {
		this.bucketArray = (LinkedList<Node>[]) new LinkedList[capacity];
	}
	
	public void put(K key, V value) throws Exception {
		int hash = hashFunction(key);
		LinkedList<Node> bucket = this.bucketArray[hash];
		Node newNode = new Node(key, value);
		if (bucket == null) {
			bucket = new LinkedList<>();
			bucket.addLast(newNode);
			this.bucketArray[hash] = bucket;
		} else {
			int findAt = bucket.find(newNode);
			if (findAt == -1) {
				bucket.addLast(newNode);
				this.size++;
			} else {
				Node node = bucket.getAt(findAt);
				node.value = value;
			}
		}
		
		double lamda = (this.size * 1.0) / this.bucketArray.length;
		if (lamda > 0.75) {
			this.rehash();
		}
		
	}

	private void rehash() throws Exception {
		LinkedList<Node>[] oba = this.bucketArray;
		this.bucketArray = (LinkedList<Node> []) new LinkedList[2 * oba.length];
		this.size = 0;
		for (LinkedList<Node> ob: oba) {
			while (ob != null && !ob.isEmpty()) {
				Node node = ob.removeFirst();
				this.put(node.key, node.value);
			}
		}
		
	}

	private int hashFunction(K key) {
		int hc = key.hashCode();
		hc = Math.abs(hc);
		int bucketIndex = hc % this.bucketArray.length;
		return bucketIndex;
	}
	
	public void display() {
		for (LinkedList<Node> bucket : this.bucketArray) {
			if (bucket != null && !bucket.isEmpty()) {
				bucket.display();
			} else {
				System.out.println("NULL");
			}
		}
		
		System.out.println("--------------------");
	}
	
	public V get(K key) throws Exception {
		int hash = hashFunction(key);
		LinkedList<Node> bucket = this.bucketArray[hash];
		
		Node node = new Node(key, null);
		if (bucket == null) {
			return null; 
		} else {
			int findAt = bucket.find(node);
			if (findAt == -1) {
				return null;
			} else {
				Node findNode = bucket.getAt(findAt);
				return findNode.value;
			}
		}
	}
	
	public V remove(K key) throws Exception {
		int hash = hashFunction(key);
		LinkedList<Node> bucket = this.bucketArray[hash];
		
		Node node = new Node(key, null);
		
		if (bucket == null) {
			return null; 
		} else {
			int findAt = bucket.find(node);
			if (findAt == -1) {
				return null;
			} else {
				Node findNode = bucket.getAt(findAt);
				bucket.removeAt(findAt);
				this.size--;
				return findNode.value;
			}
		}
	}
}
