package sorting;

public class BubbleSorting {

	public static void main(String[] args) {
		int[] A = {3,7,9,10,6,5,12,4,11,2};
		bubbleSort(A);
		display(A);
	}
	
	public static void bubbleSort(int[] arr) {
		int i, j, flag = 0;
		for (i = 0; i < arr.length - 1; i++) {
			flag = 0;
			for (j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
	}
	
	public static void display(int[] arr) {
		for (int val :  arr) {
			System.out.println(val);
		}
	}

}
