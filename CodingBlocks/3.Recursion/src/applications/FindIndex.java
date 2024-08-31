package applications;

import java.util.Arrays;

public class FindIndex {

	public static void main(String[] args) {
		int[] arr = {6,8,1,1,8,3,4};
		System.out.println(firstIndex(arr, 0, 8));
		System.out.println(lastIndex(arr, 0, 8));
		System.out.println(Arrays.toString(allIndices(arr, 0, 1, 0)));
	}
	
	public static int firstIndex(int[] arr, int idx, int data) {
		if (arr.length == idx) {
			return -1;
		} else {
			if (arr[idx] == data) {
				return idx;
			} else {
				return firstIndex(arr, idx + 1, data);
			}
		}
	}
	
	public static int lastIndex(int[] arr, int idx, int data) {
		if (arr.length == idx) {
			return -1;
		}
		int index = lastIndex(arr, idx + 1, data);
		if (index == -1) {
			if (arr[idx] == data) {
				return idx;
			} else {
				return index;
			}
		} else {
			return index;
		}
	}
	
	public static int[] allIndices(int[] arr, int si, int data, int count) {
		if (si == arr.length) {
			int[] base = new int[count];
			return base;
		}
		int[] indices = null;
		if (arr[si] == data) {
			indices = allIndices(arr, si + 1, data, count + 1);
		} else {
			indices = allIndices(arr, si + 1, data, count);
		}
		if (arr[si] == data) {
			indices[count] = si;
		}
		return indices;
	}

}
