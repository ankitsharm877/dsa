package axisbank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//public class Demo {
//
//	public static void main(String[] args) {
//		List<Employee> list = new ArrayList<>();
//		
//		list.stream()
//		.collect(Collectors.groupingBy(Employee::getGender, Collectors.groupingBy(Employee::getDeptId, Collectors.counting())));
//		
//		String str = "AxisBankMumbai";
//		String output="A xi sBa nkMu mbai";
//		
//		int space = 1;
//		
//		String ans = "";
//		int count = 0;
//		for (char ch : str.toCharArray()) {
//			if (count == space) {
//				ans += " ";
//				count = 0;
//				space++;
//			}
//			ans += ch;
//			count++;
//		}
//		System.out.println(ans);
//	}
//}
//
//class Employee {
//	int id;
//	String gender;
//	String deptId;
//	
//	public String getGender() {
//		return gender;
//	}
//	
//	public String getDeptId() {
//		return deptId;
//	}
//}

//Print hierarchy from list
/**
Given a list of items with ID & ParentID print them in hierarchy
Items = [
{  “id”:17,  ”name”:”India”   , “parentId”:0  },
{  “id”:6,  ”name”:”Maharashtra”   , “parentId”:17  },
{  “id”:10,  ”name”:”Mumbai”   , “parentId”:6  },
{  “id”:78,  ”name”:”China”   , “parentId”:0  },
{  “id”:88,  ”name”:”Pune”   , “parentId”:6  },
]
Expected Output
- India
-- Maharashtra
--- Mumbai
- China
-- Si
Or
- China
-- Si
- India
-- Maharashtra
--- Mumbai

*/
 
public class Solution {

	public static void main(String args[]){
		List<Leaf> list= Arrays.asList(new Leaf(10, "Mumbai", 6)   , new Leaf(17, "India", 0) ,  new Leaf(6, "Maharashtra", 17)  
			,  new Leaf(78, "China", 0), new Leaf(88, "Pune", 6), new Leaf(14, "Thane", 10), new Leaf(89, "Bangalore", 88));
		//list.sort((l1, l2) -> l1.getParentId() - l2.getParentId());
		System.out.println(list);
		print(list, 1, 0);
	}
	static ArrayList<Integer> data = new ArrayList<>();
	
	public static void print(List<Leaf> list, int parent, int parentId) { //3, 6
		for (Leaf leaf : list) {
			if (!data.contains(Integer.valueOf(leaf.getId()))) {
				if (leaf.getParentId() == 0 && parentId == 0) {
					for (int i = 0; i < parent; i++) {
						System.out.print("-");
					}
					System.out.println(leaf.getName());
					data.add(leaf.getId());
					++parent;
					print(list, parent, leaf.getId());
					--parent;
				} else if (leaf.getParentId() == parentId) {
					for (int i = 0; i < parent; i++) {
						System.out.print("-");
					}
					System.out.println(leaf.getName());
					data.add(leaf.getId());
					++parent;
					print(list, parent, leaf.getId());
					--parent;
				}
			}
		}
	}

}

class Leaf {
	private int id;
	private String name;
	private int parentId;
	public Leaf(int id, String name, int parentId){
		this.id=id;
		this.name=name;
		this.parentId=parentId;
	}
	//Setters & Getters
	
	public String getName() {
		return this.name;
	}

	public int getParentId() {
		return this.parentId;
	}
	
	public int getId() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Leaf [id=" + id + ", name=" + name + ", parentId=" + parentId + "]";
	}
}
