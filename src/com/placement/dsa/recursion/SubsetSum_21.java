package com.placement.dsa.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class SubsetSum_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 1, 2};
		int sum = 0;
		HashSet<Integer> list = new HashSet<Integer>();
		subsetSum(0, arr, list, sum);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	
	public static void subsetSum(int i, int[] arr, HashSet<Integer> list, int sum) {
		if(i >= arr.length) {
			list.add(sum);
			return;
		}
		//pickup
		subsetSum(i+1, arr, list, sum+arr[i]);
		
		//not pickup
		subsetSum(i+1, arr, list, sum);
		
	}

}
