package mazePath;

import java.util.Arrays;

public class MazePath {

	public static void main(String[] args) {
		int n = 2;
		//System.out.println(mazePathRecursive(0, 0, n, n));
		//System.out.println(mazePathTD(0, 0, n, n, new int[n + 1][n + 1]));
		System.out.println(mazePathBU(n, n));
		System.out.println(mazePathBUSE(n, n));
	}
	
	public static int mazePathRecursive(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		int ch = mazePathRecursive(cr, cc + 1, er, ec);
		int cv = mazePathRecursive(cr + 1, cc, er, ec);
		return ch + cv;
	}
	
	public static int mazePathTD(int cr, int cc, int er, int ec, int[][] memory) {
		if (cr == er && cc == ec) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}
		if (memory[cr][cc] != 0) {
			return memory[cr][cc];
		}
		int ch = mazePathTD(cr, cc + 1, er, ec, memory);
		int cv = mazePathTD(cr + 1, cc, er, ec, memory);
		memory[cr][cc] = ch + cv;
		return ch + cv;
	}
	
	public static int mazePathBU(int er, int ec) {
		int[][] table = new int[er + 2][ec + 2];
		for (int row = er; row >= 0; row--) {
			for (int col = ec; col >= 0; col--) {
				if (row == er && col == ec) {
					table[row][col] = 1;
				} else {
					table[row][col] = table[row][col + 1] + table[row + 1][col];
				}
			}
		}
		return table[0][0];
	}
	
	public static int mazePathBUSE(int er, int ec) {
		int[] table = new int[ec + 1];
		Arrays.fill(table, 1);
		for (int slide = er - 1; slide >= 0; slide--) {
			for (int col = ec; col >= 0; col--) {
				if (col == ec) {
					table[col] = 1;
				} else {
					table[col] = table[col] + table[col + 1];
				}
			}
		}
		return table[0];
	}

}
