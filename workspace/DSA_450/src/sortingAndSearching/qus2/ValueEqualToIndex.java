package sortingAndSearching.qus2;

import java.util.ArrayList;

public class ValueEqualToIndex {

	public static void main(String[] args) {
		int N = 5;
		int Arr[] = {15, 2, 45, 12, 7};
		System.out.println(valueEqualToIndex(Arr, N));
	}
	
	static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i == arr[i - 1]) {
                list.add(i);
            }
        }
        return list;
    }

}
