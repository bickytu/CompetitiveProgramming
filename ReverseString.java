package com.demo;

public class ReverseString {
	
	public static void main(String[] args) {
		String str = "i.like.this.program.very.much";
		reverseWords(str);
	}
	
	static String reverseWords(String S) {
        String[] str = S.split("\\.");
        int len = str.length;
        
        for(int j=0;j<len/2;j++){
            String temp = str[j];
            str[j] =  str[(len-1)-j];
             str[(len-1)-j] = temp;
        }
        
        String res="";
        for(int i=0;i<len;i++)
        res=res+str[i]+".";
        
        int len2= res.length();
        String r = res.substring(0,len2-1);
        return r;
    }

}
