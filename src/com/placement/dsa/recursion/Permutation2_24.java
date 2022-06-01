package com.placement.dsa.recursion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Permutation2_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4};
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<>();
		
		permutes(0, arr, ans);
		
		Iterator itr = ans.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}


	}
	
	public static void permutes(int ind, int[] arr, List<List<Integer>> ans) {
		if(ind == arr.length) {
			List<Integer> list = new ArrayList<>();
			for(int i = 0; i<arr.length; i++) {
				list.add(arr[i]);
			}
			ans.add(new ArrayList<>(list));
			return;
		}
		for(int i = ind; i < arr.length; i++) {
			swap(i, ind, arr);
			permutes(ind + 1, arr, ans);
			swap(i, ind, arr);
		}
		
		
		
	}
	
	public static void swap(int i, int j, int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
