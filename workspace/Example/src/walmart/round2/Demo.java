package walmart.round2;

import java.util.HashSet;
import java.util.LinkedList;

public class Demo {

	public static void main(String [] args) {
       
//		Size of Cache = 4
//
//		LRU Cache
//
		int arr[] = {1, 2, 1, 3, 4, 3, 5, 4};
		
		int size = 4;
		
		//1
		//2,1
		//1,2
		//3,1,2
		//4,3,1,2
		//3,4,1,2
		//5,3,4,1
		//4,5,3,1
		
		LinkedList<Integer> cache = new LinkedList<>();
		HashSet<Integer> set = new HashSet<>();
		//HashMap<Integer, Integer> hm = new HashMap<>();
		// Node[] -> L.L.
		
		for (int val : arr) {
			if (!cache.contains(val)) {
				System.out.println("Miss:" + val);
				if (cache.size() < size) {
					cache.addFirst(val);
					set.add(val);
				} else {
					int x = cache.removeLast();
					cache.addFirst(val);
					set.remove(x);
					set.add(val);
				}
			} else {
				// hit 
				cache.remove(Integer.valueOf(val));
				cache.addFirst(val);
				System.out.println("Hit:" + val);
			}
		}
		System.out.println(cache);
		System.out.println(set);
    }
	
}