package com.demo;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int N = 5, D = 2;
		int hcf = findHcf(N,D);
		System.out.print(hcf+"\t");
		
		if(hcf ==1) {
			for(int i=0;i<D;i++)
				RotateByOne(arr,N);
		}
		else {for(int i=0;i<hcf;i++)
			exchangeElements(arr,i,hcf);
		}
		
		for(int i=0;i<N;i++)
			System.out.print(arr[i]+" ");
	}
	public static void RotateByOne(int[] arr, int n){
		
		int temp= arr[0];
		
		for(int i=1;i<n;i++) {
			arr[i-1] = arr[i];
		}
		
		arr[n-1] = temp;
	}
	public static void exchangeElements(int[] arr,int i,int hcf) {
		int len=arr.length;
		int temp = arr[i];
		int prev=i;
		i=i+hcf;
		
		while(i<len) {
			arr[prev] = arr[i];
			prev = i;
			i = i+hcf;
		}
		arr[prev] = temp;
	}
	public static int findHcf(int i,int j) {
		
		if (i == 0)
		       return j;
		    if (j == 0)
		       return i;
		  
		    // base case
		    if (i == j)
		        return i;
		
		int largest = i >= j ? i : j;
		int smallest = i < j ? i : j;
		
		
		int rem = largest % smallest;
		
		while(rem!=0) {
			
			largest = smallest;
			smallest = rem;
			
			rem = largest % smallest;
		}
		
		return smallest;
	}
}
