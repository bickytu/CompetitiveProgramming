package com.demo;

import java.util.Arrays;

public class FindPivotInSortedArray {

	public static void main(String[] args) {
		int[] arr = {5,1,3};
		System.out.println(search(arr,5));
	}
	static int binarySearch(int arr[], int low, int high, int key) 
    { 
        if (high < low) 
            return -1; 
  
        /* low + (high - low)/2; */
        int mid = (low + high) / 2; 
        if (key == arr[mid]) 
            return mid; 
        if (key > arr[mid]) 
            return binarySearch(arr, (mid + 1), high, key); 
        return binarySearch(arr, low, (mid - 1), key); 
    } 
	public static int search(int[] nums, int target) {
        
        int len = nums.length;
        
        
        if(nums[len-1]>=nums[0]){
            int y= Arrays.binarySearch(nums,target);
            if(y<0)
                return -1;
            else
                return y;
        }
        int left=1, right= len-2;
        
        int pivot=findPivot(nums,len);
        
        if(target==nums[pivot])
            return pivot;
        
        if(target>= nums[0] && target < nums[pivot]){
            left =0;
            right = pivot;
        }
        else{
            left = pivot+1;
            right = len-1;
        }
        
        int x =binarySearch(nums, left, right, target);
        if(x<0)
            return -1;
        else
            return x;
    }
	public static int findPivot(int[] arr, int n) {
		
		int left=0, right=n-1;
		
		int pivot=-1;
		while(left<=right) {
			
			int mid = left + (right-left)/2;
			
			if(mid > left && arr[mid-1] > arr[mid]) {
				pivot = mid-1;
				break;
			}
			if(mid < right && arr[mid] > arr[mid+1]) {
				pivot = mid;
				break;
			}
			if(arr[left]>= arr[mid]) {
				right =mid-1;
			}
			else {
				left = mid+1;
			}
		}
		
		return pivot;
	}
	
}
