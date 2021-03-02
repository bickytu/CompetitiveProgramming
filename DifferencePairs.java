package com.demo;

import java.util.Arrays;

public class DifferencePairs {
	
	 public static void main(String[] args) {
		 int[] arr = {3,1,4,1,5};
		 System.out.println(findPairs(arr,2));
	 }
	 public static int findPairs(int[] nums, int k) {
	        
	        int len=nums.length, count=0;
	        int start=0, end=1;
	        Arrays.sort(nums);
	        while(end<len){
	            
	            if(Math.abs(nums[start]-nums[end])==k){
	                if(start>0 && nums[start]==nums[start-1])
	                	start++;
	                else{
	                	++start;
	                	 ++count;
	                }
	               
	            }
	            else{
	                 ++end;                
	            }
	            
	        }
	        return count;
	    }

}
