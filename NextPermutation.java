package com.demo;

import java.util.ArrayList;
import java.util.List;

public class NextPermutation {
	
	public static void main(String[] args) {
		int[] arr = {3,2,1};
		nextPermutation(arr.length, arr);
	}

	static List<Integer> nextPermutation(int N, int arr[]){
        
        int count=N-2;
        while(count>=0){
            if(arr[count] < arr[count+1])
             break;
             
            --count; 
        }
        
        if(count<0)
           reverse(arr,0,N-1);
          
        else{
            swap(arr,count);
            reverse(arr,count+2,N-1);
        }
        List<Integer> al = new ArrayList();
        for(int p=0;p<N;p++)
          al.add(arr[p]);
          
        return al;
    }
    public static void swap(int[] arr, int count){
        
        int temp = arr[count];
        arr[count] = arr[count+1];
        arr[count+1] = temp;
    }
    
    public static void reverse(int[] arr, int left, int right){
        
    	while (left < right) { 
            int temp = arr[left]; 
            arr[left++] = arr[right]; 
            arr[right--] = temp; 
        } 
    }
}
