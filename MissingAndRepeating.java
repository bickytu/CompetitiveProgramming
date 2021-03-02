package com.demo;

public class MissingAndRepeating {
	
	public static void main(String[] args) {
		int[] arr = {2,2};
		findTwoElement(arr, 2);
	}
	public static int[] findTwoElement(int arr[], int n) {
        int[] nums = new int[2];
        for(int i=0;i<n;i++){
            
            int temp = Math.abs(arr[i]);
            if(arr[temp-1] <0)
              nums[0] = temp;
            
            if(arr[temp-1] >0)
              arr[temp-1]= -1 * arr[temp-1];
        }
        for(int j=0;j<n;j++){
            if(arr[j]>0)
             nums[1]=j+1;
        }
        return nums;
    }
}
