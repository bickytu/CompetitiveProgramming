package com.demo;

import java.util.Arrays;

public class ProductExceptSelf {

	 public static void main(String[] args) {
		 int[] arr = {1,2,3,4};
		 productExceptSelf(arr);
	 }
	 public static int[] productExceptSelf(int[] nums) {
	        
	        int len = nums.length;
	        int[] product = new int[len];
	        Arrays.fill(product,1);
	        for(int i=1;i<len;i++)
	            product[i] = product[i-1]*nums[i-1];
	        
	        int prevSuffixProd=1;
	        for(int j=len-1;j>=0;j--) {
	        	 product[j] = product[j] * prevSuffixProd;
	        	 prevSuffixProd = prevSuffixProd * nums[j];
	        }
	           
	        
	        return product;
	 }
}
