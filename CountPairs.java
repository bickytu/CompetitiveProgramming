package com.demo;

import java.util.HashMap;

public class CountPairs {

	public static void main(String[] args) {
		
		 int N= 4, K = 6;
		 int arr[] = {1,5,7,1};
		 System.out.println(getPairsCount(arr,N,K));
	}
	
	public static int getPairsCount(int[] arr, int n, int k) {

		HashMap<Integer, Integer> hm = new HashMap<>();
		int len = arr.length;
		for(int i=0;i<len;i++) {
			int count =0;
			if(hm.containsKey(arr[i])) {
				count=hm.get(arr[i]);
				++count;
				hm.put(arr[i], count);
			}
			else {
				++count;
				hm.put(arr[i], count);
			}
		}
		
		int pairsCount =0;
		for(int j=0;j<len;j++) {
		
			int first = arr[j];
			int second = k - first;
			if(hm.containsKey(second)) {
				
				if(first == second) {
					int val = hm.get(first);
					--val;
					int tempCount = (val*(val+1))/2;
					pairsCount += tempCount; 
					hm.remove(first);
				}
				else {
					int firstcount = hm.get(first);
					int secondCount = hm.get(second);
					pairsCount = pairsCount + firstcount + secondCount;
				}
			}
				
			
		}
		/*if(pairsCount%2==0)
			return pairsCount/2;
		else {
			++pairsCount;*/
			return pairsCount/2;
		//}
	}
}
