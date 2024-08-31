package LTIMindtree;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Rounds1 {
	
	public static void main(String[] args) {
		//1 . Filter data based on condition in list using stream
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		Optional<Integer> opt = list.stream().filter(a -> a.intValue() > 0).findAny();
		if (opt.isPresent()) {
			System.out.println(opt.get());
		}
		// employee -> name and id
//		List<Employee> list =  new ArrayList<>;
//		Optional<Employee> opt = list.stream().filter((emp) -> emp.getName.equals("ankit")).findAny();
//		if (opt.isPresent()) {
//			opt.get();
//		}
		
		// 2. why we use array list over linked list for api response
		// Each element of a LinkedList has more overhead since pointers to the next and previous elements are also stored
		
//		// get api -> emplyee list
//		ArrayList<>
//		LinkedList<>
		
		// 3. Hash map internal implementation 
		// HashMap
		//key ->  hash
		
		//Node[] -> LL
		
		// 4.if B service is failing when calling from service A
		//A -> B
		//Circuit Breaker
//		fallbackMethod() {
//			
//		}
		
		// 5. What we do to in case of database for each service
		//Microservice -> 6, 7
//		Single DB 
//		Multiple DB
//		A -> emp, B -> dept
		
		// 6. Custom Pipe and how to use them
		// PipeTransform interface and transform method
		//{{ | customPipe}}
		
		// 7. merge two api response
		// forkJoin (api1 -> res1, api-> res)  [res1, res2]
		
		// 8. Communication between Parent and Child
		// parent -> child @Input -> property binding, @Output : event binding
		
		// 9. What is observable
		// http client : 
		
		// 10. lazy loading in angular
		// module 4 component -> 2 component
		 
		// post obejct
//		@PostMapping("/employee")
//		 addEmployee(@RequestBody Employee e) {
//			
//		}
	}
}
class Node {
	//key, value, Node next;
}
