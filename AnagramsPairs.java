package com.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramsPairs {
	
	public static void main(String[] args) {
		
		String arr[] = {"bfj","tro","ffa","rph"};
		List<List<String>> ft = Anagrams(arr);
	}
	
	public static List<List<String>> Anagrams(String[] string_list) {
		
		HashMap<String, List> hm = new HashMap();
		int len=string_list.length;
		
		for(int i=0;i<len;i++) {
		    char[] ch = string_list[i].toCharArray();
		    Arrays.sort(ch);
			String key = new String(ch);
			
			if(hm.containsKey(key)) {
				hm.get(key).add(string_list[i]);
			}
			else {
				ArrayList ar = new ArrayList();
				ar.add(string_list[i]);
				hm.put(key, ar);
			}
		}
		
	    List<List<String>> res = new ArrayList();
	    
	    for(int j=0;j<len;j++) {
	    	char[] ch1 = string_list[j].toCharArray();
		    Arrays.sort(ch1);
			String key = new String(ch1);
	    	ArrayList al = (ArrayList) hm.get(key);
	    	if(al!=null && al.size() >1) {
	    		res.add(al);
	    		hm.remove(key);
	    	}
	    }
	    return res;
		    
	}

}
