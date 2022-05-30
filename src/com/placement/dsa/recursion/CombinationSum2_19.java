package com.placement.dsa.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CombinationSum2_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 1, 1, 2, 2};
		int sum = 4;
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<ArrayList<Integer>>set = new HashSet<ArrayList<Integer>>();
		combinationSum(0, list, arr, sum , set);
		System.out.println();
		
		Iterator<ArrayList<Integer>> itr = set.iterator();
		while( itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
	public static void combinationSum(int i, ArrayList<Integer> list, int[] arr, int target, HashSet<ArrayList<Integer>> set ) {
		if(i >= arr.length) {
			if(target == 0) {
				/*for(Integer ii : list) {
					System.out.print(ii);
				}
				System.out.println();*/
				set.add(new ArrayList<Integer>(list));
				return;
			}
		}
		else {
			
			if(arr[i] <= target) {
				list.add(arr[i]);
				combinationSum(i+1, list, arr, target-arr[i], set);
				list.remove(list.size() - 1);
			}
			
			
			
			combinationSum(i+1, list, arr, target, set);
			
			
		}
	}



}
