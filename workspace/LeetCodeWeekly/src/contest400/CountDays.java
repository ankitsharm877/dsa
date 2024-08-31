package contest400;

import java.util.Arrays;

public class CountDays {

	public static void main(String[] args) {
//		int days = 10;
//		int[][] meetings = {{5,7},{1,3},{9,10}};
		int days = 5;
		int[][] meetings = {{2,4},{1,3}};
//		int days = 6;
//		int[][] meetings = {{1,6}};
//		int days = 14;
//		int[][] meetings = {{6,11},{7,13},{8,9},{5,8},{3,13},{11,13},{1,3},{5,10},{8,13},{3,9}};
		System.out.println(countDaysI(days, meetings));

	}
	
	public static int countDays(int days, int[][] meetings) {
		Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        int count = 0;
        count += Math.abs(meetings[0][0] - 1);
        int n = meetings.length;
        for (int i = 1; i < n; i++) {
            if (meetings[i][0] <= meetings[i - 1][1]) {
                if (meetings[i][1] < meetings[i - 1][1]) {
                    meetings[i][1] = meetings[i - 1][1];
                }
            } else {
                int dy = meetings[i][0] - meetings[i - 1][1];
                count += dy - 1;
            }
        }
        count += Math.abs(meetings[n - 1][1] - days);
        return count;
    }
	
	public static int countDaysI(int days, int[][] meet) {
		Arrays.sort(meet, (a, b) -> a[0] - b[0]);
        int count=0;
        int match = meet[0][1];  // responsible to hold the highest no. till the point
        if(meet[0][0] > 1)  // after sorting if the smallest no. is greater than 1
            count += meet[0][0] - 1;
        for(int i=1;i <meet.length; i++){
            if(meet[i][0] > match)  // if there is gap between elements --> then need to add the gap
                count += meet[i][0] - match - 1;
            match = Math.max(match, meet[i][1]);
        }
        if(match < days)  // if the largest no. is smaller than the total no. of days
        	count += days-match;
        return count;
	}

}
