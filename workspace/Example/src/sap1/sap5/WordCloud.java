package sap1.sap5;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class WordCloud {

	public static void main(String[] args) {
		String[] str = {"ankit", "sharma", "ankit","name","is","sharma","ankit"};
		int k = 2;
		wordCloud(str, k);
	}
	
	public static void wordCloud(String[] str, int k) {
		HashMap<String, Integer> hm = new HashMap<>();
		for (int i = 0; i < str.length; i++) {
			hm.put(str[i], hm.getOrDefault(str[i], 0) + 1);
		}
		System.out.println(hm);
        List<Map.Entry<String, Integer>> list = new LinkedList<>(hm.entrySet());
 

        Collections.sort(list, (o1, o2) -> {
            return (o2.getValue()).compareTo(o1.getValue());
        });
        
        HashMap<String, Integer> temp = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        
        int i = 0;
    	for (Entry<String, Integer> entry: temp.entrySet()) {
    		System.out.println(entry);
    		i++;
    		if (i == k) {
    			break;
    		}
    	}
	}
}
