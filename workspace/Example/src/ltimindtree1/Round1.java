package ltimindtree1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Round1 {

	public static void main(String[] args) {
		// find the duplicate from int array
		Integer[] arr = {1,2,3,2,4,5,5};
		Map<Integer, Long> collect = Arrays.asList(arr).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
		List<Entry<Integer, Long>> list = collect.entrySet().stream().filter(a -> a.getValue() > 1).toList();
		System.out.println(list);
		
		// print all possible "abc"
		//abc, bca, 
//		a , "bc" -> "abc", "bac", "bca"
//		b, "ac" -> "bac" ,"abc", "acb"
//	
	}
}
	
