package com.placement.dsa.recursion.basic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> requests = new ArrayList<String>();
		requests.add("item1");
		requests.add("item2");
		requests.add("item3");
		requests.add("item1");
		requests.add("item3");
		List<String> ans = getLatestKRequests(requests, 3);
		System.out.println(ans);
		
		
	}
	/**
	 * @param requests
	 * @param k
	 * @return
	 */
	public static List<String>  getLatestKRequests(List<String> requests, int k){
		
		List<String> res1 = new ArrayList<String>() ;
		
		for(int i = requests.size()-1;i>=0;i--) {
			if(!res1.contains(requests.get(i)))
				res1.add(requests.get(i));
		}
		
		List<String> res = new ArrayList<String>() ;
		for(int i = 0;i<k;i++) {
			res.add(res1.get(i));
		}
		return res;
	}

}
