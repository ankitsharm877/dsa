package oracle2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;

public class Round1 {

	public static void main(String [] args) {
    
		int offset = 0,limit = 100;
		//100, 200
		List<Page> list = new ArrayList<>();
		//for (int i = 0; I < 5; I ++) {
//			ThreadLocal tl = new ThreadLocal();
//			ExecutorService  service
//			Public void run() {
//				fetchData(offset, limit);
//			}
//			List.add(new Page(offset, limit);
//			Offset += 100;
//			Limit += 100;
		//}
		
		// 1.how much thread it will create in parallel stream and Spliterator
		//list.parallelStream().map(data -> fetchData(data.offset, data,limit)).collect(Collectors.toList());

//		@Async
//		fetchData(int offset, int limit) {
//			// Executor -> 10 threads
//		}

//		Employee 
//		(name, salary, department)
//		-> sum of salary of those employee whose department  is devops
//
//		Int sum = List.stream().filter(l -> l.getDepartment().equals("devops")).reduce(0, (a, b) -> a.getSalary() + b.getSalary());
//
//		Select department, sum(salary) as totalSalary from employee group by department
//
//		Select * from employee where salary > 1000;
//		Create index nameI table employee (salary);

		
		//2. Max possible product of any two integer in an array
//		Int[] nums = {1,2,3,4,5};
//		//Arrays.sort(nums);
//
//		Int I = 0;
//		Int j = nums.length - 1;
//		Int ans = Integer.MIN_VALUE;
//		While (I < j) {
//			If (nums[i] * nums[j] > ans) { // O(n)
//				Ans = nums[i] * nums[j] ;
//			} else If (nums[i] * nums[j] < ans) {
//				i++;
//			} else {
//				
//			}
//		}
//		Return ans;


		//3. Patch Mapping use for and if wanted to update only one field
//		@GetMapping("/employee/{pageNumber}/{PageSize}")
//		getAllEmployee()
//		PageRequest pr = Page.of(pageNumber, PageSize);
//		findAll(pr);
//		@GetMapping("/employee/{id}")
//		getEmployee(@PathVariable int id)
//		@PostMapping("/employee")
//		createEmployee(@RequestBody() Employee employee)
//		@PutMapping("/employee/{id}")
//		updateEmployee(@PathVariable int id, @RequestBody() Employee employee) 
//		{
//			Employe emp = getEmployee(id);
//			If () {
//			Emp.setName()
//			}
//		}
//		@PatchMapping()
//		@DeleteMapping("/employee/{id}")
//		deleteEmployee(@PathVariable int id)

		//4. Idempotent in spring boot
		//5. @Projection annotation in spring boot
		

    }
}

//Class Employee {
//	Department dept;
//}


class Page {
	int offset;
	int limit;
	Page(int offset, int limit) {
		this.offset = offset;
		this.limit = limit;
	}
}