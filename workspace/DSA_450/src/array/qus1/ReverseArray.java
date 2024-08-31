package array.qus1;

public class ReverseArray {

	public static void main(String[] args) {
		int[] original_array = {1, 2, 3, 4, 5};
		original_array = reverse(original_array, 0, 4);
		original_array = reverse1(original_array);
		for (int index = 0; index < original_array.length; index++) {
			System.out.println(original_array[index]);
		}
	}
	
	static int[] reverse(int[] array, int start, int end) {
		while (start < end) {
			int x = array[start];
			array[start] = array[end];
			array[end] = x;
			start++;
			end--;
		}
		return array;
	}

	static int[] reverse1(int[] a) {
		int[] b = new int[a.length];
		for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
			b[i] = a[j];
		}
		for (int i = 0; i < a.length; i++) {
			a[i] = b[i];
		}
		return a;
	}
}
