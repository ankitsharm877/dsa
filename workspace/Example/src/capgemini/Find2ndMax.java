package capgemini;

public class Find2ndMax {

	public static void main(String[] args) {
		//find second max element from the array
		int[] array ={1,2,3,4,8,9,6,5,7};
		System.out.println("Second max:" + findSecondMax(array));
	}

	public static int findSecondMax(int[] array) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int val : array) {
			if (val > max1) {
				max2 = max1;
				max1 = val;
			}
		}
		return max2;
	}
}
