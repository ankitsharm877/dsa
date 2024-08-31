package sap1.sap93;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		//1. find frequency of each text
		String[] arr = {"car" , "bus", "bus", "train", "car", "car" };
		// o/p : "car", "bus","train"
		Map<Object, Long> map = Arrays.stream(arr).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		map = map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, 
						(v1, v2) -> { throw new IllegalStateException(); },
				           LinkedHashMap::new));
		System.out.println(map);
		
		//2. Get unique Employee ID’s, whose name start’s with M
		List<Employee> list = new ArrayList<>();
		Employee e1 = new Employee("1", "Manu");
		list.add(e1);
		Employee e2 = new Employee("2", "Manu1");
		list.add(e2);
		Employee e3 = new Employee("2", "Manu3");
		list.add(e3);
		list.stream().filter(emp -> emp.name().startsWith("M"))
			.map(emp -> emp.employeeId()).distinct().forEach(emp -> System.out.println(emp));
		//list.stream().filter(emp -> emp.getName.startWith("M")).map(emp -> emp.getEmployeeId()).distinct();
		
		//3. which one will create class file: Anonymous class
//		new Runnble() {
//			public void run() {
//				System.out.println("");
//			}
//		}
//		
//		() -> System.out.println("")

		//4. which all method are there in object class (9 methods)
		//hashCode(), equals(), finalize(), toString(), wait(), notify(), notifyAll(), clone(), getClass()
		
//		try {
//			
//		}
		//5. who care about exception
		//throw Exception("sd");
		
//		A() 
//			-> B() 
//				-> C() 
		
		//post(body), put(id, body), delete(id)
		
		//6. Hibernate SessionFactory and Session
		// 1:M, M:1
		//A(id, name, Address()) B()
		
		//7. Hibernate – Different Cascade Types
		
		//8. Transaction
		
		//9. Difference between TreeMap and LinkedHashMap
		
		//10. checked and unchecked
	}
}

record Employee(String employeeId, String name) {
	
}