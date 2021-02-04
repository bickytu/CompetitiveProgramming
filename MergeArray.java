package com.demo;

public class MergeArray {
	
	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,0,0,0};
		int arr2[] = {2,5,6};
	    merge(arr1,3,arr2,3);
	    
	}
	
	public static void merge(int[] arr1, int m, int[] arr2, int n) {
		
		int i=m-1,j=n-1;
		
		while(j>=0) {
			
			int last = i;
			if(arr2[j] < arr1[last]) {
				
				int temp = arr2[j];
				arr2[j] = arr1[i];
				boolean placedAtRightPosition = false;
				while(!placedAtRightPosition) {
					
					if(last >=1 && arr1[last-1] > temp) {
						arr1[last] = arr1[last-1];
						--last;
					}
					else {
						arr1[last] = temp;
						placedAtRightPosition = true;
					}
				}
				--j;
			}
			else
				--j;
		}
	}

}
