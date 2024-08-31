package wipro;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Questions {
	
	public static void main(String[] args) {
		String[] arr = {"car" , "bus", "bus", "train", "car", "car" };
		// o/p : "car", "bus","train"
		Set<String> set = Arrays.stream(arr).collect(Collectors.groupingBy(e -> e, Collectors.counting())).keySet();
		System.out.println(set);
		
		//Get unique Employee ID’s, whose name start’s with M
		//List<Integer>  list = List.of();
		//list.stream().filter(emp -> emp.getName.startWith("M")).map(emp -> emp.getEmployeeId()).distinct();
		
//		new Runnble() {
//			public void run() {
//				System.out.println("");
//			}
//		}
//		
//		() -> System.out.println("")
//		
//		Object
		
//		try {
//			
//		}
		//who care about exception
		//throw Exception("sd");
		
//		A() 
//			-> B() 
//				-> C() 
		
		//post(body), put(id, body), delete(id)
		
		//session factory -> session
		// 1:M, M:1
		//A(id, name, Address()) B()
		
		//cascading
		
		//Transaction
		
		//TreeMap, 
		//HashMap
		//LinkedHashMap
		
		//checked and unchecked
	}
}