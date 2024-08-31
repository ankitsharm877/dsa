package map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapInterfaceDemo {

	public static void main(String[] args) {
		//A {@link SortedMap} extended with navigation methods returning the
		//closest matches for given search targets. Methods
		//{@link #lowerEntry}, {@link #floorEntry}, {@link #ceilingEntry},
		//and {@link #higherEntry} 
		//SortedMap<K,V>
		NavigableMap<Integer, Integer> nm = new TreeMap<>();
		nm.ceilingEntry(1);
		nm.ceilingKey(1);
		nm.floorEntry(1);
		nm.floorKey(1);
		nm.firstEntry();
		nm.firstKey();
		nm.lastEntry();
		nm.lastKey();
		nm.higherEntry(1);
		nm.higherKey(1);
		nm.lowerEntry(1);
		nm.lowerKey(1);
	}

}
