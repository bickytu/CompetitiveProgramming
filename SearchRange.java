package com.demo;

import java.util.Arrays;

public class SearchRange {
	
	public static void main(String[] args) {
		int[] arr = {5,7,7,8,8,10};
		System.out.println(searchRange(arr,6)[0]);
	}
	public static int[] searchRange(int[] nums, int target) {
        
        if(nums.length==1 && nums[0] ==target){
            int[] a = {0,0};
            return a;
        }
        
        int[] arr ={-1,-1};
        int left=0, right=nums.length-1;
       
        while(left<=right){
            int mid = left +(right-left)/2;
            
            if(nums[mid] == target){
                int x =mid;
                while(x>=0 && nums[x]==target)
                    --x;
                arr[0] = x+1;
                while(mid < nums.length && nums[mid] ==target)
                    ++mid;
                
                arr[1] = mid-1;
                return arr;
                
            }
            else if(target < nums[mid]){
                right=mid;
            }
            else{
                left = mid+1;
            }
        }
        
        return arr;
    }

}
