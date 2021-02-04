package com.demo;

public class MoveByOne {

	public static void main(String[] args) {
		
		int[] arr = {4,5,90,2,3};
		
		int len = arr.length;
		int temp =arr[len-1];
		
		for(int i=len-1;i>0;i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		
		for(int a: arr)
			System.out.print(a+"\t");
	}
}
