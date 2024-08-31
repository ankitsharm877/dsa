package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//implements List, RandomAccess, Cloneable, Serializable
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> al1 = new ArrayList<>(5);
		ArrayList<Integer> al2 = new ArrayList<>(al1);
		al.add(1);
		al.add(3);
		al.add(2);
		System.out.println(al);
		
		ArrayList<Integer> cloneAl = (ArrayList<Integer>) al.clone();
		System.out.println(cloneAl);
		
		List<Integer> l1 = Collections.synchronizedList(al);
		
	}

}
