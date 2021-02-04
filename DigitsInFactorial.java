package com.demo;

public class DigitsInFactorial {

	
	    public static void main(String[] args) {
	    	System.out.println(digitsInFactorial(8468));
	    }
	    public static int digitsInFactorial(int N){
	       double fact=1d;
	       for(int i=2;i<=N;i++)
	         fact = fact *i;
	         
	        System.out.println(fact);
	       
	        String str = String.valueOf(fact);
	        
	        if(str.contains("E")) {
	        	String prev = str.substring(0,str.indexOf("."));
	        	String len = str.substring(str.indexOf("E")+1);
	        	
	        	return prev.length()+Integer.parseInt(len);
	        }
	        else {
	            String tempString = str.contains(".") ? str.substring(0,str.indexOf(".")) : str;
	        	return tempString.length();
	        }
	        
	   }
	
}
