package com.demo;

public class MoveAllNegative {

	public static void main(String[] args) {
		int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		int len = arr.length;
		int startIndex = 0, endIndex = len -1;

		while(startIndex < endIndex) {
			
			if(arr[startIndex] > 0) {
				
				if(arr[endIndex] < 0) {
					int temp = arr[startIndex];
					arr[startIndex] = arr[endIndex];
					arr[endIndex] = temp;
					++startIndex;
					--endIndex;
				}
				else
					--endIndex;
			}
			else
				++startIndex;
		}
		
		for(int i=0;i<len;i++)
			System.out.print(arr[i]+"\t");
	}
}
