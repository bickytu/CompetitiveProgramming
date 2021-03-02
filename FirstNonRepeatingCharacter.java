package com.demo;

import java.util.LinkedHashMap;

public class FirstNonRepeatingCharacter {
	
	public static void main(String[] args) {
		
	}
	static char nonrepeatingCharacter(String S)
    {
		char[] ch = S.toCharArray();
		LinkedHashMap<Character,Integer>  hm = new LinkedHashMap<>();
		
		int len= ch.length;
		
		for(int i=0;i<len;i++) {
			
			if(hm.containsKey(ch[i])) {
				hm.put(ch[i], hm.get(ch[i])+1);
			}
			else {
				hm.put(ch[i], 0);
			}
		}
		
		for(char k : hm.keySet()) {
			
			int val = hm.get(k);
			if(val==1)
				return k;
		}
		return 'a';
    }

}
