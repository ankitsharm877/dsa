package sap1.sap92;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Interview {
	
	public static void main(String[] args) {	
//		List <Integer> list = List.of(1,2);
//		list.stream().filter(l -> a == l);
		//Employee -> Dept
		// max salary from each dept
		// salary > 5000 
		// name -> Mr. name
		List<Employee> list = new ArrayList<>();
		Employee e1 = new Employee("Ankit", 5000d, "d1");
		list.add(e1);
		Employee e2 = new Employee("Nikki", 6000d, "d2");
		list.add(e2);
		Employee e3 = new Employee("Sharma", 4000d, "d2");
		list.add(e3);
		System.out.println(list.stream()
				.collect(Collectors.groupingBy(emp -> emp.dept(), 
						Collectors.filtering(e -> e.salary() > 5000, 
								Collectors.mapping(emp2 -> "Mr." + e2.name() , Collectors.toList())))));
		
		
		//System.out.println(list.stream().collect(Collectors.groupingBy(emp -> emp.dept(), Collectors.counting())));
		System.out.println(list.stream()
				.collect(Collectors.groupingBy(emp -> emp.dept(), 
						Collectors.maxBy(Comparator.comparing(Employee::salary)))));
		System.out.println(list.stream()
				.collect(Collectors.groupingBy(emp -> emp.dept(), Collectors.partitioningBy(s -> s.salary() >= 5000))));

		// select name from employee where salary == (select max(salary) as salary from employee group by dept) ;
	}
}

record Employee(String name, Double salary, String dept) {

	Employee(String name, Double salary, String dept) {
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}

}
