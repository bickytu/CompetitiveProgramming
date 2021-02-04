package com.demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		int[] arr = {2,60,9,5,6};
		
		StringBuffer sb = new StringBuffer();
		for(int no:arr) {
		    sb = getString(sb,no);
		}
			
		System.out.println(sb.toString());
	}
	
	private static StringBuffer getString(StringBuffer sb, int no) {
		
		String s1 = sb.toString();
		String s2 = String.valueOf(no);
		
		if(Integer.parseInt(s1 + s2) > Integer.parseInt(s2+s1))
			return new StringBuffer((s1+s2));
		
		else
			return new StringBuffer((s2+s1).toString());

	}


}
