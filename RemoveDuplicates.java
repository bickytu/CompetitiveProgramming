package com.demo;

public class RemoveDuplicates {

	
	public static void main(String[] args) {
		int[] A =  {1,2,2};
		int N = A.length;
		
		for(int i=0;i<N-1;i++) {
			if(A[i] ==A[i+1])
				A[i] = -909;
		}
		
		int count=0;
		for(int n:A) {
			if(n!=-909) {
			System.out.print(n+" ");
			++count;
			}
		}
		System.out.println(count);
	}
}
