package com.placement.dsa.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CombinationSum2_usingUniqueSubsequence_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 1, 1, 2, 2};
		int sum = 4;
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> set = new ArrayList<>();
		combinationSum(0, list, arr, sum , set);
		
		Iterator<List<Integer>> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
	public static void combinationSum(int ind, List<Integer> list, int[] arr, int target, List<List<Integer>> set) {
		if(target == 0) {
			set.add(new ArrayList<>(list));
		}
		
		for(int i = ind ; i < arr.length ; i++ ) {
			if(i > ind && arr[i] == arr[i-1]) 
				continue;
			if(arr[i] > target) //
				break;
			list.add(arr[i]);
			combinationSum(i+1, list, arr, target - arr[i], set );
			list.remove(list.size() - 1);
		}
	}

}
