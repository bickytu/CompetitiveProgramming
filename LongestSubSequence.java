package com.demo;

import java.util.Arrays;
import java.util.HashSet;

public class LongestSubSequence {

	public static void main(String[] args) {
		int[] arr = {1, 9, 3, 10, 4, 20, 2};
		findLongestConseqSubseq(arr, 7);
	}
	
	static int findLongestConseqSubseq(int arr[], int N) {
		
		HashSet<Integer> hs = new HashSet();
		
		for(int j:arr)
			hs.add(j);
		
		int maxSequenceSoFar =0;
		int currentMax = 0;
		for(int i=0;i<N;i++) {
		    
			int temp = arr[i];
			boolean isTempPresent = true;
			currentMax =0;
			while(isTempPresent) {
				
				if(!hs.contains(temp-1) && !hs.contains(temp)) {
					isTempPresent = false;
				}
				
				else if(hs.contains(temp-1)) {
					temp = temp-1;
				}
				else if(hs.contains(temp)) {
					
					++currentMax;
					if(currentMax > maxSequenceSoFar)
						maxSequenceSoFar = currentMax;
					
					hs.remove(temp);
					temp = temp+1;
				}
				
					
			}
		}
		
		System.out.println(maxSequenceSoFar);
		return maxSequenceSoFar;
	}
	
}
