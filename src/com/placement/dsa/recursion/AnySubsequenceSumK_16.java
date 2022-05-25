package com.placement.dsa.recursion;

import java.util.ArrayList;

public class AnySubsequenceSumK_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		int[] arr = {1,2,1};
		int n = 3; // size
		int k = 2; // expected sum
		ArrayList<Integer> list = new ArrayList<Integer>();
		//printSubseqenceWithSumK(0, list, arr, n, k);
		printAnySubsequenceWithSumk(0, list, 0, k, arr, n);
		
	}
	public static boolean printAnySubsequenceWithSumk(int i, ArrayList<Integer> list, int s, int sum, int[] arr, int n) {
		if(i>=n ) {
			//condition satisfied
			if( s == sum) {
				for(Integer ii : list) {
					System.out.print(ii);
				}
				System.out.println();
				return true;
			}
			//condition not satisfied
			return false;
		}
		else {
			list.add(arr[i]);
			s += arr[i];
			
			if(printAnySubsequenceWithSumk(i+1, list, s, sum, arr, n)) return true;
			s -= arr[i];
			list.remove(list.size() - 1);
			if(printAnySubsequenceWithSumk(i+1, list, s, sum, arr, n)) return true;
		}
		
		return false;
	}
	

}
