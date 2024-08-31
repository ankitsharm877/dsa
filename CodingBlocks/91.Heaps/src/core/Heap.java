package core;

import java.util.ArrayList;

public class Heap {

	ArrayList<Integer> minHeap = new ArrayList<>();
	
	// log(n)
	public void add(int item) {
		minHeap.add(item);
		upheapify(minHeap.size() - 1);
	}
	
	private void upheapify(int ci) {
		int pi = (ci - 1) / 2;
		
		if(minHeap.get(ci) < minHeap.get(pi)) {
			swap(ci, pi);
			upheapify(pi);
		} 
	}
	
	private void swap(int i, int j) {
		int ith = minHeap.get(i);
		int jth = minHeap.get(j);
		
		minHeap.set(i, jth);
		minHeap.set(j, ith);
	}
	
	public void display() {
		System.out.println(this.minHeap);
	}
	
	public int size() {
		return this.minHeap.size();
	}
	
	public boolean isEmpty() {
		return this.size() == 0;
	}
	
	// log(n)
	public int remove() {
		swap(0, this.minHeap.size() - 1);
		
		int rv = this.minHeap.remove(this.minHeap.size() - 1);
		downheapify(0);
		return rv;
	}
	
	public void downheapify(int pi) {
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		
		int mini = pi;
		
		if (lci < minHeap.size() && minHeap.get(lci) < minHeap.get(mini)) {
			mini = lci;
		}
		if (rci < minHeap.size() && minHeap.get(rci) < minHeap.get(mini)) {
			mini = rci;
		}
		
		if (mini != pi) {
			swap(pi, mini);
			downheapify(mini);
		}
	}
	
	// O(1)
	public int get() {
		return this.minHeap.get(0);
	}
}
