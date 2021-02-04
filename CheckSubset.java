package com.demo;

import java.util.HashSet;
import java.util.Scanner;

public class CheckSubset {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCases = Integer.parseInt(sc.nextLine());
		
		for(int l=0;l<testCases;l++) {
		String sizes = sc.nextLine();
		int size1 = Integer.parseInt(sizes.split(" ")[0]);
		int size2 = Integer.parseInt(sizes.split(" ")[1]);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		String[] s11 = s1.split(" ");
		String[] s22 = s2.split(" ");
		int len1 = s11.length;
		int len2 = s22.length;
		
		int[] arr1 = new int[len1];
		int[] arr2 = new int[len2];
		
		for(int i=0;i<len1;i++)
			arr1[i] = Integer.parseInt(s11[i]);
		
		for(int i=0;i<len2;i++)
			arr2[i] = Integer.parseInt(s22[i]);
		
		boolean val = isSubset(arr1,arr2,len1,len2);
		if(val)
			System.out.println("Yes");
		else
			System.out.println("No");
		}
		
		
	}

	public static boolean isSubset(int arr1[], int arr2[], int m, int n) {

		HashSet<Integer> hset = new HashSet<>(); 

		for (int i = 0; i < m; i++) { 
			if (!hset.contains(arr1[i])) 
				hset.add(arr1[i]); 
		} 

		for (int i = 0; i < n; i++)  {
			if (!hset.contains(arr2[i])) 
				return false; 
		} 
		return true; 
	} 
}
