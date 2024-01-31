package com.placement.dsa.arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int majorityElement_brute(int []v) {
        // Write your code here
        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
        for(int i=0;i<v.length;i++){
            int count = map.getOrDefault(v[i], 0);
            map.put(v[i], count+1);
        }
        for(Map.Entry<Integer, Integer> it:map.entrySet()){
            if(it.getValue() > (v.length/2)) return it.getKey();
        }
        return 0;
    }
	//Moore's Voting Algorithm
	public static int majorityElement_optimal(int []v) {
        // Write your code here
		int element = v[0];
        int count = 0;
        int n = v.length;
        for (int i=0; i<n;i++){
            if(count == 0) {
                count = 1;
                element=v[i];
            }
            if(v[i] == element) count++;
            else count--;
            
        }
        //verifying element is in majority
        int count1=0;
        for(int i=0;i<n;i++){
            if(element==v[i]) count1++;
        }
        if(count1>(n/2)) return element;
        return 0;
       
    }
	

}
