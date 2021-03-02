package com.demo;

public class DiagonalSum {
	
	
	 public static void main(String[] args) {
		 int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		 System.out.println(diagonalSum(arr));
	 }
	 public static int diagonalSum(int[][] mat) {
	        
	        int m = mat.length;
	        int n = mat[0].length;
	        int sum=0;
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                if(i==j || i+j==m-1)
	                    sum+=mat[i][j];
	            }
	        }
	        
	
	        
	        return sum;
	  }

}
