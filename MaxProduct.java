package com.demo;

public class MaxProduct {

	public static void main(String[] args) {
        
        int[] a = {90, 91, -91, 91, -91, -90, 90, 90, -90, -90};
        int n=a.length;
        int size = a.length;
        long max_so_far = 1, max_ending_here = 1;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here * a[i];
            if (max_ending_here == 0)
                max_ending_here = 1;
            else if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
           
        }
        
        max_ending_here=1;
        for (int i = size-1; i > 0; i--)
        {
            max_ending_here = max_ending_here * a[i];
            if (max_ending_here == 0)
                max_ending_here = 1;
            else if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }
        System.out.println(max_so_far);
     
    }
    
}
