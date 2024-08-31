package other;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericHeap<T extends Comparable<T>> {

	ArrayList<T> minHeap = new ArrayList<>();
	
	HashMap<T, Integer> map = new HashMap<>();
	
	// log(n)
	public void add(T item) {
		minHeap.add(item);
		map.put(item, this.minHeap.size() - 1);
		upheapify(minHeap.size() - 1);
	}
	
	private void upheapify(int ci) {
		int pi = (ci - 1) / 2;
		
		if(isLarger(minHeap.get(ci), minHeap.get(pi)) > 0) {
			swap(ci, pi);
			upheapify(pi);
		} 
	}
	
	private void swap(int i, int j) {
		T ith = minHeap.get(i);
		T jth = minHeap.get(j);
		
		minHeap.set(i, jth);
		minHeap.set(j, ith);
		
		map.put(ith, j);
		map.put(jth, i);
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
	public T remove() {
		swap(0, this.minHeap.size() - 1);
		
		T rv = this.minHeap.remove(this.minHeap.size() - 1);
		downheapify(0);
		
		map.remove(rv);
		return rv;
	}
	
	public void downheapify(int pi) {
		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		
		int mini = pi;
		
		if (lci < minHeap.size() && isLarger(minHeap.get(lci), minHeap.get(mini)) > 0) {
			mini = lci;
		}
		if (rci < minHeap.size() && isLarger(minHeap.get(rci), minHeap.get(mini)) > 0) {
			mini = rci;
		}
		
		if (mini != pi) {
			swap(pi, mini);
			downheapify(mini);
		}
	}
	
	// O(1)
	public T get() {
		return this.minHeap.get(0);
	}
	
	public int isLarger(T t, T o) {
		return t.compareTo(o);
	}
	
	public void updatePriority(T pair) {
		int index = this.map.get(pair);
		upheapify(index);
	}
}
