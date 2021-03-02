package com.demo;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
	
	 public static void main(String[] args) {
		 int arr[] = {10,2};
		 largestNumber(arr);
	 }
	 public static String largestNumber(int[] nums) {
	        int len = nums.length;
	        Integer[] arr = new Integer[len];
	        
	        for(int i=0;i<len;i++)
	            arr[i] = nums[i];
	        
	        Arrays.sort(arr, new Comparator<>(){
	            
	            @Override
	            public int compare(Integer i1, Integer i2){
	                String s1 = String.valueOf(i1);
	                String s2 = String.valueOf(i2);
	                
	                if(Integer.parseInt(s1+s2) >= Integer.parseInt(s2+s1))  
	                    return -1;
	                else
	                    return +1;
	            }
	        });
	        
	        String str="";
	        for(int i=0;i<len;i++)
	           str = str+arr[i];
	        
	        return str;
	    }

}
