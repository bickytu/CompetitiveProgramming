package com.demo;

public class Search2D {
	
	public static void main(String[] args) {
		int[][] arr = {
				{1,2,2,2,3,5,7},
				{9,10,13,15,15,16,19},
				{21,21,23,23,26,26,27},
				{29,29,31,31,33,34,35}};
				//34 35 35 35 36 36 36 37 38 40 41 44 45 45 48 48 51 52 53 53 57 57 58 59 59 59 61 63 64 65 67 68 69 70 70 70

		
		search(arr,31);
	}
	
	static boolean search(int matrix[][], int x) 
	{  
		 int n= matrix.length;
		 int m = matrix[0].length;
	    int searchRow=0,col=m-1;
	    boolean found=false;
	    for(int i=0;i<n;i++){
	        if(matrix[i][col] >=x) {
	            searchRow=i;
	            found = true;
	            break;
	        }   
	    }
	    if(!found)
	       return false;
	    
	    for(int j=0;j<m;j++){
	        if(matrix[searchRow][j]==x)
	          return true;
	    }
	    
	    return false;
	}

}
