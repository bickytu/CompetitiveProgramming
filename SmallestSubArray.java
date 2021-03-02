package com.demo;

public class SmallestSubArray {

	public static void main(String[] args) {
		long[] ar = {7};
		System.out.println(sb(ar,1,5));
	}
	
	public static long sb(long a[], long n, long x) {
	       
		   long sum=0;
	       long start=0,end=0;
	       long min=n+1;
	       while(end<n)
	       {
	           
	       while(sum<=x && end<n)
	       {
	           sum+=a[(int)end];
	           end++;
	       }
	       
	       while(sum>x && start<n)
	       {
	           min=Math.min(end-start,min);
	           sum-=a[(int)start];
	           start++;
	       }
	       
	       }
	        
	      return min;
    }
}

