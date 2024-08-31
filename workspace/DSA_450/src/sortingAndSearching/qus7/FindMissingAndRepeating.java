package sortingAndSearching.qus7;

public class FindMissingAndRepeating {

	public static void main(String[] args) {
		int N = 2;
		int Arr[] = {2, 2};
		int[] res = findTwoElement(Arr, N);
		System.out.println(res[0]);
		System.out.println(res[1]);
	}
	static int[] findTwoElement(int arr[], int n) {
		int[] res = new int[2];
		int[] countArr = new int[n];
		for (int i = 0; i < n; i++) {
			countArr[--arr[i]]++;
		}
		for (int i = 0; i < n; i++) {
			if (countArr[i] == 0) {
				res[1] = i + 1;
			} else if (countArr[i] > 1) {
				res[0] = i + 1;
			}
		}
		return res;
	}

}
