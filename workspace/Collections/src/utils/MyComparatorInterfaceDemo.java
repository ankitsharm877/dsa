package utils;

import java.util.Comparator;

public class MyComparatorInterfaceDemo implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 - o2;
	}

}
