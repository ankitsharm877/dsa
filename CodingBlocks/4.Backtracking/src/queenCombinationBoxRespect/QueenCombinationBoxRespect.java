package queenCombinationBoxRespect;

public class QueenCombinationBoxRespect {

	public static void main(String[] args) {
		boolean[] boxes = new boolean[4];
		queenCombinationBoxRespect(boxes, 0, 0, 2, "");
	}

	public static void queenCombinationBoxRespect(boolean[] boxes, int col, int qpsf, int tq, String ans) {
		// positive bc
		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}
		// negative bc
		if (col == boxes.length) {
			return;
		}
		//place
		boxes[col] = true;
		queenCombinationBoxRespect(boxes, col + 1, qpsf + 1, tq, ans + "b" + col);
		boxes[col] = false;
		
		//not place
		queenCombinationBoxRespect(boxes, col + 1, qpsf, tq, ans);
	}

}
