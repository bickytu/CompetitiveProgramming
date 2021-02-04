package com.demo;

public class LCMOfNNumbers {
	
	public static void main(String[] args) {
		System.out.println(getSmallestDivNum(20));
	}
	public static long getSmallestDivNum(int n){
        
		long lcm=1L;
		for(int i=2;i<=n;i++) {
			lcm = calculateLcm(lcm,Long.valueOf(i));
		}
		
		return lcm;
    }
  
	public static long calculateLcm(long a, long b) {
		return (a*b)/calculateGcd(a, b);
	}
	
	public static long calculateGcd(long a, long b){
        
        if(a==b)
         return a;
         
        long larger=1L, smaller =1L;
        
        if(a > b){
          larger = Long.valueOf(a);
          smaller = Long.valueOf(b);
        }
        else{
          larger = Long.valueOf(b);
          smaller = Long.valueOf(a);
        }
        
        long rem = 1L;
        
        while(rem > 0){
            
            rem = larger % smaller;
            larger = smaller;
            
            if(rem==0)
              return smaller;
            
            smaller = rem;
        }
        
        return smaller;
    }
}


