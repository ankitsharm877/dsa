package rumango;

import java.util.LinkedList;

public class Round1 {

	public static void main(String[] args) {
		
		//duplicates name 
		
//		delete from employee where name = (
//		select name, count(*) from employee group by name having count(*) > 1);
//		
//		delete from employee where name = (
//				select e1.name from employee e1 inner join employee e2 where e1.name = e2.name);
		
		//delete from employee where name != (select distinct name from employe)
//		partiton key / table
//		external tables
//		
//		column name 
		
		int K = 4, X = 35;
		int arr[] = {12, 16, 22, 30, 35, 39, 42, 45, 48, 50, 53, 55, 56};
		findKClosestElements(arr, X, K);
		
	}
	
	public static void findKClosestElements(int[] arr, int X, int K) {
		int left = 0;
        int right = arr.length - 1;
 
        while (right - left >= K) {
            if (Math.abs(arr[left] - X) > Math.abs(arr[right] - X)) {
                left++;
            } else {
                right--;
            }
        }
 
        // Print the k closest elements
        while (left <= right) {
            System.out.print(arr[left] + " ");
            left++;
        }
	}
	
	
	//30 39 42 45
	public static void binaryS(int[] arr, int X, int K) {
		LinkedList<Integer> ans = new LinkedList<>();
		int low = 0; 
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == X) {
				int i = mid - 1;
				int j = mid + 1;
				int count = 0;
				while (i >= 0 && j < arr.length - 1) {
					if (Math.abs(arr[i] - X) < Math.abs(arr[j] - X)) { // 5 < 4
						ans.addFirst(arr[i]);
						i--;
					} else {
						ans.addLast(arr[j]);
						j++;
					}
					count++;
					if (count == K) {
						System.out.println(ans);
						return;
					}
				}
			} else if (X < arr[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
	}
	

}
