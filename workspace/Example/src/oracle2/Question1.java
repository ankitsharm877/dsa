package oracle2;

public class Question1 {

	public static void main(String[] args) {
		//Max possible product of any two integer in an array
		int[] nums = {1,2,3,4,5};
		maxProduct(nums, nums.length);
	}
	
	public static void maxProduct(int[] arr, int n) {
		if (n < 2) { 
            System.out.println("No pairs exists"); 
            return; 
        } 
       
        if (n == 2) { 
            System.out.println(arr[0] + " " + arr[1]); 
            return; 
        } 
       
        // Initialize maximum and second maximum 
        int posa = Integer.MIN_VALUE, 
            posb = Integer.MIN_VALUE; 
       
        // Initialize minimum and second minimum 
        int nega = Integer.MIN_VALUE,  
            negb = Integer.MIN_VALUE; 
       
        for (int i = 0; i < n; i++) { 
            // Update maximum and second maximum 
            // if needed 
            if (arr[i] > posa) {
                posb = posa; 
                posa = arr[i]; 
            } else if (arr[i] > posb) {
                posb = arr[i]; 
            }
       
            // Update minimum and second minimum  
            // if needed 
            if (arr[i] < 0 && Math.abs(arr[i]) > Math.abs(nega)){ 
                negb = nega; 
                nega = arr[i]; 
            } else if(arr[i] < 0 && Math.abs(arr[i]) > Math.abs(negb)) {
                negb = arr[i]; 
            }
        } 
       
        if (nega * negb > posa * posb) {
            System.out.println("Max product pair is {" + nega + ", " + negb + "}"); 
        } else {
            System.out.println("Max product pair is {" + posa + ", " + posb + "}");
        }
	}

}
