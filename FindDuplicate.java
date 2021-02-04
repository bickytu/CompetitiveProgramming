package com.demo;

public class FindDuplicate {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,2};
		System.out.println(findDuplicate(arr));
	}

	 public static int findDuplicate(int[] nums) {
	        
		int size = nums.length;
		for(int i=0;i<size;i++) {
			int j = Math.abs(nums[i]);
			
			if(nums[j] > 0)
				nums[j] = -nums[j];
			
			else
				return j;
		}
		return -1;
		 
	 }
}
