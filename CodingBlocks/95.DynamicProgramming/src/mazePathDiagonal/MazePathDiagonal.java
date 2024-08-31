package mazePathDiagonal;

import java.util.Arrays;

public class MazePathDiagonal {

	public static void main(String[] args) {
		int n = 5000;
		//System.out.println(mazePathDiagonalRecursive(0, 0, n, n));
		//System.out.println(mazePathDiagonalTD(0, 0, n, n, new int[n + 1][n+ 1]));
		System.out.println(mazePathDiagonalBU(n, n));
		System.out.println(mazePathBUSE(n, n));
	}
	
	public static int mazePathDiagonalRecursive(int cr, int cc, int er, int ec) {
		if (cr == er && cc == ec) {
			return 1;
		}
		
		if (cr > er || cc > ec) {
			return 0;
		}
		
		int ch = mazePathDiagonalRecursive(cr, cc + 1, er, ec);
		int cv = mazePathDiagonalRecursive(cr + 1, cc, er, ec);
		int cd = mazePathDiagonalRecursive(cr + 1, cc + 1, er, ec);
		return ch + cv + cd;
	}

	
	public static int mazePathDiagonalTD(int cr, int cc, int er, int ec, int[][] memory) {
		if (cr == er && cc == ec) {
			return 1;
		}
		
		if (cr > er || cc > ec) {
			return 0;
		}
		
		if (memory[cr][cc] != 0) {
			return memory[cr][cc];
		}
		
		int ch = mazePathDiagonalTD(cr, cc + 1, er, ec, memory);
		int cv = mazePathDiagonalTD(cr + 1, cc, er, ec, memory);
		int cd = mazePathDiagonalTD(cr + 1, cc + 1, er, ec, memory);
		memory[cr][cc] = ch + cv + cd;
		return ch + cv + cd;
	}
	
	public static int mazePathDiagonalBU(int er, int ec) {
		int[][] table = new int[er + 2][ec + 2];
		
		for (int row = er; row >= 0; row--) {
			for (int col = ec; col >= 0; col--) {
				if (row == er && col == ec) {
					table[row][col] = 1;
				} else {
					table[row][col] = table[row][col + 1] + table[row + 1][col] + table[row + 1][col + 1];
				}
			}
		}
		return table[0][0];
	}
	
	public static int mazePathBUSE(int er, int ec) {
		int[] table = new int[ec + 1];
		Arrays.fill(table, 1);
		int diag = 0;
		for (int slide = er - 1; slide >= 0 ; slide--) {
			for (int col = ec; col >= 0 ; col--) {
				if (col == ec) {
					table[col] = 1;
					diag = 1;
				} else {
					int val = table[col] + table[col + 1] + diag;
					diag = table[col];
					table[col] = val;
				}
			}
		}
		return table[0];
	}
}
