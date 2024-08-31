package queenCombination;

public class QueenCombination {

	public static void main(String[] args) {
		boolean[] boxes = new boolean[4];
		queenCombination(boxes, 0, 2, "", -1);
	}

	//static int count = 0;
	public static void queenCombination(boolean[] boxes, int qpsf, int tp, String ans, int lastBoxUsed) {
		if (qpsf == tp) {
			//count++;
			//System.out.println(count + "." + ans);
			System.out.println(ans);
			return;
		}
		for (int i = lastBoxUsed + 1; i < boxes.length; i++) {
			//if (!boxes[i]) {
				boxes[i] = true;
				queenCombination(boxes, qpsf + 1, tp, ans + "q" + qpsf + "b" + i, i);
				boxes[i] = false; //undo
			//}
		}
	}

}
