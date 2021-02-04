package com.demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Interval{
	int start;
	int end;
	Interval(int start,int end){
		this.start = start;
		this.end = end;
	}
}
public class OverlappingIntervals {
	
	public static void main(String[] args) {
		
	int[][] arr = {{0,3},{5,9},{7,14}};

	LinkedList<Interval> l1 = new LinkedList();
	
	for(int[] each:arr) {
		l1.add(new Interval(each[0],each[1]));
	}
	
	Collections.sort(l1, new Comparator<Interval>() {

		@Override
		public int compare(Interval o1, Interval o2) {
			return o1.start - o2.start;
		}
		
	});
	
	LinkedList<Interval>  result = new LinkedList();
	
	for(Interval iv : l1) {
		
		if(result.isEmpty() || result.getLast().end < iv.start)
			result.add(iv);
		else
			result.getLast().end = Math.max(result.getLast().end, iv.end);
	}
	
	for(Interval a:result) {
		System.out.print(a.start+"\t"+a.end+"\n");
	}
}
}
