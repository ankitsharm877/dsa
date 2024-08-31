package sap1.sap9;

import java.util.Arrays;

public class SmallestRearrangedNumber {

	public static void main(String[] args) {
		long num = 310;
		System.out.println(smallestNumber(num));
	}
	
	public static long smallestNumber(long num) {
        if (num == 0) {
            return 0;
        }
        int[] cnt = new int[10];
        boolean neg = num < 0;
        num = Math.abs(num);
        while (num != 0) {
            cnt[(int) (num % 10)]++;
            num /= 10;
        }
        long ans = 0;
        if (neg) {
            for (int i = 9; i >= 0; --i) {
                while (cnt[i]-- > 0) {
                    ans = ans * 10 + i;
                }
            }
            return -ans;
        }
        if (cnt[0] > 0) {
            for (int i = 1; i < 10; ++i) {
                if (cnt[i] > 0) {
                    ans = ans * 10 + i;
                    cnt[i]--;
                    break;
                }
            }
        }
        for (int i = 0; i < 10; ++i) {
            while (cnt[i]-- > 0) {
                ans = ans * 10 + i;
            }
        }
        return ans;
    }
	
	public long smallestNumberI(long num) {
        if(num == 0){
            return 0;
        }
        boolean isNegative = num < 0;
        num  = num < 0 ? num * -1 : num;
        
        char[] c = String.valueOf(num).toCharArray();
        Arrays.sort(c);
        String str;
        if(!isNegative){
            int non = 0;
            for(; non < c.length; non++){
                if(c[non] != '0'){
                    break;
                }
            }
            char temp = c[non];
            c[non] = c[0];
            c[0] = temp;
            str = new String(c);
        }else{
            str = new String(c);
            StringBuilder sb = new StringBuilder(str);
            str = "-".concat(sb.reverse().toString());
        }
        return Long.valueOf(str);
    }

}
