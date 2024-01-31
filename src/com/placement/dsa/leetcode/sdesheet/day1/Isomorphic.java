package com.placement.dsa.leetcode.sdesheet.day1;
/*
 * Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. 
No two characters may map to the same character, but a character may map to itself.


Input: s = "egg", t = "add"
Output: true

//Input: s = "foo", t = "bar"
Output: false

Input: s = "paper", t = "title"
Output: true
 */
import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
	public boolean isIsomorphic(String s, String t) {
        boolean flag = false;
        if(s.length() != t.length())
            flag = false;
        else{
            Map<Character, Character> map1 = new HashMap<Character, Character>();
            for(int i = 0; i<s.length() ; i++){
                Character sc = s.charAt(i);
                Character tc = t.charAt(i);
                if(!map1.containsKey(sc) ){
                    
                    if(map1.containsValue(tc)){
                        flag = false;
                        break;
                    }
                        
                    else{
                        map1.put(sc, tc);
                        flag = true;
                    }
                        
                }
                    
                else{
                    if(tc == map1.get(sc)){
                        flag = true;
                    }else{
                        flag = false;
                        break;
                    }
                        
                }
            }
           

        }
         return flag;
    }
}
