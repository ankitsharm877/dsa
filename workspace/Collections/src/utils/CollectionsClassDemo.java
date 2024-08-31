package utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class CollectionsClassDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Collections.sort(list);
		Collections.sort(list, Comparator.naturalOrder());
		Collections.sort(list, Comparator.reverseOrder());
		Collections.binarySearch(list, 2);
		Collections.reverse(list);
		
		//Collections.synchronizedList(list);
		//Collections.synchronizedSet(set);
		HashMap<Integer, Integer> map = new HashMap<>();
		Collections.synchronizedMap(map);
	}

}
