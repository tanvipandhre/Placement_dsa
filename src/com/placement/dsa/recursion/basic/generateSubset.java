package com.placement.dsa.recursion.basic;

import java.util.ArrayList;
import java.util.List;

public class generateSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//subset("abc","",0);
		 List<String> list = new ArrayList<String>();
	     List<String>  res = subset(list, "abc","",0);
	     
	     System.out.println(res);
		
	}
	public static void subset(String str, String curr,  int i) {
		if(i==str.length()) {
			System.out.println(curr);
			return;
		}
		subset(str,curr,i+1); //not taking the character
		subset(str,curr+str.charAt(i), i+1); // taking the character
	}
	//method with list return type
	
    public static List<String> subset(List<String> list, String s, String curr, int i){
        if(i==s.length()){
            list.add(curr);
            return list;
        }
        System.out.println(" sub1 "+curr+"  "+i);
        subset(list, s,curr,i+1);
        System.out.println(" sub2 "+curr+" "+i);
        subset(list, s,curr+s.charAt(i),i+1);
        return list;

    }

}
