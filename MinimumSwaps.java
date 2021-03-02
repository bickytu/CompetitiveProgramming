package com.demo;

public class MinimumSwaps {
	
	public static void main(String[] args) {
		int[] arr = {2, 1, 5, 6, 3};
		System.out.println(minSwap(arr, arr.length,3));
	}
	
	public static int minSwap (int arr[], int n, int k) {
        int noLessthanK =0;
        int positionofK=-1;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]<k)
            ++noLessthanK;
            
            if(arr[i]==k)
               positionofK=i;
        }
        
        if(positionofK!=noLessthanK){
            count = swap(arr,positionofK,noLessthanK,count);
        }
        int startIndex=0, endIndex=n-1;
        
        while(startIndex<noLessthanK){
            
            if(arr[startIndex] > k && arr[endIndex] < k){
                count =swap(arr,startIndex, endIndex, count);
                ++startIndex;
                --endIndex;
            }          
            else if(arr[startIndex] < k)
            	++startIndex;
            else if(arr[endIndex] > k)
            	--endIndex;
            
        }
        
        return count;
    }
    
    public static int swap(int[] arr, int i,int j, int count){
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return count+1;
    }

}
