package com.demo;

import java.util.Stack;

public class SortStack {
	public Stack<Integer> sort(Stack<Integer> s)
	{
		int size = s.size();
		int[] arr = new int[size];
		int count=0;
		while(!s.isEmpty()){
		    arr[count] = (int)s.pop();
		    ++count;
		}
		bubbleSort(arr);
		
		for(int i=0;i<size;i++)
		s.push(arr[i]);
		return s;
	}
	
	public static void bubbleSort(int[] arr) {  
	        int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
	  
	 }
}
