package cardinalHealth;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		String inputString = "Session on a Java class for training";
		Character[] arr = new Character[inputString.length()];
		int i = 0;
		for (char ch : inputString.toCharArray()) {
			arr[i++] = ch;
		}
		
		Map<Character, Long> collect = Arrays.asList(arr).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
		List<Entry<Character, Long>> list = collect.entrySet().stream().filter(entry -> entry.getValue() == 1).collect(Collectors.toList());
		System.out.println(list);
		
		//empId, emp name, salary, dob, location
		//age is less 25 and salary > 1 lakh
		
	}
	
	
}