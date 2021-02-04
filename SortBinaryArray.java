package com.demo;

import java.util.Arrays;

public class SortBinaryArray {

	public static void main(String[] args) {
		int[] arr = {1,1,1,1,0,2,0};
	          sort012(arr,7);	
		}

	public static void sort012(int a[], int n){
		
		int zeroes =0, ones=0;
		
		/*
		 * for(int i=0;i<n;i++) { if(a[i] == 0) ++zeroes;
		 * 
		 * else if(a[i] == 1) ++ones;
		 * 
		 * }
		 * 
		 * int sum = ones+zeroes; for(int i=0;i<n;i++) {
		 * 
		 * if(i < zeroes) a[i] =0;
		 * 
		 * else if(i < sum) a[i] = 1;
		 * 
		 * else a[i] = 2; }
		 */
		Arrays.sort(a);
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
}
