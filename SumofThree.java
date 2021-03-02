package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumofThree {
	
	 public static void main(String[] args) {
		 
		 int[] arr = {1,1,0};
		 System.out.print(threeSum(arr,-100));
	 }
	
	 public static int threeSum(int[] arr, int target) {
		    
         int N= arr.length;
         int diff=target, sum=0;
         
         if(N<3)
           return diff;
     
	      Arrays.sort(arr);
         
	      int startPointer=0, endPointer=0;
	      for(int i=0;i<N-2;i++){
             
             if(i>=1 && arr[i] ==arr[i-1])
                 continue;
             
	          startPointer=i+1; endPointer=N-1;
            
	          while(startPointer<endPointer){
                 if (startPointer > i + 1 && arr[startPointer] == arr[startPointer - 1]) {
                       startPointer++;
                       continue;
                 }
                 if (endPointer < N - 1 && arr[endPointer] == arr[endPointer + 1]) {
                       endPointer--;
                       continue;
                 }
                 
                 int currentDiff=0;
                 if(target >=0){
                     currentDiff =target- (arr[i] + arr[startPointer]+arr[endPointer]);
                 }
                    
	              else {
                      currentDiff =(arr[i] + arr[startPointer]+arr[endPointer]) - target;
                      diff = Integer.MAX_VALUE;
                 }   
                 if(currentDiff<=diff){
                    sum = arr[i] + arr[startPointer]+arr[endPointer];
                    ++startPointer;
                    --endPointer;
                 }
                
	              else if(arr[i] + arr[startPointer]+arr[endPointer]>0)
	                --endPointer;
	              else if(arr[i] + arr[startPointer]+arr[endPointer] < 0)
	                ++startPointer;
	          }
	      }
	      return sum;
   }
	      
   
}
