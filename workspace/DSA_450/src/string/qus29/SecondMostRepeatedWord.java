package string.qus29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class SecondMostRepeatedWord {

	public static void main(String[] args) {
		int N = 6;
		String arr[] = {"aaa", "bbb", "ccc", "bbb", "aaa", "aaa"};
		System.out.println(secFrequent(arr, N));
	}
	
	public static String secFrequent(String arr[], int N) {
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		ArrayList<Integer> list = new ArrayList<>();
		for (String i : map.keySet()) {
			list.add(map.get(i));
		}
		Collections.sort(list, Collections.reverseOrder());
		String s = "";
		for (Entry<String, Integer> entry : map.entrySet())
			if (entry.getValue() == list.get(1)) {
				s = entry.getKey();
				break;
			}
		return s;
    }

}
