package com.demo;

import java.util.Scanner;

public class LargeFactorial {

	public static void main (String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	    
	    int t = sc.nextInt();
	   
	    
	    for(int k=0;k<t;k++){
	        int n = sc.nextInt();
    		int size =1;
    		int[] arr = new int[500];
    		arr[0] =1;
    		for(int i=1;i<=n;i++){
    		    size = calFactorial(arr,i, size);
    		}
    		
    		for(int j=size-1;j>=0;j--)
    		  System.out.print(arr[j]);
    		  
    		System.out.println();
	    }
	}
	
	public static int calFactorial(int[] arr, int i, int size){
	    int carry=0;
	    for(int j=0;j<size;j++){
	        int prod = arr[j] * i + carry;
	        arr[j] = prod %10;
	        carry = prod/10;
	    }
	    
	    while(carry!=0){
	        arr[size] = carry%10;
	        carry = carry/10;
	        ++size;
	    }
	    
	    return size;
	}
}
