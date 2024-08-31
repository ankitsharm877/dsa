package sap1.sap7;

import java.util.LinkedList;

public class Caching {
	LinkedList<RLUCaching> list = new LinkedList<>();
	int maxSize = 0;
	int length = 0;
	
	public Caching (int size) {
		this.maxSize = size;
	}
	
	public void add(RLUCaching rluCaching) {
		if (this.length < this.maxSize) {
			list.addLast(rluCaching);
			this.length++;
		} else {
			list.removeFirst();
			this.length--;
			list.addLast(rluCaching);
			this.length++;
		}
	}
	
	public RLUCaching get(String key) {
		for (int i = 0; i < this.length; i++) {
			if (key.equalsIgnoreCase(this.list.get(i).key)) {
				this.list.get(i).noOfUsage++;
				return this.list.get(i);
			}
		}
		return null;
	}
	
	public void print() {
		System.out.println(list);
	}
}
