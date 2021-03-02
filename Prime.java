package com.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Prime {

	  public List<Integer> findPrimes(int n) {
	   List<Integer> l = new ArrayList();
	    for (int i = 2; i <= n; i++) {
		    if (isPrime(i)) 
		    	l.add(i);
			
	    } 
	    
	    return l;
	  }


	 public static boolean isPrime(int n) {
	if (n <= 1) 
		return false; 

	// Check from 2 to n-1 
	for (int i = 2; i < n; i++) 
		if (n % i == 0) 
			return false; 

	return true; 
	}
	 
	
	 public static List<String> deDuplicate(List<String> list) {
		    HashSet hs = new HashSet();
		    for(int i=0;i<list.size();i++){
		          hs.add(list.get(i));
		    }
		    
		 
		    
		    Iterator value = hs.iterator(); 
		    ArrayList at = new ArrayList();
		    while (value.hasNext()) { 
		         at.add(value.next());
		    } 
		    
		    return at;   
		          
	 }
}
