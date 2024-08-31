package queenCombinationBoxRespect2D;

public class QueenCombinationBoxRespect2D {

	public static void main(String[] args) {
		boolean[][] boxes = new boolean[4][4];
		//queenCombinationBoxRespect2D(boxes, 0, 0, 0, 2, "");
		//queenCombinationBoxRespect2DRecCall(boxes, 0, 0, 0, 2, "");
		queenCombination2DKill(boxes, 0, 0, 0, 3, "");
	}

	public static void queenCombinationBoxRespect2D(boolean[][] boxes, int row, int col, int qpsf, int tq, String ans) {
		// positive bc
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		// manually variables change
		if (col == boxes[0].length) {
			row++;
			col = 0;
		}
		
		// negative bc
		if (row == boxes.length) {
			return;
		}
		//place
		boxes[row][col] = true;
		queenCombinationBoxRespect2D(boxes, row, col + 1, qpsf + 1, tq, ans + " {" + row + "," + col + "}");
		boxes[row][col] = false; // undo
		
		//not place
		queenCombinationBoxRespect2D(boxes, row, col + 1, qpsf, tq, ans);
	}

	public static void queenCombinationBoxRespect2DRecCall(boolean[][] boxes, int row, int col, int qpsf, int tq, String ans) {
		// positive bc
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		// manually variables change
		if (col == boxes[0].length) {
			queenCombinationBoxRespect2DRecCall(boxes, row + 1, 0, qpsf, tq, ans);
			return;
		}
		
		// negative bc
		if (row == boxes.length) {
			return;
		}
		//place
		boxes[row][col] = true;
		queenCombinationBoxRespect2DRecCall(boxes, row, col + 1, qpsf + 1, tq, ans + " {" + row + "," + col + "}");
		boxes[row][col] = false; // undo
		
		//not place
		queenCombinationBoxRespect2DRecCall(boxes, row, col + 1, qpsf, tq, ans);
	}
	
	public static void queenCombination2DKill(boolean[][] board, int row, int col, int qpsf, int tq, String ans) {
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
			queenCombination2DKill(board, row, col + 1, qpsf + 1, tq, ans + " {" + row + "," + col + "}");
			board[row][col] = false; // undo
		}
		
		//not place
		queenCombination2DKill(board, row, col + 1, qpsf, tq, ans);
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
