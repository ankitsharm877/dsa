package axisbank;

public class Demo {
	
	public static void main(String[] args) {
	
		String s = "1234";
		//System.out.println(parseInt(s));
		
		int[] arr = {1,0,0,1,0,0,0,1,0,0,1,0,1,1,1,1,0};
		//int[] arr = {0,0,0,1};
		
		// print max 
		System.out.println(printOne(arr));
	}
	
	public static int parseInt(String str) {
		int ans = 0;
		for (char ch : str.toCharArray()) {
			ans = ans * 10 + (ch - '0');
		}
		return ans;
	}
	
	public static int printOne(int[] arr) {
		int max = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++;
				max = Math.max(max, count);
//				if ((i + 1) == arr.length) {
//					max = Math.max(max, count);
//				}
			} else {	
				count = 0;
			}
			
		}
		return max;
	}
}