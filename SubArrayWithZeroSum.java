package com.demo;

import java.util.HashSet;

public class SubArrayWithZeroSum {

	
	public static void main(String[] args) {
		
		int[] arr = {4,2,-3,1,6};
		System.out.println(Math.abs(-3));
		//System.out.println(findsum(arr,5));
	}
	
	static boolean findsum(int arr[],int n)
	{
	   HashSet<Integer> hs = new HashSet();   
	   
	   int sum=0;
	   for(int i=0;i<n;i++) {
		   sum+= arr[i];
		   if(hs.contains(sum))
			   return true;
		   else
			   hs.add(sum);
	   }
	   return false;
	}
}
