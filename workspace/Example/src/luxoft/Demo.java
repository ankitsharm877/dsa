package luxoft;

import java.util.List;

public class Demo {

	public static void main(String[] args) {
		//List<Employee> empList = ArrayList of Employes (name, salary)
		
		//int sum = empList.stream().limit(10).reduce(0, (e1, e2) -> e1.getSalary() + e2.getSalary())
		
		List<Integer> list = List.of(1,2,5,7,9,3,4,8);

		list = list.stream().filter(e -> e % 2 == 0).sorted((a, b) -> b - a).toList();
		System.out.println(list);
		
		//list.filter(e => e % 2 == 0);
		//3.sql -> partition by 
		
//		group by 
//		having count(*) > 10
//		order by
		
//		select deptName, count(*) (select empName, deptName, deptId from employee e inner join dept d where e.deptId == d.deptId) 
//		group by deptName having count(*) > 1;
		//1.joinColumn
		//2.with keyword in SQL
		
	}
	
//	findByNameStartWith(String name)
//	
//	@Query("select * from employee where name like %%%k%", nativeQuery= true)
//	@Query("select * from Employee e")
	
}
	
