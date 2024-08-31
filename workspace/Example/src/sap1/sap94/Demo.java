package sap1.sap94;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class Demo {
	
	public static void main(String[] args) {
		int a = 123;
		String.valueOf(a);
		String str = a + "";
//		
		int x = Integer.valueOf(str);
		Integer.parseInt(str);
		
//		int x = (int) str;
//		'a' = 97
		//"sadfsf"
		
		String str1 = "abcdABCDabcdABCD";
		str1.replaceAll("a", "");
		str1.replaceAll("A", "");

		StringBuilder sb = new StringBuilder();

		for(char c : str1.toCharArray()) {
			if (c != 'a') {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());


		List<Integer> numbers = List.of(3,7,5,9,10);
		numbers.contains(Integer.valueOf(9));

		Optional<Integer> opt =  numbers.stream().filter(b -> b == 9).findAny();

		if (opt.isPresent()) {
			System.out.println(opt.get());
		}

		HashMap<Integer, Integer> hm = new HashMap<>();
		hm.put(1,2);

		//Generic

//		Class<T> {
//
//		}

//		Class Add<T> {
//			T a;
//			T b;
//
//			A(T a, T b) {
//			}
//
//			T add() {
//			return a + b;
//			}
//		}

//		A<Integer> a = new A<>(1.0,2.0);
//		Syso(a.add());


		//Select * from table1 into table2

//		Table(Id)
//		Table(Name, email)
//
//		Select t.1name , t1.email where table t1, table t2 where t1,name = t2.name;
//
//		Select name, count(email) from table group by name
//
//		Select id from table order by desc limit 1
//
//		Select id, name, profile, city from employee e inner join emp_details  ed on e.id == ed.id where e.profile like ‘%Dev%’;
//
//		Count of dev per city
//
//		Select city, count(profile) From (Select id, name, profile, city from employee e inner join emp_details  ed on e.id == ed.id where e.profile = ‘Developer’) group by city  having count(profile) > 5;
//
//		nolock

		
	}
}

//abstract class AC {
////	abstract void sum();
//}
//
//interface IF {
//	void sum();
//}

//static & non static 
//Wrapper int , Integer
//long , Long 
