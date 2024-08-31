package infobeans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		//Write a method that takes input as list and returns Map of String, Integer. 
		//The method should count the number of occurrences of each string in the list in java.
		//[abc,def,abc] -> {abc:2, def:1}
		List<String> list = List.of("abc","def","abc");
		System.out.println(map(list));
		
		//1. how try with resource close connection
		//2. how to do many to many mapping 
		//3. reflection
		//4. cohesion
		//5. why to use default method over static method
		//6. design patterns used in spring boot
		//7. design patterns used in java
		
	}
	
	public static Map<String, Long> map(List<String> list) {
		return list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	}
}


class Singleton {
	private static Singleton instance = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}

class Immutable {
	private final List<Integer> data;
	
	public Immutable(List<Integer> data) {
		List<Integer> newData = new ArrayList<>(data);
		this.data = newData;
	}
	
	public List<Integer> getData() {
		List<Integer> newData = new ArrayList<>(this.data);
		return newData;
	}
}
