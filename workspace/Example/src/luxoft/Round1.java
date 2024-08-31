package luxoft;

import java.util.Arrays;
import java.util.List;

public class Round1 {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,2,3,4,5};
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list);
		
		list.stream().filter(a -> a % 2 == 1).forEach(b -> System.out.print(b + ","));
		System.out.println(list.stream().filter(a -> a % 2 == 1).reduce((a, b) -> a + b));
		//orelse orelseget
//		DECLARE OR REPLACE PROCEDURE PROC_NAME (IN var1 INT, IN var2 VARCHAR2, OUT res TABLE_NAME)
//		BEGIN 
//		
//		DECALRE var4 INT;
//			
//		END;
		
//		emp_number	name		Salary	dept_id
//
//		1002		Anderson	57500	500
//
//		1004		Horvath		42000	501
//
//		1001		Smith		62000	500
//
//		1003		Everest		71000	501
//
//		1005		James		50000	501
		

		//select dept_id, sum(salary) from employee group by dept_id having sum(salary) > 10000;
		
		
		
	}
}

