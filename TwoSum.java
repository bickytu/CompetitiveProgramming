package com.demo;

import java.util.HashMap;

public class TwoSum {
	
	 public static void main(String[] args) {
		 int[] arr = {3,2,4};
		 twoSum(arr,6);
	 }

	 public static int[] twoSum(int[] arr, int target) {
	        
	        HashMap<Integer,Integer> hm = new HashMap<>();
	        int len = arr.length;
	        for(int i=0;i<len;i++)
	            hm.put(arr[i],i);
	        
	        int[] res =  new int[2];
	        for(int j=0;j<len;j++){
	            int temp = target - arr[j];
	            if(hm.containsKey(temp) && (j!=hm.get(temp))){
	                res[0] = j;
	                res[1] = hm.get(temp);
	                return res;
	            }
	        }
	        return res;
	    }
}
