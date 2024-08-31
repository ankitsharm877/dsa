package zenAndart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		// List<String> -> List<String>
		// port number aggregation
		// 
		String[] arr = {"1-1", "1-5", "3-6"};
		//String[] arr = {"1", "2", "3"};
		List<String> list = Arrays.asList(arr);
		portNumberAggr(list);
		// out -> 1-5
		
		// 1, 2, 3, 4, 5 -> 1-5
		// 1, 4, 5 -> 1, 4-5
	}
	
	public static List<String> portNumberAggr(List<String> list) {
		List<String> ans = new ArrayList<>();
		
		// map -> List<Range> 
		
		
		
//		for (int i = 0; i <  list.size(); i++) {
//			if (!list.get(i).contains("-")) {
//				list.set(i, list.get(i) + "-" + list.get(i));
//			}
//		}
		
//		List<String> numbers = list.stream().filter(a -> !a.contains("-")).collect(Collectors.toList());
//		List<String> ranges = list.stream().filter(a -> a.contains("-")).collect(Collectors.toList());
//		
//		Collections.sort(numbers);
//		System.out.println(numbers);
//		String range = "";
//		for (int i = 1; i < numbers.size(); i++) {
//			int x = Integer.parseInt(numbers.get(i - 1));
//			int y = Integer.parseInt(numbers.get(i));
//			if (y - x == 1) {
//				range = range.isEmpty() ? (x + "-" + y) : range.substring(0, range.length() - 1) + y;
//			} else {
//				ranges.add(range);
//			}
//		}
//		if (!range.isEmpty()) {
//			ranges.add(range);
//		}
//		
//		Collections.sort(ranges);
//		for (int i = 1; i < ranges.size(); i++) {
//			String r1 = ranges.get(i - 1);
//			String r2 = ranges.get(i);
//			
//			int x = Integer.parseInt(r1.charAt(0) + "");
//			int y = Integer.parseInt(r1.charAt(r1.length() - 1) + "");
//			
//			int z = Integer.parseInt(r2.charAt(0) + "");
//			if (z >= x  && z <= y) {
//				r1 = r1.substring(0 , r1.length() - 1) + r2.charAt(r2.length() - 1);
//				//ans.add(r1);
//			}
//		}
//		System.out.println(ranges);
		return ans;
	} 
	
}

class Range {
	int start;
	int end;
}
	
