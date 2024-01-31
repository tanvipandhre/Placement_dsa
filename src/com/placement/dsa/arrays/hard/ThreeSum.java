package com.placement.dsa.arrays.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//Time O(N^3 * log(No. of triplets)) - inserting triplets in set takes O(logn)
	//space - O(2*no. of triplets) - set, list
	public static List< List < Integer > > triplet_brute(int n, int []arr) {
        // Write your code here.
        Set<List<Integer>> set = new HashSet<>();
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k] == 0){
                        List<Integer> list = Arrays.asList(arr[i],arr[j],arr[k]);
                        Collections.sort(list);
                        set.add(list);
                    }
                    
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;

    }
	
	//better
	//time O(N^2  * log(no. of triplets)) - inserting triplets in set takes O(logn)
	//space - O(2N)  + O(N)
	public static List< List < Integer > > triplet_better(int n, int []arr) {
        // Write your code here.
        Set<List<Integer>> set = new HashSet<>();
        
        for(int i=0;i<n;i++){
            Set<Integer> hashset = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third = 0 - (arr[i] + arr[j]);
                    if(hashset.contains(third)){
                        List<Integer> list = Arrays.asList(arr[i],arr[j],third);
                        Collections.sort(list);
                        set.add(list);
                    }
                    
                hashset.add(arr[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(set);
        return ans;

    }
}
