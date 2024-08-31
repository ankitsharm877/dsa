package cardinalHealth;

import java.util.Arrays;

public class Round1 {

	public static void main(String[] args) {
		// Write a program using recursion to determine whether the given input String is a palindrome or not.
		
		String str = "abcba";
		//System.out.println(isPalindrome(str));
		
		//A Magic Number is a number which is equal to the product of the sum of all digits of a number and reverse of the sum. 
		//This is also known as Ramanujan Number or Taxicab Number. For Example, 1729 is a Magic Number. 
		//Sum of all digits is 19, the reverse of the Sum is 91, and Product of these numbers 19 * 91 is equal to the original number (19 * 91 = 1729). 
		//In this program, let’s print the Ramanujan Number
		
		int num = 1730;
		//System.out.println(magicNumber(num));
		
		//Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. 
		//For example, in an array A:
		 
		//Example :
		 
//		Input: A[] = {-7, 1, 5, 2, -4, 3, 0} 
//		Output: 3 
//		3 is an equilibrium index, because: 
//		A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
//		 
//		Input: A[] = {1, 2, 3} 
//		Output: -1
//		 
//		Write a function int equilibrium(int[] arr, int n); 
		//that given a sequence arr[] of size n, returns an equilibrium index (if any) or -1 if no equilibrium indexes exist.
		int A[] = {-7, 1, 5, 2, -4, 3, 0};
		//int A[] = {1, 2, 3};
		System.out.println(equilibrium(A, A.length));
	}
	
	public static int equilibrium(int[] arr, int n) {
		int[] leftSum = new int[n];
		leftSum[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			leftSum[i] = leftSum[i - 1] + arr[i];
		}
		
		int[] rightSum = new int[n];
		rightSum[arr.length - 1] = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; i--) {
			rightSum[i] = rightSum[i + 1] + arr[i];
		}
		
		System.out.println(Arrays.toString(leftSum));
		System.out.println(Arrays.toString(rightSum));
		
		for (int i = 0; i < n; i++) {
			if ((leftSum[i] - arr[i]) == (rightSum[i] - arr[i])) {
				return i;
			}
		}
		return -1;
	}
	
	public static boolean magicNumber(int num) {
		int sumOfDigit = 0;
		int x = num;
		
		while (x != 0) {
			sumOfDigit += x % 10;
			x = x / 10;
		}
		
		x = sumOfDigit;
		int reverse = 0;
		while (x != 0) {
			reverse = reverse * 10 + (x % 10);
			x = x / 10;
		}
		
		System.out.println(sumOfDigit);
		System.out.println(reverse);
		
		return (sumOfDigit * reverse) == num;
	}
	
//	public static boolean isPalindrome(String str) {
//		if (str.length() == 1) {
//			return true;
//		}
//		
//		char fc = str.charAt(0); // a, b, c, b
//		char lc = str.charAt(str.length() - 1);
//		if (fc == lc) {
//			return true;
//		} else {
//			
//		}
//		boolean result = isPalindrome(str.substring(1, str.length() - 1)); // bcba, cba, bc, c
//		
//	}
}
	
