package sap1.sap7;

import java.util.LinkedHashMap;

public class LRUCache {
	int size = 0;
	LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<Integer, Integer>();

    public LRUCache(int capacity) {
        this.size = capacity;
    }
    
    public int get(int key) {
        return this.cache.get(key);
    }
    
    public void put(int key, int value) {
       
    }
}
