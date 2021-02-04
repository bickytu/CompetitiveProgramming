package com.demo;

public class SmallestPositive {

	
	public static void main(String[] args) {
		int[] arr = {0,-10,1,3,-20};
		int smallestPositive = findSmallestPositive(arr,5);
		System.out.println(smallestPositive);
	}
	
	public static int findSmallestPositive(int[] arr, int size) {
		
		int last =0,largest=0;
		
		for(int i=1;i<size;i++) {
			
			if(arr[i] >= 0) {
				
				if(arr[i] > largest)
					largest = arr[i];
				
				if(arr[last] > 0) {
					if(arr[i] - arr[last]!=1)
						return arr[last]+1;
				}
				else
					++last;
			}
		}
		
		
		return arr[size-1]+1;
	}
}
