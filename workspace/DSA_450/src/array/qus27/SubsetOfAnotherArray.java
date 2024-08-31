package array.qus27;

import java.util.HashMap;

public class SubsetOfAnotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String isSubset(long a1[], long a2[], long n, long m) {
		if(n<m) return "No";
		HashMap<Long, Integer> hm = new HashMap<>();
		for (int i = 0; i < n; i++) {
			hm.put(a1[i], hm.getOrDefault(a1[i], 0) + 1);
		}
		int count = 0;
		int noSubset = 1;
		for (int i = 0; i < m; i++) {
			if (hm.containsKey(a2[i]) && hm.get(a2[i]) >= 1) {
				count++;
				hm.put(a2[i], hm.get(a2[i]) - 1);
				noSubset = 0;
			}
		}
		if (noSubset == 1) {
			return "No";
		}
		if (count == n || count == m) {
			return "Yes";
		} else {
			return "No";
		}
	}

}
