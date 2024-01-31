package com.placement.dsa.bitwise;

import java.util.ArrayList;

public class powerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static ArrayList<String> subsequences(String str) {
        // Write your code here
        int n = str.length();
        ArrayList<String> list = new ArrayList<String>();
        int pSize = (1<<n);//powerset size is 2^n which is found by left shift 1 by n
        for(int i=0; i<pSize;i++){
            String s = "";
            for(int j=0;j<n;j++){
                if((i & (1<<j)) != 0) 
                    s = s + str.charAt(j);
            }
            if(s.length() != 0) list.add(s);
        }
        return list;


    }

}
