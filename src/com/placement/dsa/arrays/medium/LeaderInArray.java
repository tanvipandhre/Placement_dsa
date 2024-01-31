package com.placement.dsa.arrays.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static List< Integer > superiorElements_brute(int []a) {
        // Write your code here.
        int n = a.length;
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i =0 ;i<n;i++){
            boolean flag = true;
            for(int j=i+1;j<n;j++){

                if(a[i] <= a[j]){
                    flag = false;
                    break; 
                }
                
                
            }
            if(flag) list.add(a[i]);
            
        }
        Collections.sort(list);
        return list;
    }
	
	public static List< Integer > superiorElements_optimal(int []a) {
        // Write your code here.
        int n = a.length;
        List<Integer> list = new ArrayList<Integer>();
        int max = Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(a[i]>max){
                max=Math.max(a[i], max);
                list.add(max);
            }
        }
        Collections.sort(list);
        return list;
    }
	

}
