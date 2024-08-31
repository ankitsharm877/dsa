package tavant;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Round1 {

	public static void main(String[] args) {
		//1. multiple inheritence 
		Test t1 = new Test();
		t1.m1();
		
		//2. difference between @Service and @Repository annotation
		
		//3. spring object and literal
		String s1 = "Hello";
		String s2 = new String("Hello");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		//4. CQRS pattern
		
		//5. Singleton pattern
		
		//6. Composite pattern
		
		//7. Spring actuator
		
		//8. find second largest element from list
		List<Integer> list = List.of(2,34,6,8,9);
		int secondElemt = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(1);
		System.out.println(secondElemt);
		
		//9.Find the 1st Non-repeating character in a string .. 
		String str =" Javaa ProgramJ";
		
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		for (char ch : str.toCharArray()) {
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}
		System.out.println(hm);
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				return;
			}
		}
		
		//10. how make fault tolerance a service which is being called from other service
		
	}
}

interface Left {
	public default void m1() {
		System.out.println("Hi");
	}
}

interface Right {
	public default void m1() {
		System.out.println("Hello");
	}
}

class Test implements Left, Right {
	@Override
	public void m1() {
		Left.super.m1();
	}
}


