package queenPermutation;

public class QueenPermutation {

	public static void main(String[] args) {
		boolean[] board = new boolean[4];
		queenPermutation(board, 0, 2, "");
	}

	static int count = 0;
	public static void queenPermutation(boolean[] board, int qpsf, int tp, String ans) {
		if (qpsf == tp) {
			count++;
			System.out.println(count + "." + ans);
			return;
		}
		for (int i = 0; i < board.length; i++) {
			if (!board[i]) {
				board[i] = true;
				queenPermutation(board, qpsf + 1, tp, ans + "q" + qpsf + "b" + i);
				board[i] = false;
			}
		}
	}
}
