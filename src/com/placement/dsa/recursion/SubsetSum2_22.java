package com.placement.dsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SubsetSum2_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 2, 2, 3, 3};
		Arrays.sort(arr);
		List<Integer> list = new ArrayList<Integer>();
		HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
		subsets(0, arr, list, set);
		
		Iterator<ArrayList<Integer>> itr = set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());

	}
	
	public static void subsets(int ind, int[] arr, List<Integer> list, HashSet<ArrayList<Integer>> set) {
		
		set.add(new ArrayList<Integer>(list));
		
		for(int i = ind; i< arr.length ; i++) {
			if(i != ind && arr[i] == arr[i-1]) 
				continue;
			list.add(arr[i]);
			subsets(i+1, arr, list, set);
			list.remove(list.size() - 1);
		}
		
	}

}
