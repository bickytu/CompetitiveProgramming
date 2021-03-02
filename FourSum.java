package com.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {
	
	
	public static void main(String[] args) {
		
		int[] arr = {4,6,7,3,2,1,4,7,8,9};
		fourSum(arr,14);
	}
	public static ArrayList fourSum(int[] arr, int target) {
		int len = arr.length;
		Arrays.sort(arr);
		ArrayList al = new ArrayList();
		for(int i=0;i<len-4;i++) {
			if(i>0 && arr[i]==arr[i-1])
				continue;
			for(int j=i+1;j<len-3;j++) {
			  
			  if(j>1 && arr[j]==arr[j-1])
				  continue;
			  
			  int left=j+1, right=len-1;
			  while(left<right) {
				  
				  if(left>j+1 && arr[left]==arr[left]-1) {
					  ++left;
					  continue;
				  }
				  if(right<len-1 && arr[right]==arr[right+1]) {
					  --right;
					  continue;
				  }
				  if(arr[i]+arr[j]+arr[left]+arr[right]==target) {
					  	al.add(arr[i]);
					  	al.add(arr[j]);
					  	al.add(arr[left]);
					  	al.add(arr[right]);
				  }
				  else if(arr[i]+arr[j]+arr[left]+arr[right]<target) {
					  ++left;
				  }
				  else {
					  --right;
				  }
				  
			  }
			}
		}
		return al;
	}

}
