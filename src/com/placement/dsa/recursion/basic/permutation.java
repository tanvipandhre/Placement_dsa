package com.placement.dsa.recursion.basic;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permute("abc",0);
	}
	public static void permute(String str, int i) {
		if(i==str.length()-1) {
			System.out.println(str);
			return;
		}
		for(int j=i; j<str.length(); j++) {
			str = swap(str, i , j);
			System.out.println("Before recursion call {i = "+i+" { j ="+j+"}");
			permute(str, i+1);
			System.out.println(" recursion call {i = "+i+" { j ="+j+"}");
			str = swap(str, j, i);
		}
		
		
		
	}
	public static String swap(String s, int i, int j) {
		
		char[] ca = s.toCharArray();
		char temp = ca[i];
		ca[i] = ca[j];
		ca[j] = temp;
		
		return new String(ca);
		
	}

}
