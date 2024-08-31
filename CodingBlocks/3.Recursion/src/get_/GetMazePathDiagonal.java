package get_;

import java.util.ArrayList;

public class GetMazePathDiagonal {

	public static void main(String[] args) {
		System.out.println(getMazePathD(0, 0, 2, 2));
	}

	public static ArrayList<String> getMazePathD(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		
		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		
		ArrayList<String> mr = new ArrayList<>();
		ArrayList<String> rrh = getMazePathD(cr, cc + 1, er, ec);
		for (String rrhs : rrh) {
			mr.add("H" + rrhs);
		}
		
		ArrayList<String> rrv = getMazePathD(cr + 1, cc, er, ec);
		for (String rrvs : rrv) {
			mr.add("V" + rrvs);
		}
		
		ArrayList<String> rrd = getMazePathD(cr + 1, cc + 1, er, ec);
		for (String rrds : rrd) {
			mr.add("D" + rrds);
		}
		return mr;
	}

}
