package applications;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntersectionTwoArrays {

	public static void main(String[] args) {
		int[] one = {5,1,3,4,7};
		int[] two = {2,4,3,5,7,10,15};
		ArrayList<Integer> list = getIntersection(one, two);
		System.out.println(list);
	}
	
	public static ArrayList<Integer> getIntersection(int[] one, int[] two) {
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer, Boolean> hm = new HashMap<>();
		for (int i = 0; i < one.length; i++) {
			hm.put(one[i], false);
		}
		for (int i = 0; i < two.length; i++) {
			if (hm.containsKey(two[i])) {
				hm.put(two[i], true);				
			}
		}
		for (Map.Entry<Integer, Boolean> entry: hm.entrySet()) {
			if (entry.getValue()) {
				list.add(entry.getKey());
			}
		}
		return list;
	}
	

}
