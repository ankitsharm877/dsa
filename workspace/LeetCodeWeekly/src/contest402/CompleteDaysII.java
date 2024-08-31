package contest402;

public class CompleteDaysII {

	public static void main(String[] args) {
		int[] hours = {12,12,30,24,24};
		System.out.println(countCompleteDayPairs(hours));

	}
	
	public static long countCompleteDayPairs(int[] hours) {
		long ans = 0;
        int[] count = new int[24];
        for (int hour : hours) {
             ans += count[(24 - hour % 24) % 24];
             count[hour % 24]++;
        }
        return ans;
    }

}
