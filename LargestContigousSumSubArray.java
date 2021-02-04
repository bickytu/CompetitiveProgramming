package com.demo;

public class LargestContigousSumSubArray {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,-2,5};
	    System.out.print(maxSubarraySum(arr, arr.length));
	}

	public static int maxSubarraySum(int arr[], int n){
        
        int max_so_far=arr[0], max_ending_here=arr[0];
        
        for(int i=1;i<n;i++) {
        	
        	max_ending_here +=arr[i];
        	if(max_ending_here < 0)
        		max_ending_here =0;
        	
        	else if( max_ending_here > max_so_far)
        		max_so_far = max_ending_here;
        }
        
        return max_so_far;
        		
    }
}
