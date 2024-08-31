package map;

import java.util.WeakHashMap;

public class WeakHashMapClassDemo {

	public static void main(String[] args) throws InterruptedException {
		// In the case of HashMap object is not eligible for g.c even though 
		//it doesn't have any external reference if it is assoicated with hashmap
		WeakHashMap<Integer, Integer> whm = new WeakHashMap<>();
		Integer i1 = Integer.getInteger("1");
		whm.put(i1, 1);
		System.out.println(whm);
		i1 = null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(whm);
	}

}
