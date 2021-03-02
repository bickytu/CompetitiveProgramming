package com.demo;

public class MinimumJumps {
	
	public static void main(String[] args) {
		int[] arr = {2,3,1,1,4};
		System.out.println(minJumps(arr)-1);
	}
	
	static int minJumps(int[] arr){
	       return noOfJumps(arr,0,arr.length-1,0);
	}
	    
	static int noOfJumps(int[] arr, int index, int end,int parent){
	        
	        if(index>=end)
	           return 1;
	        
	        int max = index+arr[index];
	        int min = end+3;
	        for(int i=index+1;i<=max;i++){
	            
	            int tempMin = noOfJumps(arr,i,end,arr[index]);
	            if(tempMin<=min)
	              min = tempMin;
	        }
	        
	        return min+1;
	        
	}

}
