package sortingAndSearching.qus9;

public class SearchInArrayWhereAdjDifferByK {

	public static void main(String[] args) {
		int arr[] = {4, 5, 6, 7, 6};
        int k = 1;
        int x = 6;
//		int arr[] = {20, 40, 50, 70, 70, 60};
//        int k = 20;
//        int x = 60;
        System.out.println(search(arr, k, x));
	}
	
	public static int search(int[] arr, int k, int x) {
		int index = -1;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] == x) {
				index = i;
				break;
			}
			i = i + Math.max(1, Math.abs((arr[i] - x)/ k));
		}
		return index;
	}

}
