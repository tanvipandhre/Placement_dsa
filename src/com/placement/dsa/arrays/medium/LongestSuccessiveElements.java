package com.placement.dsa.arrays.medium;

import java.util.Arrays;

public class LongestSuccessiveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int longestSuccessiveElements_brute(int []a) {
        // Write your code here.
        int n = a.length;
        int longest = 1;
        for(int i=0;i<n;i++){
            int x = a[i];
            int count = 1;
            while(linearSearch(a,x+1)){
                
                count++;
                x=x+1;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
	public static boolean linearSearch(int[] a, int num){
        for(int i = 0;i<a.length; i++){
            if(a[i] == num)return true;
        }
        return false;
    }
	
	public static int longestSuccessiveElements_optiml(int []a) {
        // Write your code here.
        
        int n = a.length;
        int longest = 1;
        int secondSmallest = Integer.MIN_VALUE;
        int count = 0;
        Arrays.sort(a);
        for(int i=0; i<n; i++){
            
             if (secondSmallest == a[i]){
               continue;
            }else if(secondSmallest != (a[i]-1)){
                count=1;
                
                secondSmallest = a[i];
            }else if(secondSmallest == (a[i]-1)){
                count++;
                secondSmallest = a[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
