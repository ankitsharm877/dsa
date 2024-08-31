package copperpodDigital;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Round1 {
	
	public static void main(String[] args) {
		//1.list of employee which has field department-> find all employee of dept R&D
		
//		List<String> list = List.of();
//		list.stream().filter(emp -> emp.getDeptName().equals("R&D")).map(e -> e.getName()).collect(Collectors.toList());
		
		//2. use of peak() in stream API
		Stream.of("one", "two", "three", "four")
		  .filter(e -> e.length() > 3)
		  .peek(e -> System.out.println("Filtered value: " + e))
		  .map(String::toUpperCase)
		  .peek(e -> System.out.println("Mapped value: " + e))
		  .collect(Collectors.toList());
		
		// 3. map() vs flatMap()
		//[[1,2], [2,[3,4], ] -> [1,2,2,3,4]
		//stream
		
		
		// 4. Internal Implementation of HashMap
		// Node[] -> LL 
		//put(key, value) -> hash
		
//		class Node { 
//			key, 
//			value,
//			Node next
//		}
		
		//5. HashMap uses red black tree after crossing threshold
		
		//6. How to handle collision in hash map
		
		//7.race-condition
		
		//8. funtional interface
//		Car c1 = new Car() {
//			public void drive() {
//				System.out.println("dsd");
//			}
//		}; 
//		c1.drive();
//		
//		Car c = () -> System.out.println("dsd");
//		c.drive();
		
		//9. try with resource
//		try () {
//			
//		}
//		try {
//			
//		}
		
		//10. IOC -> theory, DI -> implementation
		
		//11. Bean Lifecycle methods postContruct PreDestory, Bean Scope (Singleton, Prototype, request, session)
		
		//12. Qualifier in Bean
//		Bean -> interface Sort
//		
//		@Primary
//		Class QS implemets Sort
//		
//		Class SS implements sort
		
		//13. ORM -> 
		
		//@Entity
		//@Table("name")
		
		
		//Employee(id, name) -> Dept(deptid, empid)
		
		//14.cascading 
		
		//15.SOLID -> 
		//16.Builder vs factory
		
		//Order service -> take order -> store into db -> delivery service -> payment service
		
		// post ("/createOrder") -> 5 mint
		// store into db (order Id)
		// payment service (payment Status)
		// delivery service ()

		//post create order -> send message to Kafka -> wait for 5 mints (retry after 30 secs)
		// seccussful payment -> send request to delivery service
		// post payment service -> take from user -> send mssage to kafka with payment status
		// post delivery service -> send message and mail to user.
	}
}

//interface Car {
//	void drive();
//}
//
//class Order {
//	
//}

//@Entity 
//class {
//	
//}
//@Repository 
//class OrderRepo implements JPARepository<Order, Long>{
//	
//}
//
//@Service
//class OrderService {
//	
//	@autowired
//	OrderRepo repo;
//	
//	public Order createOrder(Order order) {
//		Order order = repo.save(order);
//		return order;
////		sendMessage(order);
////		checkforPaymentStatus(order);
////		repo.save(order);
//	}
//}
//
//
//OrderRepo orderService;
//	
// void testOrderService() {
//	 Order order = new Order();
//	 Order orderNew = orderService.createOrder(order);
//	 if (orderNew.getId() != null) {
//		 
//	 }
// }
//
//@Service
//class PaymentService {
//	
//	public void paymentStatus() {
//		
//	}
//}
