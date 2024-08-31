package array.qus20;

public class RearrangeArray {

	public static void main(String[] args) {
		int arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}; //{1, 2, 3, -4, -1, 4}; 
		//{-4, 1, 2, 3, -1, 4}
		//Output: arr[] = {-4, 1, -1, 2, 3, 4}
		rearrange(arr);
		display(arr);
	}
	
	public static void rearrange(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			if (arr[i] >= 0) {
				int j = i + 1;
				while (j < arr.length && arr[j] >= 0) j++; 
				if (j < arr.length) {
					int x = arr[j]; // -1
					while (j > 0 && j > i) { arr[j] = arr[j - 1]; j--;}
					arr[i] = x;
				}
				i = i + 2;
			} else {
				i++;
				int j = i + 1;
				while (j < arr.length && arr[j] < 0) j++; 
				if (j < arr.length) {
					int x = arr[j]; // -1
					while (j > 0 && j > i) { arr[j] = arr[j - 1]; j--;}
					arr[i] = x;
				}
				i++;
			}
		}
	}
	
	public static void display (int[] arr) {
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}

}
