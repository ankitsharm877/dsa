package epam;

import java.util.HashMap;

public class Interview2 {

	public static void main(String[] args) {
		//1. Promise vs Obersable
		//2. RxJS
		//3. Pipes
		//4. DOM sanitization
		
		// 5. Fail Fast and Fail Safe Iterators in Java - done
		// 6. Marker Interface - done
		// 7. Functional Interface - done
		// 8. Serialization - done
		// 9. Externalization - done
		// 10. Spring scope - done
		// 11. Difference between Prototype vs Session - done
		// 12. Predicate Vs Function - done
		// 13. @SpringBootApplication is combination of - done
		// 14. @Entity vs @Table
		// 15. Get() vs Load() method
		// 16. Spring security
		// 17. Client Side load balancing - done
		// 18. Saga pattern - done 
		// 19. revert vs rebase - done 
		// 20. revert vs reset 
		// 21. JWT token
		// 22. Pure pipes vs impure pipes - done
		// 23. Example of default method - done
		// 24. Cross Cutting Concerns (aspect) - done 
		// 25. ControllerAdvice - done
		// 26. Joint point
		// 27. angular life cycles method - done
		// 28. Map Vs FlatMap - done
		
		
		
		// str1, str2
		// same char and same freq 
		//two string are Anagram or not
		String str1 = "ppek";
		String str2 = "kepp";
		System.out.println(check(str1, str2));
	}
	
	public static boolean check(String str1, String str2) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char c : str1.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0) + 1);
		}
		for (char c : str2.toCharArray()) {
			if (hm.containsKey(c)) {
				int x = hm.get(c);
				x--;
				if (x == 0) {
					hm.remove(c);
				} else {
					hm.put(c, x);
				}
			} else {
				return false;
			}
		}
		return hm.isEmpty();
	}

}
