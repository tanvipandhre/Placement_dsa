package com.placement.dsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Permutation_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3};
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> ans = new ArrayList<>();
		boolean[] freq = new boolean[arr.length];
		permutes(arr, freq, list, ans);
		
		Iterator itr = ans.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
	
	public static void permutes(int[] arr, boolean[] freq, List<Integer> list, List<List<Integer>> ans) {
		if(list.size() == arr.length) {
			ans.add(new ArrayList<>(list));
			return;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(!freq[i]) {
				list.add(arr[i]);
				freq[i] = true;
				permutes(arr, freq, list, ans);
				
				list.remove(list.size() - 1);
				freq[i] = false;
			}
			
		}
	}

}
