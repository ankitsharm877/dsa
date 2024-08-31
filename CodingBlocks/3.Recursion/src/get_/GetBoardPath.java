package get_;

import java.util.ArrayList;

public class GetBoardPath {

	public static void main(String[] args) {
		System.out.println(getBoardPath(0, 2));
	}
	
	public static ArrayList<String> getBoardPath(int curr, int end) {
		if (curr == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		
		if (curr > end) {
			ArrayList<String> br = new ArrayList<>();
			//br.add("");
			return br;
		}
		
		ArrayList<String> mr = new ArrayList<>();
		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> rr = getBoardPath(curr + dice, end);
			for (String rrs : rr) {
				mr.add(dice + rrs);
			}
		}
		return mr;
	}

}
