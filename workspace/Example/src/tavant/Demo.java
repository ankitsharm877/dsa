package tavant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class Demo {

	public static void main(String[] args) {
		// 1. new changes in memory management in java
		// 2. new changes in java 8
		
//		Given an expression string exp, write a program to examine whether the pairs 
		//and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in the given expression.
//		Input: exp = “[()]{}{[()()]()}”
//		Output: Balanced
//		Input: exp = “[(])”
//		Output: Not Balanced
		
		//String str = "[(])";
		String str = "[()]{}{[()()]()}";
		System.out.println(isBalanced(str));
		
//		Sort employee by name and salary using java 8 stream API 
		List<Employee> employees = new ArrayList<>();
		Employee e1 = new Employee("Vijay",35000);
		Employee e2 = new Employee("Abhay",50000);
		Employee e3 = new Employee("Abhay",34000);
		Employee e4 = new Employee("Chris",66000);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees = employees.stream().sorted(new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				if (!e1.name.equals(e2.name)) {
					return e1.name.compareTo(e2.name);
				} else {
					return e1.salary.compareTo(e2.salary);
				}
			}
		}).toList();
		System.out.println(employees);
		//Emp - emp_id, emp_name, sal, dept_id
		//Dept - dept_id, dept_name
		//Write a Query to display minimum salary & maximum salary based on dept_name?
		
		//select d.dept_name, min(e.sal), max(e.sal) from employee e inner join dept d where e.dept_id =  d.dept_id group by d.dept_name
		
	}
	
	public static boolean isBalanced(String str) { //[(
		Stack<Character> stack = new Stack<>();
		for (char ch : str.toCharArray()) {
			if (ch == '[' || ch == '(' || ch == '{') {
				stack.push(ch);
			} else if (ch == ']') {
				char x = stack.pop();
				if (x != '[') {
					return false;
				}
			} else if (ch == ')') {
				char x = stack.pop();
				if (x != '(') {
					return false;
				}
			} else if (ch == '}') {
				char x = stack.pop();
				if (x != '{') {
					return false;
				}
			}
		}
		return true;
	}
}

class Employee {
	String name;
	Integer salary;

	public Employee(String name, Integer salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return this.name + "," + this.salary;
	}
}


