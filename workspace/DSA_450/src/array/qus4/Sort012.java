package array.qus4;

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0, 2, 1, 2, 0,2,1,2,0,0,0};
		sorting(arr, arr.length);
		for (int i : arr) {
			System.out.print(i);
		}
	}
	
	public static void sorting(int[] arr, int n) {
		int l = 0;
		int m = 0;
		int h = n - 1;
		while (m <= h) {
			if (arr[m] == 0) {
				swap(arr, m, l);
				m++;
				l++;
			} else if (arr[m] == 1) {
				m++;
			} else {
				swap(arr, m, h);
				h--;
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int x = arr[i];
		arr[i] = arr[j];
		arr[j] = x;
	}

}
