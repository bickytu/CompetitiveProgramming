package com.demo;

public class Median {


	public static void main(String[] args) {
		
		int[] arr1= {1,2};
		int[] arr2 = {3,4};
		System.out.println(5/2.0);
		//System.out.print(findMedianSortedArrays(arr1, arr2));
	}
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int m= nums1.length, n= nums2.length;
        int len = m+n;
        int[] arr = new int[len];
        int i=0,j=0,count=0;
        
        while(i<m && j <n){
            
          if(nums1[i] >= nums2[j]){
              arr[count] = nums2[j];
              ++count;
              ++j;
          }
          else{
              arr[count] = nums1[i];
              ++count;
              ++i;
          }
        }
        
        while(i<m){
            arr[count] = nums1[i];
            ++count;
            ++i;
        }
        while(j<n){
            arr[count] = nums2[j];
            ++count;
            ++j;
        }
        
        if(len%2==0) 
        	return (arr[len/2] + arr[(len/2)-1])/2.0d;
        else
        	return (double)arr[(len/2)];
    }
}