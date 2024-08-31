package array.qus19;

import java.util.ArrayList;

public class CommonEleInSortedArray {

	public static void main(String[] args) {
		int n1 = 6, A[] = {1, 5, 10, 20, 40, 80};
		int n2 = 5, B[] = {6, 7, 20, 80, 100};
		int n3 = 8, C[] = {3, 4, 15, 20, 30, 70, 80, 120};
		System.out.println(commonElements(A, B, C, n1, n2, n3));
	}
	
	static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
		int n = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
        ArrayList<Integer> out = new ArrayList<>();
        int x = 0;
        int y = 0; 
        int z = 0;
        for (int i = 0; i < n; i++) {
        	if (x >= n1 || y >= n2 || z >= n3) {
        		break;
        	}
            if ((A[x] == B[y]) && (A[x] == C[z])) {
            	if (!out.contains(A[x])) {            		
            		out.add(A[x]);
            	}
                x++;y++;z++;
            } else {
               int max = Math.max(Math.max(A[x], B[y]), C[z]);
               while (x < n1 && A[x] < max) x++;
               while (y < n2 && B[y] < max) y++;
               while (z < n3 && C[z] < max) z++;
            }
        }
        return out;
	}

}
