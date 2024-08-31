package sap1.sap91;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class Question {

	public static void main(String[] args) throws Exception {
		final ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.addAll(List.of(1,2));
		
		list.remove(Integer.valueOf("1"));
		System.out.println(list);
		//I still can add to ArrayList new elements, remove elements and update it.
		//list = new ArrayList<>(); but I can not reassign 
		
		final ArrayList<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		
		list1.remove("d");
		System.out.println(list1);
		
		ListIterator<String> itr = list1.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());	
			itr.add("d");
			itr.add("e");
		}
		
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("a1", 1);
		hm.put("a2", 12);
		hm.put("a3", 21);
		hm.put("a4", 43);
		hm.put("a5", 98);
		int sum = 0;
		for (Map.Entry<String, Integer> entry : hm.entrySet()) {
			if (!entry.getKey().equals("a2") && !entry.getKey().equals("a3")) {
				sum += entry.getValue();
			}
		}
		System.out.println("Sum : " + sum);
		try {
		method1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("hello");
		method2();
	}
	
	public static void method1() throws Exception{
		try {
			throw new Exception("dsfds");
		}
		finally {
			System.out.println("hi");
		}
	}
	
	public static void method2(){
		try {
			String str = null;
			str.trim();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Runtime hi");
		}
	}

}
