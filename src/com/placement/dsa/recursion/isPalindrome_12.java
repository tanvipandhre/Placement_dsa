package com.placement.dsa.recursion;

import java.util.Scanner;

public class isPalindrome_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter str");
		String str = sc.next();
		boolean b = isPalindrome(str, 0);
		if(b)
			System.out.println("string is palindrome");
		else
			System.out.println("string is not palindrome");
		

	}
	public static boolean isPalindrome(String str, int i) {
		if(i >= str.length()/2)
			return true;
		System.out.println(str.charAt(i)+" ******"+ str.charAt(str.length() - i -1));
		
		if(str.charAt(i) != str.charAt(str.length() - i -1))
			return false;
		else {
			
			return isPalindrome(str, i+1);
		}
					
			
	} 

}
