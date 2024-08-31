package stryker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class Demo {

	public static void main(String [] args) {
		//Given a collection of candidate numbers (candidates) and a target number (target), 
		//find all unique combinations in candidates where the candidate numbers sum to target.
		 
		//Each number in candidates may only be used once in the combination.
		
		int[] candidates = {10,1,2,7,6,1,5};
		int target = 8;
		//Output: [[1,1,6],[1,2,5],[1,7],[2,6]]
		System.out.println(combinationSum2(candidates, target));
		
		
		//Emp --> EmpNo, Name, MgrNo.                   
		//Address -> EmpNo, Address.  - give me the list of employees with their Mgr Name and addred
//		select e3.Name, ad.address from address as ad inner join 
//		(select e1.EmpNo, e1.Name, from Emp e1 join Emp1 e2 on e1.EmpNo == e2.MgrNo) as e3
//		where ad.empNo == e3.empNo;
		//IOC
		
		
	}
	
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); // 1,1,2,5,6,7,10
        HashMap<String, Boolean> hm = new HashMap<>();
        for (int i = 0; i < candidates.length; i++) {
        	ArrayList<Integer> subAns = new ArrayList<>();
        	int total = 0;
        	for (int j = 0; j <= i; j++) { // 0
        		int k = j + 1;
        		subAns.add(candidates[j]); // 1
        		total += candidates[j];
        		while (k < candidates.length) {
        			if ((total + candidates[k]) == target) {
        				Collection<Integer> al = new ArrayList<>(subAns);
        				al.add(candidates[k]);
    					List<Integer> newAns = (List<Integer>) al;
    					Optional<String> str = al.stream().map(a -> String.valueOf(a)).reduce((a, b) -> a + "" + b);
    					if (!hm.containsKey(str.get())) {
    						hm.put(str.get(), true);
        					ans.add(newAns);
    					}
        			}
        			k++;
        		}
        	}
        }
        return ans;
    }
}