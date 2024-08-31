package Synechron;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		
		String str = "dhnd^^  &&&&&   $$$3288e?";
		// count of special character
	
		Map<Object, Long> collect = str.chars().filter(ch -> !Character.isAlphabetic(ch) && !Character.isDigit(ch) && ch != ' ')
		.boxed().collect(Collectors.groupingBy(ch -> Character.toString(ch), Collectors.counting()));
		System.out.println(collect);
		
		List<Integer> list = Arrays.asList(10,34,67,91,10001,62,11);
		//10, 10001, 11
		
		list = list.stream().filter(val -> String.valueOf(val).startsWith("1")).toList();
		System.out.println(list);
	}
}

//class Singleton implements Serializable{
//
//    private static Singleton instance;
//
//    private Singleton() {
//        if (instance != null) {
//           // throw new Exception("");
//        }
//    }
//
//    public static Singleton getInstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
//    
//}

