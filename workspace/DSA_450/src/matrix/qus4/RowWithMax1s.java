package matrix.qus4;

public class RowWithMax1s {

	public static void main(String[] args) {
		

	}
	
	int rowWithMax1s(int arr[][], int n, int m) {
        int index = -1;
        int max = 0;
		for (int i = 0; i < n; i++) {
			int temp = 0;
			for (int j = 0; j < m; j++) {
				temp += arr[i][j];
			}
			if (temp > max) {
				max = temp;
				index = i;
			}
		}
		return index;
    }

}
