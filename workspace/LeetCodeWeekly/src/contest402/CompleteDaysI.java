package contest402;

public class CompleteDaysI {

	public static void main(String[] args) {
		int[] hours = {12,12,30,24,24};
		System.out.println(countCompleteDayPairs(hours));

	}
	
	public static int countCompleteDayPairs(int[] hours) {
        int ans = 0;
        for (int i = 0; i < hours.length; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                if ((hours[i] + hours[j]) % 24 == 0) {
                    ans++;
                }
            }
        }
        return ans;
    }

}
