package zenAndart;

import java.util.ArrayList;
import java.util.List;

public class Round1 {

	public static void main(String[] args) {
		// stream API highest paid employee in each dept
		
//		list.streams().collect(Collectors.groupingBy(Employee::getDept()), 
//				Collectors.maxBy((e1, e2) -> e2.getSalary() - e1.getSalary()), Collectors.toList());
		
		// str = "abc";
		// abc, acb, bca, bac, cab, cba
		String str = "abc";
		permutation(str);
		
		
	}
	//c
	public static List<String> permutation(String str) {
		if (str.length() == 0) {
			List<String> ar = new ArrayList<>();
			ar.add("");
			return ar;
		}
		//List<String> output = new ArrayList<>();
		char ch = str.charAt(0); // a, b, c
		String rstr = str.substring(1); // bc, c, ''
		//c
		//bc, cb
		// abc, bca, bac, acb, cab, cba
		List<String> result = permutation(rstr); // '', c
		for (String s : result) {
			result.add(ch + s); // ""
			result.add(s + ch); // cb
		}
		return result;
	}
}

class Singleton {
	private static Singleton instance = null;
	
	private Singleton() {
		
	}
	
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}

//@Pipe(selector = "customPipe")
//class CustomPipe implements PipeTransform {
//	
//	transform(input: string): string {
//		split(" ")
//	}
//}

