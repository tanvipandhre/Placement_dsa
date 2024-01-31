package com.placement.dsa.graph;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.next();
		String r = "";
		for(int i = s.length()-1 ; i >= 0; i--) {
			r += s.charAt(i);
			
		}
		if(r.equalsIgnoreCase(s)) 
			System.out.println("It's a palindrome");
		else
			System.out.println("no palindrome");
		
		
	}

}
