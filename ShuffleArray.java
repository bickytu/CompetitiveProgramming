package com.demo;

public class ShuffleArray {
	
	public static void main(String[] args) {
		int[] arr = {2,5,1,3,4,7};
	    shuffle(arr, 3);	
	}

	public static int[] shuffle(int[] nums, int n) {
        
        int len = nums.length;
        if(len==0)
            return nums;
        
        if(len<n)
            return nums;
        
        int first=1, second=n;
        while(second < len && first<second){
            rightRotate(nums,first,second);
            first = first+2;
            ++second;
        }
        
        return nums;
    }
    
    public static void rightRotate(int[] nums,int first, int second){
        
        int len = nums.length;
        if(first> len || second>len)
            return;
        int temp =nums[second];
        for(int i=second;i>=first+1;i--){
            nums[i] = nums[i-1];
        }
        nums[first] = temp;
    }
}
