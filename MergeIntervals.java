package com.demo;

import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
	
	public static void main(String[] args) {
		int[][] arr = {{1,4},{0,4}};
		merge(arr);
	}

	public static int[][] merge(int[][] intervals) {
	 
		/*
		 * Arrays.sort(intervals,new Comparator<>(){ public int compare(int[] i1,int[]
		 * i2) { return i1[0]-i2[0]; } });
		 */
		
		Arrays.sort(intervals, new Comparator<>(){
			
			public int compare(int[] i1, int[] i2) {
				
				return i1[0] - i2[0];
			}
		});
		int m=intervals.length, n=2;
		int[][] res = new int[m][2];
		res[0][0] = intervals[0][0];
		res[0][1] = intervals[0][1];
		int count=0;
		
		for(int i=1;i<m;i++) {
			boolean changed = false;
			int min = res[count][0];
			int max = res[count][1];
			
			if(intervals[i][0] <= max ) {
				changed = true;
				res[count][0] = Math.min(intervals[i][0],min);
				res[count][1] = Math.max(intervals[i][1],max);
			}
		
			else {
				++count;
				res[count][0] = intervals[i][0];
				res[count][1] = intervals[i][1];
			}
		}
		
		int[][] resp = new int[count+1][2];
		for(int k=0;k<=count;k++) {
			resp[k][0] = res[k][0];
			resp[k][1] = res[k][1];
		}
		return resp;
	}
	
}
