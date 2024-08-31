package nKnights;

public class NKnights {

	public static void main(String[] args) {
		nKnights(new boolean[3][3], 0, 0, 0, 3, "");
	}

	public static void nKnights(boolean[][] board, int row, int col, int kpsf, int tk, String ans) {
		if (kpsf == tk) {
			System.out.println(ans);
			return;
		}
		
		if (col == board[0].length) {
			row++;
			col = 0;
		}
		
		if (row == board.length) {
			return;
		}
		
		//place
		if (isItSafeToPlaceTheKnight(board, row, col)) {
			board[row][col] = true;
			nKnights(board, row, col + 1, kpsf + 1, tk, ans + "{" + row + "-" + col + "}");
			board[row][col] = false;
		}
		// not place
		nKnights(board, row, col + 1, kpsf, tk, ans);
	} 
	
	public static boolean isItSafeToPlaceTheKnight(boolean[][] board, int row, int col) {
		int[] rowArr = {-1, -2, -2, -1};
		int[] colArr = {2, 1, -1, -2};
		for (int i = 0; i < 4; i++) {
			int r = row + rowArr[i];
			int c = col + colArr[i];
			if (r >= 0 && r < board.length && c >= 0 && c < board[0].length) {
				if (board[r][c]) {
					return false;
				}
			}
		}
		return true;
	}
}
