package sortingAndSearching.qus14;

public class MergeTwoSorted {

	public static void main(String[] args) {
		int arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8};
		int res[] = mergeSortedArray(arr1, arr2);
		for (int a: res) {
			System.out.println(a);
		}
	}
	
	public static int[] mergeSortedArray(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length +  arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				arr3[k++] = arr1[i++];
			} else {
				arr3[k++] = arr2[j++];
			}
		}
		while (i < arr1.length) {
			arr3[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			arr3[k++] = arr2[j++];
		}
		return arr3;
	}

}
