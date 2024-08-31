package sql;

import java.util.Arrays;
import java.util.List;

public class SqlDemo {

	public static void main(String[] args) {
		// inner join
		List<Integer> s1 = Arrays.asList(1, 2, 4);
		List<Integer> s2 = Arrays.asList(1, 3, 2);
		 
		s1.stream()
		  .flatMap(v1 -> s2.stream().filter(v2 -> v2.equals(v1)))
		  .forEach(System.out::println);

	}

}
