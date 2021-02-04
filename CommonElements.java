package com.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class CommonElements {
	
	public static void main(String[] args) {
		
		int[] A = {1, 5, 10, 20, 40, 80};
		int[] B = {6, 7, 20, 80, 100};
		int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
	}
	
	public static ArrayList commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {

		LinkedHashMap hs = new LinkedHashMap();
		
		for(int i=0;i<n1;i++)
			hs.put(A[i],1);
		
		for(int j=0;j<n2;j++) {
			
			if(hs.containsKey(B[j]))
				hs.put(B[j], 2);
		}
		
		for(int k=0;k<n3;k++) {
			
			if(hs.containsKey(C[k]) && ( (int)hs.get(C[k])==2))
				hs.put(C[k], 3);
		}
		
		ArrayList  ar = new ArrayList();
		Iterator<Map.Entry> userCityMappingIterator = hs.entrySet().iterator();
        while (userCityMappingIterator.hasNext()) {
            Map.Entry<Integer,Integer> entry = userCityMappingIterator.next();
           int key = entry.getKey() ;
            int val = entry.getValue();
            if(val>=3)
            	ar.add(key);
        }
        
        return ar;
           
        }

}
