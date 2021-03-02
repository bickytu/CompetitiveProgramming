package com.demo;

public class TrappingWater {
	
	public static void main(String[] args) {
		int[] arr = {3,0,0,2,0,4};
		trappingWater(arr, 6);
	}
	public static int trappingWater(int height[], int n) { 
        
		 int len= height.length;
	        if(len==0)
	            return 0;
	        
	        int startIndex=0, endIndex=0;
	        int area=0;
	        int tempArea =0;
	        
	        for(int i=1;i<len;i++){
	            
	            if(height[i]==0)
	                continue;
	            
	            if(height[i] >= height[startIndex] || height[i] >= height[endIndex]){
	                 
	                if(height[startIndex]>= height[endIndex]){
	                    tempArea = Math.min(height[startIndex], height[i]) * (i-startIndex);
	                    tempArea -=height[endIndex];
	                    
	                    if(tempArea > area){
	                        area = tempArea;
	                        endIndex = i;
	                    }
	                }
	                else{
	                    tempArea = Math.min(height[endIndex], height[i]) * (i-endIndex); 
	                    startIndex= endIndex;
	                    
	                    if(tempArea > area){
	                        area = tempArea;
	                        startIndex = endIndex;
	                        endIndex=i;
	                    }
	                }
	            }
	            else{
	                
	                int area1= Math.min(height[startIndex], height[i]) * (i-startIndex)-1;
	                int area2= Math.min(height[endIndex], height[i]) * (i-endIndex)-1; 
	                
	                if(area1>= area2 && area1 >= area){
	                    area = area1;
	                    endIndex = i;
	                }
	                else if(area2> area1 && area2> area){
	                    area = area2;
	                    startIndex= endIndex;
	                    endIndex=i;
	                }
	                
	            }
	            
	             
	        }
	        return area;    
    } 

}
