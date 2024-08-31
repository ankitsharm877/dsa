package altemetrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,3,5,7,1);
		
		List<Integer> list2 = Arrays.asList(9,6,1,5,2,4);
		
		// merge the given lists
		// sort by desc 
		// remove duplicates without set or stream
		
		List<Integer> list = new ArrayList<>();
		//list.addAll(list2);
		for (int val : list1) {
			list.add(val);
		}
		for (int val : list2) {
			list.add(val);
		}
		System.out.println(list);
		list.sort((a, b) -> b - a);
		System.out.println(list);
		
		List<Integer> list3 = new ArrayList<>();
		int prev = -1;
		for (int val : list) {
			if (prev != val) {
				list3.add(val);
			}
			prev = val;
		}
		System.out.println(list3);
	}
}
