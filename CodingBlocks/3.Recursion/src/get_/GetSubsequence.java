package get_;

import java.util.ArrayList;

public class GetSubsequence {

	public static void main(String[] args) {
		System.out.println(getSS("abc"));
		//System.out.println(getSSWASCII("ab"));
	}
	
	public static ArrayList<String> getSS(String str) {
		if (str.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		char cc = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rr = getSS(ros);
		
		for (String rrs : rr) {
			mr.add(rrs);
			mr.add(cc + rrs);
		}
		return mr;
	}
	
//	public static ArrayList<String> getSSWASCII(String str) {
//		if (str.length() == 0) {
//			ArrayList<String> baseResult = new ArrayList<>();
//			baseResult.add("");
//			return baseResult;
//		}
//		char cc = str.charAt(0);
//		String ros = str.substring(1);
//		ArrayList<String> myResult = new ArrayList<>();
//		ArrayList<String> recResult = getSS(ros);
//		for (int i = 0; i < recResult.size(); i++) {
//			myResult.add(recResult.get(i));
//			myResult.add(cc + recResult.get(i));
//			int x = (int) cc;
//		}
//		return myResult;
//	}

}
