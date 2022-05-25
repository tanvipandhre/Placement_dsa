package com.placement.dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequence_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,1,2};
		int n = 3;
		ArrayList<Integer> list = new ArrayList<Integer>();
		printSubseqence(0, list, arr, n);

	}
	public static void printSubseqence(int i, ArrayList<Integer> list, int[] arr, int n) {
		if(i==n) {
			for(Integer printSub: list) {
				System.out.print(printSub);
			}
			//for last case
			if(list.size() == 0) {
				System.out.println("{}");
			}
			System.out.println("");
			return;
			
		}
		//take condition
		list.add(arr[i]);
		printSubseqence(i+1, list, arr, n);
		list.remove(list.size() - 1);
		//not take condition
		printSubseqence(i+1, list, arr, n);
	}

}
