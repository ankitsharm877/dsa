package sortingAndSearching.qus1;

import java.util.ArrayList;

public class FindFirstAndLastPosition {

	public static void main(String[] args) {
		int n=7, x= 8;
		int arr[] = { 5, 7, 7, 7, 8, 8, 8};
		System.out.println(find(arr, n, x));
	}
	
	static ArrayList<Integer> find(int arr[], int n, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = n - 1;
        while (start <= end) {
        	int mid = (end + start) / 2;
        	if (arr[mid] == x) {
        		int i = mid;
        		int j = mid;
        		while (arr[i] == x && i > 0) i--;
        		while (arr[j] == x && j < (n - 1)) j++;
        		if (i < j) {
        			if (i == 0) {
        				list.add(i);
        			} else {
        				list.add(i + 1);
        			}
        			
        			if (j == (n - 1))
        				list.add(j);
        			else 
        				list.add(j - 1);
            		return list;
        		} else if (i == j){
        			list.add(i);
        	        list.add(i);
        	        return list;
        		}
        	} else if (arr[mid] > x) {
        		end = mid - 1;
        	} else {
        		start = mid + 1;
        	}
        }
        list.add(-1);
        list.add(-1);
        return list;
    }

}
