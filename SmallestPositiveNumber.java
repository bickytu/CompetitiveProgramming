package com.demo;

public class SmallestPositiveNumber {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		int lastPositiveIndex = segregate(arr,5);
		System.out.println(findMissing(arr, lastPositiveIndex));
		/*
		 * for(int j=0;j<5;j++) System.out.println(arr[j]);
		 */
	}
	
	static int findMissing(int arr[], int last)
    {
       int count =0,i=0,temp=0;
       while(count<=last) {
    	   
    	   temp = arr[i];
    	   if(temp <= last) {
    		   int p = arr[temp];
    		   arr[temp] = -999;
    		   
    		   if(i!=p && p >= 0)
    			   i=p;
    		   else
    			   ++i;
    	   }
    	   else
    		   ++i;
    	   
    	   ++count;
       }
       
       for(int j=0;j<=last;j++) {
    	   if(arr[j]!=-999)
    		   return j;
       }
      
       return arr[last]+1;
    }
	
	
	public static int segregate(int[] arr, int size) {
		
		int i=0,j=size-1;
		
		
		while(i<j) {
			
			if(arr[i] < 0 && arr[j] > 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			else if(arr[j] < 0)
				j--;
			
			else if(arr[i] >= 0)
				++i;
		}
		return i;
	}

}
