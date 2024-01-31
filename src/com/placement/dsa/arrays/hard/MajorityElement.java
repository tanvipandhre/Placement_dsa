package com.placement.dsa.arrays.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public static List< Integer > majorityElement_brute(int []v) {
        // Write your code here
        List<Integer> ans = new ArrayList<Integer>();
        int n = v.length;
        for(int i=0;i<n;i++){
            int x = v[i];
            if(!ans.contains(x)){
                
                int count = 0;
                for(int j=0; j<n;j++){
                    if(i==j) continue;
                    if(x == v[j]){
                        count++;
                    }
                }
            if(count>=(n/3)) ans.add(x);
            }
            
        }
        return ans;
    }
	
	 public static List< Integer > majorityElement_better(int []v) {
	        // Write your code here
	        List<Integer> ans = new ArrayList<Integer>();
	        int n = v.length;
	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        for(int i=0;i<n;i++){
	            
	            
	            int count = map.getOrDefault(v[i], 0);
	            map.put(v[i], count+1);        
	            
	            
	            
	        }
	        for(Map.Entry<Integer, Integer> ele:map.entrySet()){
	            if(ele.getValue() > (n/3)) ans.add(ele.getKey());
	        }
	        
	        return ans;
	    }
	 
	 //Moore's voting algo
	 public static List< Integer > majorityElement(int []v) {
	        // Write your code here
	        List<Integer> ans = new ArrayList<Integer>();
	        int n = v.length;
	        int ele1 = Integer.MIN_VALUE;
	        int ele2 = Integer.MIN_VALUE;
	        int count1 = 0;
	        int count2=0;

	        for(int i=0;i<n;i++){
	            if(count1==0 && ele2 != v[i]){
	                count1=1;
	                ele1 = v[i];
	            }
	            else if(count2==0 && ele1 != v[i]){
	                count2=1;
	                ele2 = v[i];
	            }

	            if(v[i]==ele1) count1++;
	            else if(v[i]==ele2) count2++;
	            else {count1--; count2--;}
	        }
	        int count11 = 0;
	        int count22 = 0;
	        for(int i=0;i<n;i++){
	            if(v[i]==ele1) count11++;
	            if(v[i]==ele2) count22++;
	            
	        }
	        if(count11>(n/3)) ans.add(ele1);
	        if(count22>(n/3)) ans.add(ele2);
	        
	        return ans;
	    }
	

}
