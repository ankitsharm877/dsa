package tejas;

import java.util.List;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		//1. functional interface
		Addition addition = (a, b) -> a * b;
		
		Addition addition1 = (a, b) -> a + b;
		
//		Addition addition1 = new Addition() {
//			@Override
//			public int add(int a, int b) {
//				return a + b;
//			}
//		};
		
		System.out.println(addition.add(1, 3));
	
		// 2. stream api
		List<Integer> list = List.of(1,2,3,4);
		Stream s = list.stream();
		long a = s.count();
		long b = s.count(); // stream has already been operated upon or closed
		
		System.out.println(a + "," + b);
		
//		UI -> Table (employee ->)
//		retrieve data and display in table with some sorting
		
		//3. how to run threads sequentially in java
		
	}
}

@FunctionalInterface
interface Addition {
	int add(int a, int b);
	//int add1(int a, int b);
}


