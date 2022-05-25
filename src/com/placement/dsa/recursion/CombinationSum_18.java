package com.placement.dsa.recursion;

import java.util.ArrayList;

public class CombinationSum_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 3, 6, 7};
		int sum = 7;
		ArrayList<Integer> list = new ArrayList<Integer>();
		combinationSum(0, list, arr, sum );
		

	}
	public static void combinationSum(int i, ArrayList<Integer> list, int[] arr, int target) {
		if(i >= arr.length) {
			if(target == 0) {
				for(Integer ii : list) {
					System.out.print(ii);
				}
				System.out.println();
				return;
			}
		}
		else {
			
			if(arr[i] <= target) {
				list.add(arr[i]);
				combinationSum(i, list, arr, target-arr[i]);
				list.remove(list.size() - 1);
			}
			
			
			
			combinationSum(i+1, list, arr, target);
			
			
		}
	}

}
