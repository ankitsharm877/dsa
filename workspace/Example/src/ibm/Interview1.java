package ibm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Interview1 {
	
	public static void main(String[] args) {
		//1.list of employees and their managers(manager also employee)
		// employee list who has greater salary than manager
		//LIst<Employee>
		//List<String> list = List.of();
		
		//List<Employee> // employee -> type
		//list.stream().collect(Collectors.)
		
		//2. map internal implementation
		//Node[];
		
		//3.String reverse
//		String str = "ankit";
//		char[] arr = str.toCharArray();
//		int i = 0;
//		int j = arr.length - 1;
//		while (i < j) {
//			char c = arr[i];
//			arr[i] = arr[j];
//			arr[j] = c;
//			i++;
//			j--;
//		}
//		System.out.println(new String(arr));
		
		String str = "abcab";
		String reversed = str.chars()
			    .mapToObj(c -> (char)c)
			    .reduce("", (s,c) -> c+s, (s1,s2) -> s2+s1);
		System.out.println(reversed);

//		HashMap<Character, Integer> hm = new HashMap<>();
//		for (char c : s.toCharArray()) {
//			hm.put(c, hm.getOrDefault(c, 0) + 1);
//		}
//		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
//			if (entry.getValue() > 1) {
//				System.out.println(entry.getKey());
//			}
//		}
	}
}
