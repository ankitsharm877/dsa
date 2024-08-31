package nQueens;

public class NQueens {

	public static void main(String[] args) {
		boolean[][] board = new boolean[4][4];
		//nQueens(boxes, 0, 0, 0, 4, "");
		//nQueens2(boxes, 0, 0, 4, "");
		kQueens(board, 0, 0, 3, "");
	}
	
	public static void nQueens(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
		// positive bc
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		// manually variables change
		if (col == board[0].length) {
			row++;
			col = 0;
		}
		
		// negative bc
		if (row == board.length) {
			return;
		}
		//place
		if (isItSafeToPlaceTheQueen(board, row, col)) {
			board[row][col] = true;
			nQueens(board, row + 1, 0, qpsf + 1, tq, ans + " {" + row + "," + col + "}");
			board[row][col] = false; // undo
		}
		
		//not place
		nQueens(board, row, col + 1, qpsf, tq, ans);
	}
	
	public static void nQueens2(boolean[][] board, int row, int qpsf, int tq, String ans) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		
		if (row == board.length) {
			return;
		}
		
		for (int col = 0; col < board[0].length; col++) {
			if (isItSafeToPlaceTheQueen(board, row, col)) {
				board[row][col] = true;
				nQueens2(board, row + 1, qpsf + 1, tq, ans + "{" + row + "-" + col + "}");
				board[row][col] = false;
			}
		}
	}
	
	public static void kQueens(boolean[][] board, int row, int qpsf, int tq, String ans) {
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		
		if (row == board.length) {
			return;
		}
		
		// place
		for (int col = 0; col < board[0].length; col++) {
			if (isItSafeToPlaceTheQueen(board, row, col)) {
				board[row][col] = true;
				kQueens(board, row + 1, qpsf + 1, tq, ans + "{" + row + "-" + col + "}");
				board[row][col] = false;
			}
		}
		
		//not place
		kQueens(board, row + 1, qpsf, tq, ans);
	}
	
	public static boolean isItSafeToPlaceTheQueen(boolean[][] board, int row, int col) {
		// vertically upward
		int r = row - 1;
		int c = col;
		while (r >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
		}
		
		// horizontally left
		r = row;
		c = col - 1;
		while (c >= 0) {
			if (board[r][c]) {
				return false;
			}
			c--;
		}
		
		// diagonally left
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c--;
		}
	
		// diagonally right
		r = row - 1;
		c = col + 1;
		while (r >= 0 && c < board[0].length) {
			if (board[r][c]) {
				return false;
			}
			r--;
			c++;
		}
		
		return true;
	}

}
