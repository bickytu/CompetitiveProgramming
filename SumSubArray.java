package com.demo;

import java.util.ArrayList;

public class SumSubArray {
	
	public static void main(String[] args) {
		
		int A[] = {135,101,170,125,79,159,163,65,106,146,82,28,162,92,196,143,28,37,192,5,103,154,93,183,22,117,119,96,48,127,172,
				139,70,113,68,100,36,95,104,12,123,134};

		int N = 42, S = 468;
		ArrayList resp = subarraySum(A,N,S);
		System.out.println(resp.get(0)+" "+resp.get(1));
	}

	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
		int startIndex =0, endIndex = 1;int currentSum= arr[0];ArrayList resp = new ArrayList(2);

		if(s==arr[0]) {
			resp.add(1);
			resp.add(1);
			return resp;
		}
		while(startIndex <n && endIndex < n) {
			if(currentSum ==s) {
				resp.add(startIndex+1);
				resp.add(endIndex+1);
				return resp;
			}
			
			currentSum = currentSum + arr[endIndex];
			if(currentSum > s) {
				currentSum = currentSum- arr[startIndex];
				currentSum = currentSum - arr[endIndex];
			    startIndex++;
			}
			
			else if(currentSum < s) { 
				endIndex++;
			}
		}
		
		System.out.println("Hu" + startIndex+"  "+endIndex);
		resp.add(-1);
		resp.add(-1);
		return resp;
        
    }
}
