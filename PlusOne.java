package com.demo;

public class PlusOne {

public static void main(String[] args) {
	int[] arr = {9};
	plusOne(arr);
}
public static int[] plusOne(int[] digits) {
    
    int len = digits.length;
    int carry=0;
    int[] arr = new int[len+1];
    int start=len-1;
    int count=0;
    
    while(start>=0){
        
        if(start==len-1){
            int x = digits[start]+1;
            arr[count++] = x%10;
            carry=x/10;
        }
        else{
            int x = arr[start]+carry;
            arr[count++] = x%10;
            carry=x/10;
        }
        --start;
    }
    if(carry!=0)
        arr[len] = carry;
    
    reverse(arr,len+1);
    return arr;
}

static void reverse(int a[], int n) 
{ 
    int[] b = new int[n]; 
    int j = n; 
    for (int i = 0; i <n; i++) { 
        b[j - 1] = a[i]; 
        j = j - 1; 
    } 
 
} 

}