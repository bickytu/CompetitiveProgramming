package com.demo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class RearrangeArray {
	
	public static void main(String[] args) {
		
		Integer arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
	//output: arr[] = {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0} 
		arrange(arr);
	}
	
	public static void arrange(Integer[] arr) {
		int len = arr.length;
		
		int negativeCount=0;
		for(int i=0;i<len;i++) {
			if(arr[i]<0)
				++negativeCount;
		}
		
		if(len-negativeCount>=negativeCount) {
			Arrays.sort(arr);
			int i=1,j=0;
			j= negativeCount+1;
			
			int temp=0;
			while(i<negativeCount) {
				if(arr[i] < 0) {
					temp=arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i+=2;
					j+=2;
				}
			}
		}
		else { 
			Arrays.sort(arr,Collections.reverseOrder());
			int i=0,j=0;
			j= len-negativeCount+1;
			
			int temp=0;
			while(i<len-negativeCount) {
				if(arr[i] > 0) {
					temp=arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					i+=2;
					j+=2;
				}
			}
		}
		
	}

}
