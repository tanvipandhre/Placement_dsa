package com.placement.dsa.leetcode.sdesheet.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Input: numRows = 1
Output: [[1]]
 * 
 */
public class PascalsTriangle {
	//own solution
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listOfLists = new ArrayList<>();
        for(int i=0; i<numRows ; i++){
            Integer[] arr = new Integer[i+1];
            arr[0] = 1;
            arr[arr.length-1] = 1;
            for(int j= 1; j<arr.length-1; j++){
                arr[j] = listOfLists.get(i-1).get(j-1) +  listOfLists.get(i-1).get(j) ;
                System.out.println("i="+i+" arr[j]="+arr[j]);
            }
            
            List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
            listOfLists.add(list);
        }
        return listOfLists;
    }
	/*
	//striver solution 
	//any one term is asked = n-1 C r-1 
	// complexity = o(n)
	 * 
	 * whole line is asked O(n^2)
	*/
	 List<List<Integer>> listOfList = new ArrayList<>();
     List<Integer> row, prev= null;
     for(int i = 0; i<numRows; i++){
         row = new ArrayList<Integer>();
         for(int j = 0;j<=i; j++){
             if(j==0 || j==i)
                 row.add(1);
             else{
                     int term = prev.get(j-1) + prev.get(j);
                     row.add(term);
             }
                 
         }
         prev = row;
         listOfList.add(row);
     }
}
