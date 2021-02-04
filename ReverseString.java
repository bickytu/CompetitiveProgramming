package com.demo;

public class ReverseString {
	
	public static void main(String[] args) {
	 System.out.print(reverseWord("Geeks"));	
	}

	public static String reverseWord(String str){
	    
		int len = str.length();
		char[] ch = str.toCharArray();
		
		for(int i=0;i<len/2;i++) {
			char temp = ch[i];
			ch[i] = ch[(len-1)-i];
			ch[(len-1)-i] = temp;
		}
		  
		return String.valueOf(ch);
	}
}
