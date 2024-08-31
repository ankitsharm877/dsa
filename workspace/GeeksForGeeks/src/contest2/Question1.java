package contest2;

public class Question1 {

	public static void main(String[] args) {
		int n = 1;
		int[] arr = {1,2,3};
		System.out.println(classArrangement(n, arr));
	}

	public static boolean classArrangement(int n, int[] arr) {
		boolean flag = true;
        int x = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                int temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
                x++;
            }
            if (x > n) {
                return false;
            }
        }
        if (x == n) {
        	return true;        	
        } else {
        	return false;
        }
    }
}
