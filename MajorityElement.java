package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement {
	
	public static void main(String[] args) {
		int[] arr = {3,4,5,6,6,6,6,7};
		majorityElement(arr);
	}

public static List<Integer> majorityElement(int[] nums) {
    
    HashMap<Integer, Integer> hm = new HashMap<>();
    
    int size = nums.length;
    for(int i=0;i<size;i++){
        
        if(hm.containsKey(nums[i]))
            hm.put(nums[i], hm.get(nums[i])+1);
        else
            hm.put(nums[i],1);
    }
    
    ArrayList al = new ArrayList();
    for(int key : hm.keySet()){
    	
	        int val = hm.get(key);
	        if(val>size/3)
	            al.add(key);
    }
    
    return al;
}

}
