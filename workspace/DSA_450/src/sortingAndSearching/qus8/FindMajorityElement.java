package sortingAndSearching.qus8;

import java.util.HashMap;

public class FindMajorityElement {

	public static void main(String[] args) {
		int N = 5;
		int A[] = {3,1,3,3,2};
		System.out.println(majorityElement(A, N));
	}

	static int majorityElement(int a[], int size) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < size; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 0);
			}
		}
		for (int i = 0; i < size; i++) {
			if (map.get(a[i]) >= (size/2)) {
				return a[i];
			}
		}
        return -1;
	}
}
