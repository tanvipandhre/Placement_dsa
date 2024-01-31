package com.placement.dsa.bitwise;

import java.util.*;

public class oddOccurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 3, 3, 4, 4, 4 };
		int odd = missingNumber_naive(5, arr);
		System.out.println(odd);
	}
// time - O(n^2)
	public static int missingNumber_naive(int n, int[] arr) {
		// Write your code here.
		for (int i = 0; i < n; i++) {
			
			
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j])
					count++;
			}
			
			if ((count & 1) != 0) {

				return arr[i];
			}
				
		}
		return 1;
	}
	//time - O(n) using xor
	 public static int missingNumber_better(int n, int []arr){
	        // Write your code here.
	        int res = 0;
	        for(int i = 0; i<arr.length;i++){
	            res = res ^ arr[i];
	        }
	        return res;
	    }
	 
	 //Two odd occurences
	//naive //time - O(n^2) 
	 public static int[] twoOddNum(int []arr){
	        // Write your code here.
	        
	        List<Integer> list = new ArrayList<Integer>();
	        for(int i = 0;i<arr.length;i++){
	            int count=0;
	            for(int j = 0; j< arr.length; j++){
	                if(arr[i] == arr[j]) count++;
	            }
	            if((count & 1) != 0){
	                list.add(arr[i]);
	            }
	        }
	        int[] resArr = new int[list.size()];
	        for(int j=0;j<list.size();j++){
	            resArr[j] = list.get(j);
	        }
	        return resArr;
	  }
	 
	 //time - O(N)
	 public static int[] twoOddNum_optimized(int []arr){
	        // Write your code here.
	        
	        int x = 0;
	        for(int i=0;i<arr.length;i++){
	            x = x^arr[i];
	        }
	        int k = x & (~(x-1));
	        int res1=0, res2=0;
	        for(int i=0;i<arr.length;i++){
	            if((k & arr[i]) !=0 )
	                res1 = res1^arr[i];              
	            else 
	                res2 = res2^arr[i];
	                
	            

	        }
	        return new int[]{Math.max(res1, res2), Math.min(res1, res2)};

	    }
}
