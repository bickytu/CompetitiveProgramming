package com.demo;

public class Demo {

	public static void main(String[] args) {
		System.out.println(Math.pow(10,9)+7);
     System.out.println("GCD :"+gcd());
	}
	
	
	public static int gcd() {
		
		int m=12,n=45,p,q;
		
		if(m > n) {
			p=m;
			q=n;
		}
		else {
			p=n;
			q=m;
		}
		
		int rem =1;
		while(p > 0) {
			rem = p%q;
			
			if(rem==0)
				return q;
			
			else {
				p = q;
			    q = rem;
			}
		}
		
		return -1;
		
		
	}
}
