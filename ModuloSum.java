package com.demo;

public class ModuloSum {
	
	public static void main(String[] args) {
		System.out.println(Math.pow(10,9)+7);
	}
	 public static long sumUnderModulo(long a, long b){
	        long sum = a+b;
	        double quotient = Math.pow(10,9)+7;
	        long l =(long)quotient;
	        sum= sum /l;
	        
	        return sum;
	    }  

}
