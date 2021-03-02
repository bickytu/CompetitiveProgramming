package com.demo;

public class MergeForPalindrome {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 4, 5, 1};
		System.out.println(findMinOps(arr,4));
	}
	
	public static int findMinOps(int[] arr, int n) {
		
		if(n==1)
			return 0;
		
		int startIndex =0, endIndex = n-1;
		
		int mergeOps =0;
		while(endIndex > startIndex) {
			
			if(arr[startIndex] < arr[endIndex]) {
				arr[startIndex+1] = arr[startIndex+1] + arr[startIndex];
				++startIndex;
				++mergeOps;
			}
			else if(arr[startIndex] > arr[endIndex]) {
				arr[endIndex-1] = arr[endIndex-1] + arr[endIndex];
				--endIndex;
				++mergeOps;
			}
			else {
				++startIndex; --endIndex;
			}
		}
		return mergeOps;
	}

}
