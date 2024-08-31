package walmart2;

import java.util.HashSet;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		int[] arr = {1,2,5,3,4};
		int n = 5;
		//System.out.println(checkAllDoor(arr, n));
		System.out.println(checkAllDoor(arr));
		
		int[] arr1 = {1,2,5,3};
		int n1 = 4;
		//System.out.println(checkAllDoor(arr1, n1));
		System.out.println(checkAllDoor(arr1));
		
		int[] arr2 = {1,1,1};
		int n2 = 3;
		//System.out.println(checkAllDoor(arr2, n2));
		System.out.println(checkAllDoor(arr2));
		// return open all door true and if not able to open all door false
	}
	
	public static boolean checkAllDoor(int[] arr, int n) { // O(n)
		HashSet<Integer> set = new HashSet<>();
		for (int val : arr) {
			set.add(val);
		}
		return set.size() == n;
	}
	
	
	public static boolean checkAllDoor(int[] arr) { // O(n)
		TreeSet<Integer> set = new TreeSet<>();
		for (int val : arr) { // O(n)
			set.add(val);
		}
		int x = 1;
		for (int val : set) { // O(n)
			if (x == val) {
				x++;
			} else {
				return false;
			}
		}
		return (x - 1) == arr.length;
	}
	
	
	
}
	
