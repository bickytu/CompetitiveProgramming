package com.demo;

import java.util.Arrays;

public class SearchRotated {
	
	  public static void main(String[] args) { 
		  
		  int[] arr = {4,5,6,7,0,1,2};
		  int target = 0; 
		  System.out.println(search(arr,target)); 
	  }
	 
	 
	 public static int search(int[] nums, int target) {
	        
	        int len = nums.length;
	        int left=0, right= len-1;
	        int pivot=-1;
	        while(left<=right){
	            
	            int mid = left + (right-left)/2;
	            
	            if(mid >0 && mid < len-1 && nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
	                pivot = mid;
	                break;
	            }
	            else if(target > nums[mid] && target < nums[right]){
	                 left = mid+1;
	            }
	            else{
	                right = mid-1;
	            }
	        }
	        if(target>= nums[0] && target<=nums[pivot]){
	            left =0;
	            right = pivot;
	        }
	        else{
	            left = pivot+1;
	            right = len-1;
	        }
	        
	        int x =Arrays.binarySearch(nums, left, right, target);
	        if(x<0)
	            return -1;
	        else
	            return x;
	    }

}
