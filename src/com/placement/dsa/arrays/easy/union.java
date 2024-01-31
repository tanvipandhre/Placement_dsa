package com.placement.dsa.arrays.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class union {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4, m = 5;
		int[] arr1 = {3,4,6,6};
		int[] arr2 = {1,2,3,7,7};
		System.out.println("List1");
		ArrayList<Integer> list = FindUnion_sol1(arr1,arr2,4,5);
		for(int i = 0;i< list.size(); i++) {
			System.out.print(" "+list.get(i));
		}
		System.out.println();
		System.out.println("List2");
		ArrayList<Integer> list2 = FindUnion_sol2(arr1,arr2,4,5);
		for(int i = 0;i< list2.size(); i++) {
			System.out.print(" "+list2.get(i));
		}
		System.out.println();
		System.out.println("List3");
		ArrayList<Integer> list3 = FindUnion_sol3(arr1,arr2,4,5);
		for(int i = 0;i< list3.size(); i++) {
			System.out.print(" "+list3.get(i));
		}
		
		
	}
	//solution1 - Hashmap
	//Time complexity O(m+n)lg(m+n) To add a number in map it takes O(lgn) so n numbers will take o(nlgn)
	//space complexity O(m+n)
	
	public static ArrayList<Integer> FindUnion_sol1(int[] a1, int[] a2, int n, int m) {
		ArrayList<Integer> Union = new ArrayList<Integer>();
		HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
		for(int i = 0; i<n ; i++) {
			freq.put(a1[i], freq.getOrDefault(a1[i], 0)+1);
		}
		for(int i = 0; i<m; i++) {
			freq.put(a2[i], freq.getOrDefault(a2[i], 0)+1);
		}
		for(int k : freq.keySet()) {
			Union.add(k);
		}
		return Union;
	}
	//solution2 - HashSet
	//Time - O(m+n)lg(m+n)
	//space - O(m+n)
	public static ArrayList<Integer> FindUnion_sol2(int[] a1, int[] a2, int n, int m) {
		ArrayList<Integer> Union = new ArrayList<Integer>();
		HashSet<Integer> freq = new HashSet<Integer>();
		for(int i = 0; i<n ; i++) {
			freq.add(a1[i]);
		}
		for(int i = 0; i<m; i++) {
			freq.add(a2[i]);
		}
		for(int k : freq) {
			Union.add(k);
		}
		return Union;
	}
	//solution 3 - 2 pointers
	//Time - O(m+n)
	//space - O(1)
	public static ArrayList<Integer> FindUnion_sol3(int[] a1, int[] a2, int n, int m){
		ArrayList<Integer> Union = new ArrayList<Integer>();
		int i = 0, j=0;
		while(i<n && j<m) {
			//if the last element is  < = or not present in Union then insert a1[i]
			if(a1[i] <= a2[j]) {
				if(Union.size() == 0 || Union.get(Union.size()-1) != a1[i]) {
					Union.add(a1[i]);
				}
				i++;
			} else {
				if(Union.size() == 0 || Union.get(Union.size()-1) != a2[j]) {
					Union.add(a2[j]);
				}
				j++;
			}
		}
		System.out.println("hello");
		while(i<n) {
			if(Union.get(Union.size()-1) != a1[i]) {
				Union.add(a1[i]);
				
			}
			i++;
		}
		
		while(j<m) {
			if( Union.get(Union.size()-1) != a2[j]) {
				Union.add(a2[j]);
				
			}
			j++;
		}
		return Union;
	}
	

}
