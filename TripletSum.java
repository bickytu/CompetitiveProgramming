package com.demo;

import java.util.Arrays;

public class TripletSum {
	
	public static void main(String[] args) {
		int[] arr = {998, 550, 557, 562, 628, 468, 542, 130, 241};
		find3Numbers(arr, 9, 793);
	}
	public static boolean find3Numbers(int nums[], int N, int X) { 
	    
	      Integer[] arr = new Integer[N];
	      for(int i=0;i<N;i++)
	         arr[i] = nums[i];
	         
	      Arrays.sort(arr);
	     
	      for(int i=0;i<N-2;i++){
	           int startPointer=i+1, endPointer=N-1;
	          while(startPointer<endPointer){
	              if(arr[i] + arr[startPointer]+arr[endPointer]==X)
	                return true;
	              else if(arr[i] + arr[startPointer]+arr[endPointer]>X)
	                --endPointer;
	              else if(arr[i] + arr[startPointer]+arr[endPointer] < X)
	                ++startPointer;
	          }
	      }
	      return false;
	    
	    }

}
