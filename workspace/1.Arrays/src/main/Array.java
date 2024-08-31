package main;

public class Array {
	public int size = 10;
	public int length = 0;
	int[] data = new int[size];
	
	public Array(int size) {
		this.size = size;
	} 
	
	public void insert(int index, int x) {
		for (int i = length; i > index; i--) {
			this.data[i] = this.data[i - 1];
		}
		if (this.length < this.size) {
			this.data[index] = x;
			this.length++;
		}
	}
	
	public void append(int x) {
		if (this.length < this.size) {
			this.data[this.length] = x;
			this.length++;
		}
	}
	
	public int remove(int index) {
		int x = this.data[index];
		for (int i = index; i < length - 1; i++) {
			this.data[i] = this.data[i + 1];
		}
		this.length--;
		return x;
	}
	
	public int get(int index) {
		if (index >= 0 && index < this.length) {
			return this.data[index];
		}
		return -1;
	}
	
	public void set(int element, int index) {
		if (index >= 0 && index < this.length) {
			this.data[index] = element;
		}
	}
	
	public int max() {
		int max = this.data[0];
		for (int index = 1; index < this.length; index++) {
			if (max < this.data[index]) {
				max = this.data[index];
			}
		}
		return max;
	}
	
	public int min() {
		int min = this.data[0];
		for (int index = 1; index < this.length; index++) {
			if (min > this.data[index]) {
				min = this.data[index];
			}
		}
		return min;
	}
	
	public void insertInSortingArray(int x) {
		for (int i = this.length -1; i > 0; i--) {
			if (this.size == this.length) {
				return;
			} else {
				for (int index = this.length; index > 0; index--) {
					if (this.data[index] > x) {
						this.data[index] = this.data[index + 1];						
					} else {
						this.data[index] = x;
						this.length++;
						return;
					}
				}
			}
			
		}
	}
	
	public void print() {
		for (int i = 0; i < this.length; i++) {
			System.out.println(this.data[i]);
		}
	}
}
