package com.placement.dsa.recursion;

import java.util.ArrayList;

public class SubsequenceSumK_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,1};
		int n = 3; // size
		int k = 2; // expected sum
		ArrayList<Integer> list = new ArrayList<Integer>();
		//printSubseqenceWithSumK(0, list, arr, n, k);
		printSubsequenceWithSumk(0, list, 0, k, arr, n);
		

	}
	public static void printSubsequenceWithSumk(int i, ArrayList<Integer> list, int s, int sum, int[] arr, int n) {
		if(i>=n ) {
			if( s == sum) {
				for(Integer ii : list) {
					System.out.print(ii);
				}
				System.out.println();
				return;
			}
		}
		else {
			list.add(arr[i]);
			s += arr[i];
			
			printSubsequenceWithSumk(i+1, list, s, sum, arr, n);
			s -= arr[i];
			list.remove(list.size() - 1);
			printSubsequenceWithSumk(i+1, list, s, sum, arr, n);
		}
		
		
	}
	/*public static void printSubseqenceWithSumK(int i, ArrayList<Integer> list, int[] arr, int n, int k) {
		int sum = 0;
		if(i==n) {
			for(Integer printSub: list) {
				sum += printSub;
				
			}
			if(sum == k) {
				for(Integer printSub: list) {
					System.out.print(printSub);
					
				}
			}
			
			System.out.println("");
			return;
			
		}
		//take condition
		list.add(arr[i]);
		printSubseqenceWithSumK(i+1, list, arr, n,k);
		list.remove(list.size() - 1);
		//not take condition
		printSubseqenceWithSumK(i+1, list, arr, n, k);
	}*/

	
}
